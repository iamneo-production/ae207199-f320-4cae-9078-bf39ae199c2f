package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.CardCorrection;
import com.examly.springapp.CorrectionService;

@RestController

public class CorrectionRestController {

	@Autowired
	private CorrectionService service;
	
	//@RequestMapping(path="/getValues",method=RequestMethod.GET)
	// @GetMapping("/getValues")
	// @CrossOrigin(origins="http://localhost:4200")
	// public List<CardCorrection> fetchValues(){
	// 	List<CardCorrection> card=new ArrayList<CardCorrection>();
	// 	card =service.fetchValues();
	// 	return card;
	// 	//logic to fetch data from db
	// }
	
	@PostMapping("/addValues")
	@CrossOrigin(origins="http://localhost:4200")
	public CardCorrection saveValues(@RequestBody CardCorrection cardcorrection){
		return service.saveValuesDb(cardcorrection);
		//logic to save data into db
	}
	
	// @GetMapping("/getValuesbyid/{id}")
	// @CrossOrigin(origins="http://localhost:4200")
	// public CardCorrection fetchValuesById(@PathVariable int id) {
	// 	return service.fetchValuesDbById(id).get();
	// }
	
}
