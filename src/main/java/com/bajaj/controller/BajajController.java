package com.bajaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bajaj.DTO.RequestDto;
import com.bajaj.services.BajajServices;

@Controller
@CrossOrigin
public class BajajController {
	
	@Autowired
	public BajajServices bajajServices;

	@PostMapping("/bfhl")
	public ResponseEntity<?> sendData(@RequestBody RequestDto Object){
		
		return ResponseEntity.ok(bajajServices.getData(Object.getData()));
	}
}
