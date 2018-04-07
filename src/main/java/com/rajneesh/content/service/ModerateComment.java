package com.rajneesh.content.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.rajneesh.content.util.InvalidComment;

@Component
public class ModerateComment {

	
	public Boolean superviseComment(String comment) { 
	List<String> list = InvalidComment.listOfInvalidWords;//get Arrays.asList("Apple", "Orange", "Banana");
	   boolean match = list.stream().anyMatch(comment::contains);
	   System.out.println(match);
	   return match;
	}
	
	public List<String> getInvalidWord(){
		return InvalidComment.listOfInvalidWords;
	}
			
		
}
