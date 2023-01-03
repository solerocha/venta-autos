package com.store.ventaautos.repositories;

import com.store.ventaautos.models.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author soled
 */
@Repository
public interface AutoRepository extends CrudRepository<Auto, Long>{

   
}
