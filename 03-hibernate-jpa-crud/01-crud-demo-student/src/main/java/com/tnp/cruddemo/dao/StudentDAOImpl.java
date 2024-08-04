package com.tnp.cruddemo.dao;

import com.tnp.cruddemo.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student){
        entityManager.persist(student);
    };

    @Override
    public Student findStudent(int id){
        Student foundStd = entityManager.find(Student.class, id);
        return foundStd;
    };

    @Override
    public List<Student> findAll(){
        TypedQuery<Student> allStudentQuery = entityManager.createQuery("select s FROM Student s order by s.lastName", Student.class);
        List <Student> allStudents = allStudentQuery.getResultList();
        return allStudents;
    };

    @Override
    public List<Student> findByLastName(String lname){
        TypedQuery <Student> query = entityManager.createQuery("select s FROM Student s WHERE s.lastName=:lname", Student.class);
        query.setParameter("lname", lname);
        List <Student> foundStudents = query.getResultList();
        return foundStudents;
    }

    @Override
    @Transactional
    public void updateStudent(Student student){
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id){
        Student std = entityManager.find(Student.class, id);
        entityManager.remove(std);
    }
    @Override
    @Transactional
    public int deleteAll(){
        int rows =  entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return rows;
    }
}
