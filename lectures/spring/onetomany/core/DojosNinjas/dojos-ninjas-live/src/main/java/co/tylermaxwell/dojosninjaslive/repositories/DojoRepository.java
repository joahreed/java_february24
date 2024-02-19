package co.tylermaxwell.dojosninjaslive.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.dojosninjaslive.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
    List<Dojo> findAll();
    
}
