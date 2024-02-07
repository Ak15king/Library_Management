package com.example.demo.reppo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.bookentity;
public interface bookreppo extends JpaRepository<bookentity, Long>{

}
