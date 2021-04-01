package com.fatec.es3.trilha.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_users", query = "select u from Users u")
public class Users {
	
	@Id
	@GeneratedValue
	private int id;
	private String nickname;
	private String email;
	private String password;
	private Date created;
	private boolean status;

	public Users() {
	}

	public Users(String nickname, String email, String password, Date created, boolean status) {
		super();
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.created = created;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", nickname=" + nickname + ", email=" + email + ", password=" + password
				+ ", created=" + created + ", status=" + status + "]";
	}
}
