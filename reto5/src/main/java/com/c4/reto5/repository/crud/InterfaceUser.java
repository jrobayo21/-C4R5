package com.c4.reto5.repository.crud;

import com.c4.reto5.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * * @author Jhon Rob
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    
    Optional<User> findTopByOrderByIdDesc();
    
    //anexo reto5
    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
