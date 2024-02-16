package co.tylermaxwell.burgertrackerone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.burgertrackerone.models.Burger;
import co.tylermaxwell.burgertrackerone.repositories.BurgerRepository;

//TODO add the @Service annotation
@Service
public class BurgerService {

    // TODO inject your repository interface as a dependency(use @AutoWired annotation).
    @Autowired
    BurgerRepository burgerRepository;

	public List<Burger> getAllBurgers() {
        return burgerRepository.findAll();
	}

    public void saveBurgerToDatabase(Burger burger) {
        burgerRepository.save(burger);
    }
    
    
    //TODO add necessary methods.
    
}
