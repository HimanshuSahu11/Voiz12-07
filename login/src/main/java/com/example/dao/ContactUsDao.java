package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ContactUs;
@Repository
public interface ContactUsDao extends JpaRepository<ContactUs, Integer> {

}
