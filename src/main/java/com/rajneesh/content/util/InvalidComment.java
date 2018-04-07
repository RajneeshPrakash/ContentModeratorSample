package com.rajneesh.content.util;

import java.util.Arrays;
import java.util.List;


public class InvalidComment {

	
	public final static List<String> listOfInvalidWords= Arrays.asList("abuse", "slang", "fake", "cheat");;
			
		
}

//
//package com.rajneesh.content.controller;
//
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rajneesh.content.service.ModerateComment;
//
//@RestController
//public class CommentController {
//
//	
//	@Autowired
//	ModerateComment moderateCommentService;
//	
//	@RequestMapping( value="/comment", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String moderate(@RequestBody String comment) {
//    	if(moderateCommentService.superviseComment(comment))
//    		return "Your Comment is approved";
//    	else
//    		return "Your Comment has malicious intent, So rejected";
//    }
//    
//	@RequestMapping(value="/fetch", method = RequestMethod.GET)
//    public List<String> getInvalidWords() {
//    	return moderateCommentService.getInvalidWord();
//    }
//    
//}
