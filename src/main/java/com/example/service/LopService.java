package com.example.service;

import com.example.repository.LopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LopService{
    @Autowired
    LopRepository repository;
}
