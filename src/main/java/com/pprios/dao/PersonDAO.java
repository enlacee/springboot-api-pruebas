package com.pprios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pprios.model.Person;

public interface PersonDAO extends JpaRepository<Person, Integer> {

}
