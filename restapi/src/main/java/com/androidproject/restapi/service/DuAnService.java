package com.androidproject.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidproject.restapi.model.DuAn;
import com.androidproject.restapi.repository.DuAnRepository;

@Service
public class DuAnService {
    @Autowired
    private DuAnRepository duAnRepository; 

    public List<DuAn> getAll() { 
        return duAnRepository.findAll(); 
    }
}
