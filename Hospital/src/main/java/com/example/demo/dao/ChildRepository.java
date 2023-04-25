package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Children;

public interface ChildRepository extends JpaRepository<Children, Integer> {

}
