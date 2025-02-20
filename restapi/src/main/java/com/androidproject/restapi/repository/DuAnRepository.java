package com.androidproject.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.androidproject.restapi.model.DuAn;

@Repository
public interface DuAnRepository extends JpaRepository<DuAn, Integer>{
	
}
