package com.example.service;

import com.example.repository.HocsinhVeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HocsinhVeService{
    @Autowired
    HocsinhVeRepository repository;
}
