package sda.training.model.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class HibernateService {

    private final EntityManager entityManager;

    @Autowired
    public HibernateService(EntityManager entityManager) {
        this.entityManager = entityManager;


        //HOW to get some staff from prev time if you need.
        SessionFactory ses = entityManager.getEntityManagerFactory()
                .unwrap(SessionFactory.class);
        System.out.println(entityManager + " CURRENT SESSION:");
    }
}
