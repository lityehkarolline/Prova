package servico.impl;

import java.math.BigDecimal;
import java.util.List;

import dao.BandaDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Banda;
import servico.BandaServico;

public class BandaServicoImpl implements BandaServico {
	
	private BandaDao dao;
	
	public BandaServicoImpl() {
		dao = DaoFactory.criarBandaDao();
	}

	@Override
	public void inserirAtualizar(Banda x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public void excluir(Banda x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Banda buscar(int codBanda) {
		return dao.buscar(codBanda);
	}

	@Override
	public List<Banda> buscarTodos() {
		return dao.buscarTodos();
	}
	
	public List<Banda> bandasPorFaixaDePreco(BigDecimal minimo, BigDecimal maximo) {
		return dao.bandasPorFaixaDePreco(minimo, maximo);
	}

}
