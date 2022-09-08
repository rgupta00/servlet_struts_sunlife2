

package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		//when magician doing magic after that audiance is doing clapping
	
		EntityManagerFactory emf=
				Persistence.createEntityManagerFactory("sun_life_pu");
		
		EntityManager em= emf.createEntityManager();
		Customer customer=new Customer("umesh", "delhi", "7565660677");
		
		em.getTransaction().begin();
		
		em.persist(customer);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}




