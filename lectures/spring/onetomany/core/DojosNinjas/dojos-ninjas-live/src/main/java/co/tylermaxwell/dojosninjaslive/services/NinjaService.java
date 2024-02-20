package co.tylermaxwell.dojosninjaslive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.dojosninjaslive.models.Ninja;
import co.tylermaxwell.dojosninjaslive.repositories.NinjaRepository;

@Service
public class NinjaService {

    @Autowired
    NinjaRepository ninjaRepository;

    public Ninja createNinjaInDB(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
    
}
