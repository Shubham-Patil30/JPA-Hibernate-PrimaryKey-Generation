package com.ait.test;

import com.ait.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	EntityManager em = factory.createEntityManager(); 
	
	Student s1 = new Student(); 
	s1.setSname("sid");
	
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	try {
		em.persist(s1);
		tx.commit();
		System.out.println("student added successfully");
	} catch (Exception e) {
		tx.rollback();
		e.printStackTrace();
		System.out.println("some error occurs ");
	}

	}

}
