/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.store.ventaautos.services;

import com.store.ventaautos.models.Auto;
import com.store.ventaautos.repositories.AutoRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author soled
 */

@Service
public class AutoService {
    
    private final AutoRepository auto_repo;
    
    public AutoService (AutoRepository repo){
        this.auto_repo = repo;
    }
    
    public Auto create(Auto movil){
        return auto_repo.save(movil);
    }
    
    public Auto update(Auto movil){
        return auto_repo.save(movil);
    }
    
    public Auto change(Auto movil){
        return auto_repo.save(movil);
    }
    
    public boolean remove(Long id){
        if (auto_repo.existsById(id)){
            auto_repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
    
    public Optional<Auto> find(long id) {
        return auto_repo.findById(id);
    }
    
    public Iterable<Auto> findAll(){
    	return auto_repo.findAll();
    }
    
}
