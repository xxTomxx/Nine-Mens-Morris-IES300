package com.fatec.es3.trilha.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.fatec.es3.trilha.data.entity.Users;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.fatec.es3.trilha.data.entity.Statistic;


@Repository
public class StatisticDao {

	@PersistenceContext
	EntityManager entityManager;

	public Users findStatisticById(int statistic_Id) {
		return entityManager.find(Statistic.class, statistic_Id);
	}

	public List<Users> findAllStatistic() {
		TypedQuery<Statistic> namedQuery = entityManager.createNamedQuery("find_all_Statistics", Statistic.class);
		return namedQuery.getResultList();
	}

	public Statistic update(Statistic statistic) {
		return entityManager.merge(statistic);
	}

	public Statistic insert(Statistic statistic) {
		return entityManager.merge(users);
	}

	public void deleteStatisticById(int statistic_Id) {
		Users users = findStatisticById(statistic_Id);
		entityManager.remove(statistic_Id);
	}
}
