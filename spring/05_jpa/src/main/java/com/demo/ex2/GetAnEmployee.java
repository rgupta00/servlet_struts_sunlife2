package com.demo.ex2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetAnEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kr_b1");

		EntityManager em = emf.createEntityManager();

		//we need tx iff we are doing some change op
		Employee employee=em.find(Employee.class, 8);
		
		Employee employee2=em.find(Employee.class, 8);
		//pc act as first level cache
		System.out.println(employee);
		System.out.println(employee2);
		em.close();
		emf.close();
	}

}
