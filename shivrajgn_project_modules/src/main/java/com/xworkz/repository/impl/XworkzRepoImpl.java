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
    public String findByEmail(String email) {
        System.out.println("repo is started");
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("findByEmail");
            query.setParameter("em", email);
            return (String) query.getSingleResult();
        } catch (NoResultException e) {
            return "";
        } finally {
            em.close();
        }
    }

    @Override
    public int getCount(String email) {
        System.out.println("repo is started");
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("getCount");
            query.setParameter("yh", email);
            return  (Integer) query.getSingleResult();
        } catch (NoResultException e) {
            return 0;
        } finally {
            em.close();
        }
    }

    @Override
    public void updateCountt(String email) {
        System.out.println("update count is started");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("updateCount");
            query.setParameter("up", email);
            query.executeUpdate();
            em.getTransaction().commit();
        } catch (NoResultException e) {
            System.out.println("no data found to update");
        } finally {
            em.close();
        }
    }

    @Override
    public boolean emailExist(String email) {
        System.out.println("Existing email is started");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        try {
            Query query= entityManager.createNamedQuery("emailExist");
            query.setParameter("em",email);
            int valu=(int)query.getSingleResult();
            if(valu>0){
                return true;
            }
        }catch (NoResultException e){
            System.out.println("not fetch");
        }finally {
            entityManager.close();
        }
        return false;
    }
}
