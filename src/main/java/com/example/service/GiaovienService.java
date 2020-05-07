package com.example.service;

import com.example.repository.GiaovienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiaovienService{
    @Autowired
    GiaovienRepository repository;
}
