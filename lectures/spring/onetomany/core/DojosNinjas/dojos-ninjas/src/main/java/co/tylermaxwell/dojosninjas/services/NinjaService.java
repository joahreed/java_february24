package co.tylermaxwell.dojosninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.dojosninjas.models.Ninja;
import co.tylermaxwell.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

    @Autowired
    NinjaRepository ninjaRepository;

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }
}
