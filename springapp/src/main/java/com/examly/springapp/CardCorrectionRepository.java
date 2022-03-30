package com.examly.springapp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.CardCorrection;

public interface CardCorrectionRepository extends JpaRepository<CardCorrection,Integer> {

}
