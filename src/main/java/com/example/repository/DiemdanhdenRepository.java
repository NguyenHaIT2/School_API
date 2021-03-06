package com.example.repository;

import com.example.entity.DiemdanhdenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public
interface DiemdanhdenRepository extends JpaRepository<DiemdanhdenEntity, Long> {
}
