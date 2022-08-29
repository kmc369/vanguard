package com.skillstorm.demo.models;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

//annotations for hibernate
@Entity
@Table(name = "goals")

public class goal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "goal_id")
	private int id;
	

	@NotBlank
	@Column(name="goal_name")
	private String name;
	

	@NotBlank
	@Column(name="goal_descr")
	private String description;
	
	@NotBlank
	@Column(name="goal_image")
	private String image;

	@Future
	@Column(name="goal_date")
	private LocalDate date;
	

	@NotNull
	@Column(name="goal_amount")
	private double amount;
	

	@NotNull
	@Column(name="goal_saved")
	private double saved;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	//@JsonBackReference
	@JsonIdentityReference(alwaysAsId = true)
	private user user;
	
	public goal() {
		
	}
	

	public goal(int id,  String name,  String description,  String image, LocalDate date,  double amount, double saved, com.skillstorm.demo.models.user user) {
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









	public goal( String name, String description,  String image,  LocalDate date, double amount, double saved, com.skillstorm.demo.models.user user) {
		super();
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
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
	


	