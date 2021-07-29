package com.systemmz.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id // define o campo "id" como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // declara que a chave primária é auto-incrmentada
	private Long id;
	private String name;
	private String email;
	private String fone;
	private String password;
	
	@OneToMany(mappedBy = "client") // (OneToMany = Um para Muitos
	private List<Order> orders = new ArrayList<>();

	public User() {
		
	}

	public User(Long id, String name, String email, String fone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fone = fone;
		this.password = password;
	}

	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
	
}
