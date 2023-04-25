package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Children;
import com.example.demo.dao.ChildRepository;

@RestController
public class ChildController {

	@Autowired
	ChildRepository childrepo;
	
	@GetMapping("allchildren")
	public List<Children> getChilds() {
		
		return childrepo.findAll();
	}
	
	@GetMapping("search/{id}")
	public Optional<Children> getDetails(@PathVariable("id") Integer sid ){
		return childrepo.findById(sid);
	}
	
	@PostMapping("addchild")
	public Optional<Children> postData(@RequestBody Children child){
		childrepo.save(child);
		return childrepo.findById(child.getRegistrationNumber());
	}
	
	@PutMapping("editchild")
	public Optional<Children> updateData(@RequestBody Children child){
		childrepo.save(child);
		return childrepo.findById(child.getRegistrationNumber());
	}
	
}
