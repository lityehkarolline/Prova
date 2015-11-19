package servico;

import java.util.List;

import dominio.Participacao;

public interface ParticipacaoServico {
	
	public void inserirAtualizar(Participacao x);
	public void excluir(Participacao x);
	public Participacao buscar(int codParticipacao);
	public List<Participacao> buscarTodos();

}
