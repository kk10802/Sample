import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parsing {
	public static void main(String[] args) throws IOException {
		Document doc = 
				Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=651673&weekday=wed").get(); 
		String title = doc.title();
		System.out.println(title);
		
		Elements es = doc.select("td.title > a");
		for(int i = 0; i < es.size(); i++) {
			Elements e = es.get(i);
			String s = e.text();
			System.out.println(s);
			
			String href = e.attr("href");
			System.out.println(href);
		}
		
	}

}
