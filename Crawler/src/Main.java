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
		//�������
		ExecutorService exec = Executors.newCachedThreadPool();
		//�P�B�ƶq
		final Semaphore semp = new Semaphore(SemaphoreNumber);
		
		/* 
		 * web = �n����web�ƶq
		 */
		for (int web = 0; web < pm.url.length; web++) {
			Runnable run = new Runnable() {
				public void run() {
					try {
						Thread.sleep((long) Math.random());
						semp.acquire();
						/*
						 * Thread.currentThread().getName()
						 * ���F�NŪ����ƶK����
						 * �H�@�x�s�ɿ���
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