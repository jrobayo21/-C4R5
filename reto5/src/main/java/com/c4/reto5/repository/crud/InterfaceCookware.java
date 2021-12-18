package com.c4.reto5.repository.crud;

import com.c4.reto5.model.Cookware;
import org.springframework.data.mongodb.repository.MongoRepository;

//anexo reto5
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

/**
 *
 * * @author Jhon Rob
 */
public interface InterfaceCookware extends MongoRepository<Cookware, String> {
    //Reto 5
    public List<Cookware> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Cookware> findByDescriptionLike(String description);

}
