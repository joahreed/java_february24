package co.tylermaxwell.loginreglive.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.loginreglive.models.User;

// .. imports .. //
    

public interface UserRepository extends CrudRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
}
