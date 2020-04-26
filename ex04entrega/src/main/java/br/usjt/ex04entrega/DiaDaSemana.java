package br.usjt.ex04entrega;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_semana")
public class DiaDaSemana {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 30)
	private String diad;
	
	@OneToOne(optional = false)
	@JoinColumn (name = "id_previsao")
	private Previsao previsao;

	public Previsao getPerfil() {
		return previsao;

	}

	public void setPerfil(Previsao previsao) {
		this.previsao = previsao;

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiad() {
		return diad;
	}

	public void setDiad(String diad) {
		this.diad = diad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		DiaDaSemana other = (DiaDaSemana) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
