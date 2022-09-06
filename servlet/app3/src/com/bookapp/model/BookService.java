package com.bookapp.model;
import java.util.*;

public class BookService {

	public List<String> getAllBooks(String topic){
		List<String> books=new ArrayList<String>();
		if(topic.equalsIgnoreCase("Java")) {
			books.add("head first");
			books.add("https://www3.ntu.edu.sg/home/ehchua/programming/index.html");
		}else if(topic.equalsIgnoreCase("sringboot")) {
			books.add("spring boot in actions");
			books.add("java brain");
		}else if(topic.equalsIgnoreCase("react")) {
			books.add("react doc");
			books.add("youtube geeky");
		}
		
		return books;
	}
	
}

