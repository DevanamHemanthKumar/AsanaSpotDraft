package com.Asana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Asana.model.AsanaTasks;
import com.Asana.service.AsanaService;

@RestController
public class AsanaController {
	
	@Autowired
	private AsanaService asanaService;
	
	@PostMapping
	public ResponseEntity<AsanaTasks> postAsanaTask(@RequestBody AsanaTasks asanaTasks){
		return new ResponseEntity<AsanaTasks>(asanaService.postAsanaTask(asanaTasks),HttpStatus.CREATED);
	}
}
