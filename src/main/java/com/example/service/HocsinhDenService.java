package com.example.service;

import com.example.repository.HocsinhDenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HocsinhDenService{
    @Autowired
    HocsinhDenRepository repository;
}
