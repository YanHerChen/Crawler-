import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import org.omg.CORBA.Current;

public class Main {
	private final static int SemaphoreNumber = 10;
	PageManager pm;
	Main() throws Exception {
		pm = new PageManager();
		Start();
	}

	public static void main(String[] args) throws Exception {
		Main SP = new Main();
	}

	private void Start() {
		//執行緒池
		ExecutorService exec = Executors.newCachedThreadPool();
		//同步數量
		final Semaphore semp = new Semaphore(SemaphoreNumber);
		
		/* 
		 * web = 要載的web數量
		 */
		for (int web = 0; web < pm.url.length; web++) {
			Runnable run = new Runnable() {
				public void run() {
					try {
						Thread.sleep((long) Math.random());
						semp.acquire();
						/*
						 * Thread.currentThread().getName()
						 * 為了將讀取資料貼標籤
						 * 以作儲存時辨識
						 */
						Crawler crawler = new Crawler(pm,Thread.currentThread().getName());
						semp.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			exec.execute(run);
		}
		exec.shutdown();
	}
}