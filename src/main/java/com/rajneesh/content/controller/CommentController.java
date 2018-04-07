package com.rajneesh.content.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajneesh.content.service.ModerateComment;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	ModerateComment moderateCommentService;

	@PostMapping(consumes = {"text/plain"})
	public String moderate(@RequestBody String comment) {
    	if(moderateCommentService.superviseComment(comment))
    		return "Your Comment has malicious intent, So rejected";
    	else
    		return "Your Comment is approved";
    }
	
	@GetMapping(produces ={"application/json"})
	public List<String> getInvalidWords() {
		return moderateCommentService.getInvalidWord();
  }
}
