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
import com.placement.springboot.model.Provider;
import com.placement.springboot.repository.ProviderRepository;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/prov/")
public class ProviderController {
	
			@Autowired
			private ProviderRepository providerRepository;
			
			// get all providers
			@GetMapping("/providers")
			public List<Provider> getAllProvider(){
				return providerRepository.findAll();
			}		
			
			// create provider
			@PostMapping("/providers")
			public Provider createProvider(@RequestBody Provider provider) {
				return providerRepository.save(provider);
			}
			
			// get provider by id
			@GetMapping("/providers/{id}")
			public ResponseEntity<Provider> getProviderById(@PathVariable Long id) {
				Provider provider = providerRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("Provider not exist with id :" + id));
				return ResponseEntity.ok(provider);
			}
			
			// update provider
			
			@PutMapping("/providers/{id}")
			public ResponseEntity<Provider> updateSeeker(@PathVariable Long id, @RequestBody Provider providerDetails){
				Provider provider = providerRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("Provider not exist with id :" + id));
				
				provider.setProviderName(providerDetails.getProviderName());
				provider.setProviderEmail(providerDetails.getProviderEmail());
				provider.setProviderNumber(providerDetails.getProviderNumber());
				provider.setVacancy(providerDetails.getVacancy());
				provider.setDeadLine(providerDetails.getDeadLine());

				
				
				
				Provider updatedProvider = providerRepository.save(provider);
				return ResponseEntity.ok(updatedProvider);
			}
			
			// delete provider
			@DeleteMapping("/providers/{id}")
			public ResponseEntity<Map<String, Boolean>> deleteProvider(@PathVariable Long id){
				Provider provider = providerRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("Provider not exist with id :" + id));
				
				providerRepository.delete(provider);
				Map<String, Boolean> response = new HashMap<>();
				response.put("deleted", Boolean.TRUE);
				return ResponseEntity.ok(response);
			}
			

}
