package com.example.service;

import com.example.repository.NoidunghoctapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoidunghoctapService{
    @Autowired
    NoidunghoctapRepository repository;
}
