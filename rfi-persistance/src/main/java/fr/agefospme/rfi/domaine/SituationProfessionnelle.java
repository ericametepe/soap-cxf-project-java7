package fr.agefospme.rfi.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class SituationProfessionnelle extends AbstractPersistable<Long> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(length=1,unique=true)
	private String code;
	private String libelle;
	private String libellLong;
	
	/**
	 * 
	 */

}
