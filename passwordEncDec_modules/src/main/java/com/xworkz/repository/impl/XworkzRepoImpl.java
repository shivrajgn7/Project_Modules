package com.xworkz.repository.impl;

import com.xworkz.entity.XworkzEntity;
import com.xworkz.repository.XworkzRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class XworkzRepoImpl implements XworkzRepo {
    @Autowired
     EntityManagerFactory entityManagerFactory;

    @Override
    public boolean validData(XworkzEntity xworkzEntity) {
        System.out.println("Valid data repo is started"+xworkzEntity);
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(xworkzEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        //entityManagerFactory.close();
        System.out.println("valid data repo is endded");
        return true;
    }

    @Override
    public XworkzEntity findByEmail(String email) {
        System.out.println("repo is started");
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("findByEmail");
            query.setParameter("email", email);
            return (XworkzEntity) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
}
