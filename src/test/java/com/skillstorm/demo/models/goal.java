package com.skillstorm.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

//annotations for hibernate
@Entity
@Table(name = "goals")
public class goal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "goal_id")
	private int id;
	

	@NotBlank //validations 
	@Column(name="goal_name")
	private String name;
	

	@NotBlank
	@Column(name="goal_descr")
	private String description;
	
	@NotBlank
	@Column(name="goal_image")
	private String image;

	@NotBlank
	@Column(name="goal_date")
	private Date date;
	

	@NotBlank
	@Column(name="goal_amount")
	private double amount;
	

	@NotBlank
	@Column(name="goal_saved")
	private double saved;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private user user;
	
	public goal() {
		
	}
	
	
	

	public goal(int id, @NotBlank String name, @NotBlank String description, @NotBlank String image,
			@NotBlank Date date, @NotBlank double amount, @NotBlank double saved,
			user user) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.date = date;
		this.amount = amount;
		this.saved = saved;
		this.user = user;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getSaved() {
		return saved;
	}

	public void setSaved(double saved) {
		this.saved = saved;
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "goal [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", date="
				+ date + ", amount=" + amount + ", saved=" + saved + ", user=" + user + "]";
	}
	
	
	
	
	
	
}	
	


	