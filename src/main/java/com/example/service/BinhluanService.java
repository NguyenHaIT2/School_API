package com.example.service;

import com.example.repository.BinhluanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinhluanService{
    @Autowired
    BinhluanRepository repository;
}
