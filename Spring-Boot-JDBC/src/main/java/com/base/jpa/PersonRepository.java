package com.base.jpa;

import org.springframework.stereotype.Repository;
import com.base.bean.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager; // Corrected the field name

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

}
