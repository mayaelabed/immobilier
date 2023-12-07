package com.example.immobilier.repository;
import java.util.List;

import com.example.immobilier.entites.Owner;

public interface OwnerRepository {

    List<Owner> getAll();

    Owner getById(Long id);

    Owner save(Owner newOwner);

    Owner update(Owner newOwner);

    void delete(Long id);
    
}

