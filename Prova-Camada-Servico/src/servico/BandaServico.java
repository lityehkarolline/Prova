package servico;

import java.math.BigDecimal;
import java.util.List;

import dominio.Banda;

public interface BandaServico {
	
	public void inserirAtualizar(Banda x);
	public void excluir(Banda x);
	public Banda buscar(int codBanda);
	public List<Banda> buscarTodos();
	
	public List<Banda> bandasPorFaixaDePreco(BigDecimal minimo, BigDecimal maximo);

}
