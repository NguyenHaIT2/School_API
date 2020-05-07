package com.example.service;

import com.example.repository.PhuhuynhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhuhuynhService{
    @Autowired
    PhuhuynhRepository repository;
}
