package com.knewin.www.principal;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Principal {

	public static void main(String[] args) {
		
		try {
            Document doc = Jsoup.connect("https://www.infomoney.com.br/mercados/").get();
            Elements body = doc.getElementById("infiniteScroll")
            		.getElementsByTag("span");
            
            for (int i = 0; i < 30; i++) {
				Element notice = body.get(i);
			    System.out.println(notice.getElementsByTag("a").attr("href"));
				System.out.println(notice.select("span.hl-hat").text());
				System.out.println(notice.getElementsByTag("a").attr("title"));
			}


        } catch (IOException e) {
            e.printStackTrace();
        }

}



}

