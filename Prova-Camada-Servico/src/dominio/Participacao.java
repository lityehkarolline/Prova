package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_participacao")
public class Participacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codParticipacao;
	private Integer ordem;
	
	@ManyToOne
	@JoinColumn(name="banda") // leva o nome atribuito a classe de ligação que vc nomeou no private
	private Banda banda;
	
	@ManyToOne
	@JoinColumn(name="espetaculo")
	private Espetaculo espetaculo;
	
	public Participacao() {
		
	}

	public Participacao(Integer codParticipacao, Integer ordem, Banda banda, Espetaculo espetaculo) {
		super();
		this.codParticipacao = codParticipacao;
		this.ordem = ordem;
		this.banda = banda;
		this.espetaculo = espetaculo;
	}

	public Integer getCodParticipacao() {
		return codParticipacao;
	}

	public void setCodParticipacao(Integer codParticipacao) {
		this.codParticipacao = codParticipacao;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public Espetaculo getEspetaculo() {
		return espetaculo;
	}

	public void setEspetaculo(Espetaculo espetaculo) {
		this.espetaculo = espetaculo;
	}

	@Override
	public String toString() {
		return "Participacao [codParticipacao=" + codParticipacao + ", ordem=" + ordem + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codParticipacao == null) ? 0 : codParticipacao.hashCode());
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
		Participacao other = (Participacao) obj;
		if (codParticipacao == null) {
			if (other.codParticipacao != null)
				return false;
		} else if (!codParticipacao.equals(other.codParticipacao))
			return false;
		return true;
	}


}
