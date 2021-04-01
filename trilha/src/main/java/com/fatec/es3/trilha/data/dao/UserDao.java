package com.fatec.es3.trilha.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.fatec.es3.trilha.data.entity.Users;


@Repository
public class UserDao {

	@PersistenceContext
	EntityManager entityManager;

	public Users findById(int id) {
		return entityManager.find(Users.class, id);
	}

	public List<Users> findAll() {
		TypedQuery<Users> namedQuery = entityManager.createNamedQuery("find_all_users", Users.class);
		return namedQuery.getResultList();
	}

	public Users update(Users users) {
		return entityManager.merge(users);
	}

	public Users insert(Users users) {
		return entityManager.merge(users);
	}

	public void deleteById(int id) {
		Users users = findById(id);
		entityManager.remove(users);
	}
}
