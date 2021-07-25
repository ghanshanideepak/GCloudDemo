package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/service")
public class DummyController {
	
	
	ResponseEntity responseEntity;

	
	@GetMapping("getGifs")
	ResponseEntity<?> getAllTrackSFromWishList() {
		try {
			//responseEntity = new ResponseEntity(gipherservice.getAllGifFromWishList(), HttpStatus.OK);
			responseEntity = new ResponseEntity("Dummy Controller", HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			responseEntity = new ResponseEntity<>("Error !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}
}
