package com.example.service;

import com.example.repository.HocsinhHinhanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HocsinhHinhanhService{
    @Autowired
    HocsinhHinhanhRepository repository;
}
