import java.util.concurrent.atomic.AtomicInteger;

public class PageManager {
	private static AtomicInteger number;
	public static String[] url = {"http://www.appledaily.com.tw/realtimenews/article/hot/20170924/1210262/%E3%80%90%E8%B6%85%E7%8A%AF%E8%A6%8F%E3%80%91%E5%90%B3%E4%BA%9E%E9%A6%A8%E8%BA%AB%E6%9D%90%E6%9C%89%E5%A4%9A%E8%BE%A3%E3%80%80%E4%B8%80%E5%BC%B5%E7%85%A7%E7%89%87%E5%91%8A%E8%A8%B4%E4%BD%A0%EF%BC%81",
			"http://www.appledaily.com.tw/realtimenews/article/hot/20170924/1209893/%E3%80%90%E6%82%9A%E3%80%91%E5%A5%B3%E5%AD%90%E5%9C%A8%E4%BA%BA%E7%BE%A4%E4%B8%AD%E8%84%AB%E8%A4%B2%E5%AD%90%E3%80%80%E4%B8%8B%E4%B8%80%E7%A7%92%E9%9B%99%E8%85%BF%E9%96%93%E6%8E%89%E5%87%BA%E5%AC%B0%E5%85%92",
			"http://www.appledaily.com.tw/realtimenews/article/hot/20170924/1209903/%E7%9C%BC%E9%8F%A1%E6%AD%A3%E5%A6%B9%E4%B8%8B%E9%9D%A2%E6%B2%92%E7%A9%BF%E6%90%AD%E9%9B%BB%E8%BB%8A%E3%80%80%E7%B6%B2%E5%8F%8B%EF%BC%9A%E9%9C%87%E7%B2%BE%E4%BA%86",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170924/1210201",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170924/1210257",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170925/1210350",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170925/1210465",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170925/1210351",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170923/1209656",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170923/1209883",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170923/1207294",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170923/1209549",
			"http://www.appledaily.com.tw/column/article/528/rnews/20170923/1209418",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211030",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211056",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211045",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211025",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211247",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211183",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211170",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211010",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211126",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211123",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211097",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211060",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211053",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211044",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211042",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211040",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1211029",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1210862",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1210756",
			"http://www.appledaily.com.tw/realtimenews/article/sports/20170926/1210732"};
	PageManager(){
		setPage();
	}
	
	public static String Nextpage() {
		return url[getPage()];
	}

	private static int getPage() {
		return number.getAndIncrement();
	}
	
	//ªì©l¤Æ
	private static void setPage(){
		number = new AtomicInteger(0);
	}
}
