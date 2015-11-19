package dao.jpa;

import javax.persistence.EntityManager;

public class EM {
	
private static ThreadLocal<EntityManager> LocalEm = new ThreadLocal<EntityManager>();
	
	public static synchronized EntityManager getLocalEm() {
		EntityManager em = LocalEm.get();
		
		if(em == null){
			em = EMF.get().createEntityManager();
			LocalEm.set(em);
		}
		return em;
	}
	
	public static void closeLocalEm(){
		EntityManager em = LocalEm.get();
		
		if(em != null) {
			LocalEm.get().close();
			LocalEm.set(null);
		}
	}
}
