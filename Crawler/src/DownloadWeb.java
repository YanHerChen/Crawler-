import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DownloadWeb {
	public static void download(String name) throws IOException {
		BufferedWriter fw = null;
		File file = new File("D:/Apple/"+fn.getn()+".html");

		fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
		fw.write(LinkedHash.get(name));

		fw.flush();
		fw.close();
		System.gc();
	}
}

class fn{
	//只是輸出的檔案名稱
	private static int n=0;
	public static int getn(){
		return n++;
	}
}