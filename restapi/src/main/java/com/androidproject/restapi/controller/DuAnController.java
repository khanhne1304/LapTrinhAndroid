package com.androidproject.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidproject.restapi.model.DuAn;
import com.androidproject.restapi.service.DuAnService;

@RestController
@RequestMapping("/api/duan")
public class DuAnController {
	@Autowired
	private DuAnService duAn;
	
	@GetMapping("/all")
	public List<DuAn> getAll(){
		return duAn.getAll();
	}
}
