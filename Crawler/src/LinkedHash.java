import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash {
	static Map<String, String> lhm = new LinkedHashMap<String, String>();


	public static void setData(String name, String data) {
		put(name, data);
	}

	private static void put(String name, String data) {
		lhm.put(name, get(name) + "\n\r" + data);
	}

	public static String get(String name) {
		if (lhm.get(name) == null)
			return "";
		else
			return lhm.get(name);
	}
}
