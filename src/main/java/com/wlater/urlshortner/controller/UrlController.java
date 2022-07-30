package com.wlater.urlshortner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wlater.urlshortner.entity.Urls;
import com.wlater.urlshortner.repository.UrlRepository;

@RestController
public class UrlController {
	
	@Autowired
	private UrlRepository urlRepo;
	
	@GetMapping("/getAll")
	public List<Urls> getAllUrls(){
		return urlRepo.findAll();
	}
	
	@PostMapping("/create")
	public Urls createUrls(@RequestBody Urls url){
		return urlRepo.insert(url);
	}

}
