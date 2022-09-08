package com.demo.ex2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetAll {
	
	public static void main(String[] args) {
		
//		EntityManagerFactory
//		EntityManager
		

		//gettting or changing the state of table/db
		//no tx is required vs 	add/update/del: u need to start the tx?
		
		//JPA/Hibernate : orm: sql vs hql/jpql
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kr_b1");
		
		EntityManager em=emf.createEntityManager();
		
		
		List<Employee> employees=
				em.createQuery("select e from Employee e", Employee.class).getResultList();
		
		employees.stream().forEach(e-> System.out.println(e));
		
//		List<String> employees=
//				em.createQuery("select e.name from Employee e", String.class).getResultList();
//		
//		employees.stream().forEach(e-> System.out.println(e));
//		
//		List<Object[]> employees=
//				em.createQuery("select e.id, e.name from Employee e", Object[].class).getResultList();
//		
//		for(Object[] temp: employees) {
//			System.out.println(temp[0]+": "+ temp[1]);
//		}
//		
		

//		List<EmpData> employees=
//				em
//				.createQuery("select new com.demo.EmpData(e.id, e.name) from Employee e", EmpData.class).getResultList();
//		
//		employees.forEach(e-> System.out.println(e));
//		
		em.close();
		
		emf.close();
		
	}

}





