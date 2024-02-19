package co.tylermaxwell.dojosninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.dojosninjas.models.Dojo;
import co.tylermaxwell.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {
    
    @Autowired
    DojoRepository dojoRepository;

    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    public Dojo getOneDojoById(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }
}
