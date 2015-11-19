package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_banda")
public class Banda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codBanda;
	private String nome;
	private BigDecimal preco;
	
	@OneToMany(mappedBy="banda") //leva o nome da classe em minisculo
	private List<Participacao> participacoes;
	
	
	public Banda() {
		this.participacoes = new ArrayList<Participacao>();
	}

	public Banda(Integer codBanda, String nome, BigDecimal preco) {
		super();
		this.codBanda = codBanda;
		this.nome = nome;
		this.preco = preco;
		this.participacoes = new ArrayList<Participacao>();
	}

	public Integer getCodBanda() {
		return codBanda;
	}

	public void setCodBanda(Integer codBanda) {
		this.codBanda = codBanda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}
	
	
	
	public void addParticipacao(Participacao x){
		this.participacoes.add(x);
	}
	
	public void removeParticipacao(Participacao x){
		this.participacoes.remove(x);
	}
	
	
	

	@Override
	public String toString() {
		return "Banda [codBanda=" + codBanda + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codBanda == null) ? 0 : codBanda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banda other = (Banda) obj;
		if (codBanda == null) {
			if (other.codBanda != null)
				return false;
		} else if (!codBanda.equals(other.codBanda))
			return false;
		return true;
	}


}