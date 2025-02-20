package com.androidproject.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.androidproject.restapi.model.project;
@RestController
public class ProjectController {
	private List<project> projects = new ArrayList<project>();
	@PostMapping("/project")
	public project create(@RequestBody project proj) {
		projects.add(proj);
		return proj;
	}
	@GetMapping("/projects")
	public List<project> getAll(){
		return projects;
	}
}
