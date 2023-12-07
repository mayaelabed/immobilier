package com.example.immobilier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

import com.example.immobilier.entites.Owner;
import com.example.immobilier.repository.OwnerRepository;

public class OwnerController<owner> {
    
    @Autowired
    private OwnerRepository ownerRepository; 
    
    @GetMapping("/owners")
    public List<Owner> getAll() {
        return ownerRepository.getAll();
    }

}
