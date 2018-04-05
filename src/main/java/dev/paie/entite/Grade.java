package dev.paie.entite;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Grade")
public class Grade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CODE")
	private String code;

	@Column(name = "NB_HEURES_BASE")
	private BigDecimal nbHeuresBase;

	@Column(name = "TAUX_BASE")
	private BigDecimal tauxBase;

	private static int compteur;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getNbHeuresBase() {
		return nbHeuresBase;
	}

	public void setNbHeuresBase(BigDecimal nbHeuresBase) {
		this.nbHeuresBase = nbHeuresBase;
	}

	public BigDecimal getTauxBase() {
		return tauxBase;
	}

	public void setTauxBase(BigDecimal tauxBase) {
		this.tauxBase = tauxBase;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Grade(String code, BigDecimal nbHeuresBase, BigDecimal tauxBase) {
		super();

		this.id = compteur++;
		this.code = code;
		this.nbHeuresBase = nbHeuresBase;
		this.tauxBase = tauxBase;
	}

	public Grade() {
		// TODO Auto-generated constructor stub
	}

}
