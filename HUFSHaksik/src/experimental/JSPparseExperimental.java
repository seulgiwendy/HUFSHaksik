package experimental;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import java.util.HashMap;


public class JSPparseExperimental {
	
	public static void main (String args[]) throws Exception{
		
		HashMap resultTable = new HashMap();
		
		String targetURL = "https://webs.hufs.ac.kr/jsp/HUFS/cafeteria/m/todayMenu.jsp?campus=H1&gubun=B";
		Document doc = Jsoup.connect(targetURL).get();
		Elements menus = doc.select("div.caf_rep");
		Elements timePrice = doc.select("div.caf_times");
		String result = doc.toString();
		String newResult = menus.text();
		String time = timePrice.text();
		System.out.println(newResult);
		System.out.println(time);
		
		
		
	}

}
