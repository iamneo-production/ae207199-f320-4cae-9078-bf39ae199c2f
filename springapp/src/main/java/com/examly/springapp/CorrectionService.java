package com.examly.springapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.CardCorrectionRepository;
import com.examly.springapp.CardCorrection;

@Service

public class CorrectionService {
	
	@Autowired
	private CardCorrectionRepository repo;
	// public List<CardCorrection> fetchValues(){
	//  return repo.findAll();
	// }
	
	public CardCorrection saveValuesDb(CardCorrection cardcorrection) {
		return repo.save(cardcorrection);
	}
	
	// public Optional<CardCorrection> fetchValuesDbById(int id) {
	// 	return repo.findById(id);
	// }
}
