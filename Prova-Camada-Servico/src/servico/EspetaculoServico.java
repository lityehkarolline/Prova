package servico;

import java.util.List;

import dominio.Espetaculo;

public interface EspetaculoServico {
	
	public void inserirAtualizar(Espetaculo x);
	public void excluir(Espetaculo x);
	public Espetaculo buscar(int codEspetaculo);
	public List<Espetaculo> buscarTodos();

}
