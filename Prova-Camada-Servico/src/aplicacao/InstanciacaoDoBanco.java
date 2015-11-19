package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Banda;
import dominio.Espetaculo;
import dominio.Participacao;

public class InstanciacaoDoBanco {
	
	public static void main(String args[]) {
		
		Espetaculo es1 = new Espetaculo(null, "Lollapalooza");
		Espetaculo es2 = new Espetaculo(null, "Axe Brasil");
		
		Banda ba1 = new Banda(null, "Skank", new BigDecimal("20000.00"));
		Banda ba2 = new Banda(null, "LosHermanos", new BigDecimal("10000.00"));
		Banda ba3 = new Banda(null, "Ivete Sangalo", new BigDecimal("75000.00"));
		Banda ba4 = new Banda(null, "Beatles", new BigDecimal("90000.00"));
		Banda ba5 = new Banda(null, "Claudia Leite", new BigDecimal("80000.00"));
		
		Participacao pa1 = new Participacao(null, 1, ba1, es1);
		Participacao pa2 = new Participacao(null, 2, ba2, es1);
		Participacao pa4 = new Participacao(null, 3, ba4, es1);
		
		Participacao pa3 = new Participacao(null, 1, ba3, es2);
		Participacao pa5 = new Participacao(null, 2, ba5, es2);
		
		es1.addParticipacao(pa1);
		es1.addParticipacao(pa2);
		es1.addParticipacao(pa4);
		
		es2.addParticipacao(pa3);
		es2.addParticipacao(pa5);
		
		
		
		ba1.addParticipacao(pa1);
		ba2.addParticipacao(pa2);
		ba3.addParticipacao(pa3);
		ba4.addParticipacao(pa4);
		ba5.addParticipacao(pa5);
		
		//System.out.println(es2.precoTotal());
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(es1);
		em.persist(es2);
		
		em.persist(ba1);
		em.persist(ba2);
		em.persist(ba3);
		em.persist(ba4);
		em.persist(ba5);
		
		em.persist(pa1);
		em.persist(pa2);
		em.persist(pa3);
		em.persist(pa4);
		em.persist(pa5);
		
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
		}

	}
