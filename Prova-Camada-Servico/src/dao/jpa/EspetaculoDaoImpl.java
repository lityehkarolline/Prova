package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.EspetaculoDao;
import dominio.Espetaculo;

public class EspetaculoDaoImpl implements EspetaculoDao {

	private EntityManager em;
	
	public EspetaculoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Espetaculo x) {
		if(x.getCodEspetaculo() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Espetaculo x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Espetaculo buscar(int codEspetaculo) {
		return em.find(Espetaculo.class, codEspetaculo);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Espetaculo> buscarTodos() {
		String jpql = "SELECT x FROM Espetaculo x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
