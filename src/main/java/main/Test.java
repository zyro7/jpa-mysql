package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Comentari;


public class Test {
	
	
	private static EntityManager manager;

	private static EntityManagerFactory emf;
	
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		
		
		
		
	}
	/**
	 * Introdueix a la BDD el objecte comentari **la conexió amb la BDD no he conseguit que funcioni
	 * @param nou
	 */
	public static void introduir(Comentari nou) {
		manager.getTransaction().begin();
		manager.persist(nou);
		manager.getTransaction().commit();
	}
	/**
	 * Mostra els comentaris que hi han a la base de dades
	 */
	public static void mostra() {
		List<Comentari> comentaris = (List<Comentari>) manager.createNativeQuery("FROM Comentari").getResultList();
		System.out.println(comentaris.size());
	}
}
