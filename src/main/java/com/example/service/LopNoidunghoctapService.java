package com.example.service;

import com.example.repository.LopNoidunghoctapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LopNoidunghoctapService{
    @Autowired
    LopNoidunghoctapRepository repository;
}
