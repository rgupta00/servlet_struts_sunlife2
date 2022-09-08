

package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
public class ShowAll {

	public static void main(String[] args) {
		//when magician doing magic after that audiance is doing clapping
	
		EntityManagerFactory emf=
				Persistence.createEntityManagerFactory("sun_life_pu");
		
		EntityManager em= emf.createEntityManager();
		
		List<Customer> customers=
				em.createQuery("select c from Customer c").getResultList();
		
		customers.forEach(c-> System.out.println(c));
		em.close();
		emf.close();
	}
}




