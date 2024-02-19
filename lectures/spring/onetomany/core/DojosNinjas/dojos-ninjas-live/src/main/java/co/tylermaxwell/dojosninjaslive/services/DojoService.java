package co.tylermaxwell.dojosninjaslive.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.dojosninjaslive.models.Dojo;
import co.tylermaxwell.dojosninjaslive.repositories.DojoRepository;

@Service
public class DojoService {

    @Autowired
    DojoRepository dojoRepository;

    public Dojo addDojoToDB(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    public Dojo findDojoById(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }
    
}
