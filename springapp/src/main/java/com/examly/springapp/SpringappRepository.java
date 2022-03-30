package com.examly.springapp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.NewCard;

public interface SpringappRepository extends JpaRepository<NewCard,Integer> {

}

