package com.fatec.es3.trilha.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.fatec.es3.trilha.data.entity.PurchasedPorducts;
import com.fatec.es3.trilha.data.entity.Users;
import com.fatec.es3.trilha.data.entity.Products;

@Repository
public class UserPurchasedProductsDao {

	@PersistenceContext
	EntityManager entityManager;

	public PurchasedProductsDao findPurshProdById(int user_id) {
		return entityManager.find(PurchasedProducts.class, user_id);
	}

	public List<PurchasedPorducts> findAllPurshProd() {
		TypedQuery<PurchasedPorducts> namedQuery = entityManager.createNamedQuery("find_all_PurchasedPorducts", PurchasedPorducts.class);
		return namedQuery.getResultList();
	}

	public PurchasedPorducts updatePP(PurchasedPorducts pursh_prod) {
		return entityManager.merge(pursh_prod);
	}

	public PurchasedPorducts insertPP(PurchasedPorducts pursh_prod) {
		return entityManager.merge(pursh_prod);
	}

	public void deleteProductById(int user_id, int product_id) {
		PurchasedPorducts user_id = findPurshProdById(user_id);
		entityManager.remove(product_id);
	}
