package co.tylermaxwell.pjademo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ThingRepository extends CrudRepository<Thing, Long> {
    List<Thing> findAll();    
}
