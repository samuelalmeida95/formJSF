package br.com.samuel.formJSF.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.samuel.formJSF.jpautil.JPAUtil;

public class DaoGeneric<T> {

	public void salvar(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(entidade);
		entityTransaction.commit();
		entityManager.close();
	}

	public T merge(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		T retorno = entityManager.merge(entidade);
		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}

	public void delete(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.remove(entidade);
		entityTransaction.commit();
		entityManager.close();
	}

	public void deletePorId(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Object id = JPAUtil.getPrimaryKey(entidade);

		entityManager.createQuery("delete from " + 
								   entidade.getClass().getCanonicalName() +
								   " where id = " + id).executeUpdate();
		
		entityTransaction.commit();
		entityManager.close();
	}
}
