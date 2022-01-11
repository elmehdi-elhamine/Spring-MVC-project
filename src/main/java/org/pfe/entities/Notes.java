package org.pfe.entities;

import javax.persistence.*;

@Entity
public class Notes {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_note;
	
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double note_normale;
	private double note_ratt;


	
	@ManyToOne
	
	@JoinColumn(name="id_etud",insertable = false, updatable = false)
	private Etudiant etudiant;
	@ManyToOne
	

	@JoinColumn(name="id_module",insertable = false, updatable = false)
	private Module module;
	

	
	public Long getId_note() {
		return id_note;
	}

	public void setId_note(Long id_note) {
		this.id_note = id_note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public double getNote_normale() {
		return note_normale;
	}

	public void setNote_normale(double note_normale) {
		this.note_normale = note_normale;
	}

	public double getNote_ratt() {
		return note_ratt;
	}

	public void setNote_ratt(double note_ratt) {
		this.note_ratt = note_ratt;
	}

	

}
