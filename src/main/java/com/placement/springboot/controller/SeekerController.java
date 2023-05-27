package com.placement.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placement.springboot.exception.ResourceNotFoundException;
import com.placement.springboot.model.Seeker;
import com.placement.springboot.repository.SeekerRepository;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/seek/")
public class SeekerController {


		@Autowired
		private SeekerRepository seekerRepository;
		
		// get all seekers
		@GetMapping("/seekers")
		public List<Seeker> getAllSeekers(){
			return seekerRepository.findAll();
		}		
		
		// create seekers
		@PostMapping("/seekers")
		public Seeker createSeeker(@RequestBody Seeker seeker) {
			return seekerRepository.save(seeker);
		}
		
		// get seekers by id
		@GetMapping("/seekers/{id}")
		public ResponseEntity<Seeker> getSeekerById(@PathVariable Long id) {
			Seeker seeker = seekerRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Seeker not exist with id :" + id));
			return ResponseEntity.ok(seeker);
		}
		
		// update seeker
		
		@PutMapping("/seekers/{id}")
		public ResponseEntity<Seeker> updateSeeker(@PathVariable Long id, @RequestBody Seeker seekerDetails){
			Seeker seeker = seekerRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Seeker not exist with id :" + id));
			
			seeker.setUserName(seekerDetails.getUserName());
			seeker.setEmailId(seekerDetails.getEmailId());
			seeker.setPhoneNo(seekerDetails.getPhoneNo());
			seeker.setQualification(seekerDetails.getQualification());
			seeker.setSkill(seekerDetails.getSkill());

			
			
			
			Seeker updatedSeeker = seekerRepository.save(seeker);
			return ResponseEntity.ok(updatedSeeker);
		}
		
		// delete seeker
		@DeleteMapping("/seekers/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteSeeker(@PathVariable Long id){
			Seeker seeker = seekerRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Seeker not exist with id :" + id));
			
			seekerRepository.delete(seeker);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		

}
