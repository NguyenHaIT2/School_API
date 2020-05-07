package com.example.service;

import com.example.repository.DiemdanhdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiemdanhdenService{
    @Autowired
    DiemdanhdenRepository repository;
}
