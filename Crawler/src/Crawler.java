import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Crawler{
	private URL u = null;
	private InputStream in = null;
	private InputStreamReader r = null;
	private BufferedReader br = null;
	private String message = null;
	private PageManager pm;
	private String label;
	
	Crawler(PageManager pm,final String label) {
		this.pm = pm;
		this.label = label;
		Crawl(pm.Nextpage());
	}

	public void Crawl(String url) {
		try {
			u = new URL(url);
			in = u.openStream();
			r = new InputStreamReader(in, "UTF-8");
			br = new BufferedReader(r);
			while ((message = br.readLine()) != null) {
				LinkedHash.setData(label,message);
			}
			DownloadWeb.download(label);
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try {
				u = null;
				in.close();
				r.close();
				br.close();
			} catch (Exception e) {
			}
		}
	}
}