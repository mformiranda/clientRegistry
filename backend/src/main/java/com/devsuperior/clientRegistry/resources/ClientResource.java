package com.devsuperior.clientRegistry.resources;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.clientRegistry.entities.Client;



@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<Client>();
		
		list.add(new Client(1L, "José Silva", "12345678910", 7500.00, LocalDate.parse("05-01-1993"), 0));
		list.add(new Client(2L, "Mr. Magoo", "12345678910", 8000.00, LocalDate.parse("31-10-2020"), 0));
		
		return ResponseEntity.ok().body(list);
	}
 	
}
