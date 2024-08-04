package com.tnp.employ.dao;

import com.tnp.employ.entities.Employ;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployDAOJpaImpl implements EmployDAO{
    EntityManager entityManager;

    @Autowired
    public EmployDAOJpaImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employ> findAll(){
        TypedQuery<Employ> query = entityManager.createQuery("from Employ", Employ.class);
        List <Employ> foundEmployee = query.getResultList();
        return foundEmployee;
    }

    @Override
    public Employ findById(int id) {
        Employ employ = entityManager.find(Employ.class, id);
        if(employ == null){
            throw new RuntimeException("Cant find the employee with id "+id);
        }
        return employ;
    }

    @Override
    public Employ save(Employ employ) {
        return entityManager.merge(employ);
    }

    @Override
    public void deleteById(int id) {
        Employ employ = entityManager.find(Employ.class, id);
        entityManager.remove(employ);
    }



}
