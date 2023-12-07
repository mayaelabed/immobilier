package com.example.immobilier.repository;

import java.util.List;

import com.example.immobilier.entites.Property;

public interface PropertyRepository {

    List<Property> getAll();

    Property getById(Long id);

    Property save(Property newProperty);

    Property update(Property newProperty);

    void delete(Long id);
    
}
