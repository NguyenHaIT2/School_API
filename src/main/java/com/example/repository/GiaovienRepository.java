package com.example.repository;

import com.example.entity.GiaovienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public
interface GiaovienRepository extends JpaRepository<GiaovienEntity, Long> {
}
