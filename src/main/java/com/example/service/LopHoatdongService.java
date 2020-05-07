package com.example.service;

import com.example.repository.LopHoatdongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LopHoatdongService{
    @Autowired
    LopHoatdongRepository repository;
}
