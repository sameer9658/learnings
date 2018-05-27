package goldmansac;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedIpAddress {

	public static void main(String[] args) {
		String str1 = "10.0.0.2 - frank [10/Oct/2000:13:55:36" + " -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String str2 = "10.0.0.1- frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String str3 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";
		String str4 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";
		String[] lines = { str1, str2, str3,str4 };
		System.out.println(getMostRepeatedIp(lines));

	}
	private static String getMostRepeatedIp(String[] logs) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : logs) {
			String ip = str.split("-")[0];
			if (map.containsKey(ip)) {
				int count = map.get(ip);
				map.put(ip, count + 1);  

			} else {
				map.put(ip, 1);
			}
		}
		String mostRepeatedIp = "";
		int maxCount = Integer.MIN_VALUE;
		for (String currentIp : map.keySet()) {
			int val = map.get(currentIp);
			if (val > maxCount) {
				maxCount = val;
				mostRepeatedIp = currentIp;
			}
		}
		return mostRepeatedIp;
	}

}
