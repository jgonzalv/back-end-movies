package co.edu.iudigital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "profile")

public class Profile  implements Serializable{
	
	@Id
	@Column(name = "profile_id")
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the nombre to set
	 */
	public void setNombre(String name) {
		this.name = name;
	}
	
	

}