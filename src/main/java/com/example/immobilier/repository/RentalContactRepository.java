package com.example.immobilier.repository;
 
import java.util.List;
import com.example.immobilier.entites.RentalContact;

public interface RentalContactRepository {

    List<RentalContact> getAll();

    RentalContact getById(Long id);

    RentalContact save(RentalContact newRentalContact);

    RentalContact update(RentalContact newRentalContact);

    void delete(Long id);
    
}
