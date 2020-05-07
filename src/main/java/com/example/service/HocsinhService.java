package com.example.service;

import com.example.repository.HocsinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HocsinhService{
    @Autowired
    HocsinhRepository repository;
}
