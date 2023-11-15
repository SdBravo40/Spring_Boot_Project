package com.SpringBoot.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="allUserDetails")
public class UserEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
    private String username;
	
	@Column
    private String name;
    
	
    
	@Column
    private String password;
    
	@Column
    private int age;
    
	@Column
    private LocalDate date;

	public UserEntity(String name, String username, String password, int age, LocalDate date) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username2) {
		this.username = username2;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", date=" + date + ", getName()=" + getName() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getAge()=" + getAge() + ", getDate()=" + getDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
