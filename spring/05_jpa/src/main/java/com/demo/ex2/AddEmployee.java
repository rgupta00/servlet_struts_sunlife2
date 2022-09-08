package com.demo.ex2;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kr_b1");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			Employee employee = new Employee("geeta", 56000);
			employee.setBirthDate(new Date());
			employee.setPassword("amit34434");
			employee.setGender(Gender.M);
			employee.addPhone("4646656556");
			employee.addPhone("7046656556");
			employee.addPhone("4646006556");
			
			em.persist(employee);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		em.close();
		emf.close();
	}

}
