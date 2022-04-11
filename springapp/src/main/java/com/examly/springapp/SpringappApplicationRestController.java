package com.examly.springapp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.NewCard;
import com.examly.springapp.CardService;
@CrossOrigin(origins="https://8081-fbfacdbfeeafbbbcbaebfcfdbcedfe.examlyiopb.examly.io")
@RestController


public class SpringappApplicationRestController {
    @Autowired
	private CardService service;
	
	//@RequestMapping(path="/getValues",method=RequestMethod.GET)
	@GetMapping("/getValues")
	
	public List<NewCard> fetchValues(){
		List<NewCard> card=new ArrayList<NewCard>();
		card =service.fetchValues();
		return card;
		//logic to fetch data from db
	}
	
	@PostMapping("/addValues")
	
	public NewCard saveValues(@RequestBody NewCard newcard){
		return service.saveValuesDb(newcard);
		//logic to save data into db
	}
}
    

