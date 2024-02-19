package co.tylermaxwell.dojosninjaslive.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.dojosninjaslive.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
    
}
