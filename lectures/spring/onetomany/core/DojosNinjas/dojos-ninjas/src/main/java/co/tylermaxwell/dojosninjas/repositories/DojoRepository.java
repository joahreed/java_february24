package co.tylermaxwell.dojosninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.dojosninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
    List<Dojo> findAll();
    
}
