package com.wipro.webcrawler;

import java.util.ArrayList;
import java.util.List;

public class SeedLink {
	public static void main(String[] args){
		List<Crawler> crawler=new ArrayList<Crawler>();
		crawler.add(new Crawler("https://wiprodigital.com/"));
		SearchLink searchlink=new SearchLink(crawler);
		searchlink.search();
		
	}

}
