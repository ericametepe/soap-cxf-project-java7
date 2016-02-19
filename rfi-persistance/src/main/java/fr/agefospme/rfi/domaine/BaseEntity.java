package fr.agefospme.rfi.domaine;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: BaseEntity
 *
 */

public class BaseEntity implements Serializable {
	private Long id;


	public BaseEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private static final long serialVersionUID = 1L;

}
