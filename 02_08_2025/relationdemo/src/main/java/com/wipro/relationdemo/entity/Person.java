package com.wipro.relationdemo.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "person_name")
	String personName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName= "id")
	Set<Post> postList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Set<Post> getPostList() {
		return postList;
	}

	public void setPostList(Set<Post> postList) {
		this.postList = postList;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", postList=" + postList + "]";
	}
	
	
	
}
