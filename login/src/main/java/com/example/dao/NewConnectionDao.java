package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.NewConnection;
@Repository
public interface NewConnectionDao extends JpaRepository<NewConnection, Integer> {

}
