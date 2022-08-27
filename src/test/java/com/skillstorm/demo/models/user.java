package com.skillstorm.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class user {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column
	@NotBlank //these are good names so dont rename the column
	private String username;
	
	@Column
	@NotBlank
	private String password;
	
	
	@OneToMany (mappedBy="user")
	private List<goal> goal;
	
	
	
	public user() {
		
	}

	


	public user(int id, @NotBlank String username, @NotBlank String password,
			List<goal> goal) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.goal = goal;
	}




	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<goal> getGoal() {
		return goal;
	}



	public void setGoal(List<goal> goal) {
		this.goal = goal;
	}




	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", password=" + password + ", goal=" + goal + "]";
	}
	




}
