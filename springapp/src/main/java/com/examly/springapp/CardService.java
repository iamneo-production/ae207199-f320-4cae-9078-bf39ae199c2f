package com.examly.springapp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.SpringappRepository;
import com.examly.springapp.NewCard;

@Service

public class CardService {
	
	@Autowired
	private SpringappRepository repo;
	public List<NewCard> fetchValues(){
	 return repo.findAll();
	}
	
	public NewCard saveValuesDb(NewCard newcard) {
		return repo.save(newcard);
	}
}
