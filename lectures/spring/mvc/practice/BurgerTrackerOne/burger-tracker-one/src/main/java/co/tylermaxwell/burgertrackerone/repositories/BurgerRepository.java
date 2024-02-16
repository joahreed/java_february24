package co.tylermaxwell.burgertrackerone.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.burgertrackerone.models.Burger;

//TODO have interface extent CrudRepository<Burger, Long>
public interface BurgerRepository extends CrudRepository<Burger, Long> {

    //TODO override the findAll() method
    List<Burger> findAll();
    
}
