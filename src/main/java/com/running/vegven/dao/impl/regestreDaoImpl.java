package com.running.vegven.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.running.vegven.dao.RegesterDao;
import com.running.vegven.model.Userinf;
import com.running.vegven.replyFormat.MessageConstant;
import com.running.vegven.replyFormat.Result;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Repository
public class regestreDaoImpl implements RegesterDao {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public Result addUserinf(Userinf userinf) {
		entityManager.persist(userinf);
		System.out.println("成功取得");
		return new Result(true, MessageConstant.ADD_User_Success,null);
	}
	@Override
	public Result getRegesterUser(Userinf UserId) {
		String sql = "SELECT u.account FROM userinf u WHERE u.account = :userId";
		List<Userinf> rs = entityManager.createQuery(sql, Userinf.class).getResultList();
		return new Result(true, MessageConstant.GET_USERLIST_SUCCESS, rs);
	}
	@Override
	public Userinf selectAccount(String account) {
		String sql = "SELECT u.account FROM Userinf u WHERE u.account = :account";
		TypedQuery<Userinf> query = entityManager.createQuery(sql, Userinf.class).
				setParameter("account", account);
		try {
			Userinf result = query.getSingleResult();
			System.out.println(account);
			return result;
		} catch (NoResultException e) {
			 System.out.println("No result found for account: " + account);
			 return null;
		}		
	}
	@Override
	public Userinf selectPassword(String password) {
		String sql = "SELECT u.account FROM Userinf u WHERE u.password = :password";
		TypedQuery<Userinf> query = entityManager.createQuery(sql, Userinf.class).
				setParameter("password", password);
		try {
			Userinf result = query.getSingleResult();
			System.out.println(password);
			return result;
		} catch (NoResultException e) {
			 System.out.println("No result found for password: " + password);
			 return null;
		}
	}
	@Override
	public Userinf selectEmail(String email) {
		String sql = "SELECT u.mail FROM Userinf u WHERE u.mail = :email";
		String mails = "'"+email+"'";
		System.out.println(mails);
		TypedQuery<Userinf> query = entityManager.createQuery(sql, Userinf.class).
				setParameter("email",mails);
		try {
			Userinf result = query.getSingleResult();
			System.out.println(query);
			return result;
		} catch (NoResultException e) {
			 System.out.println("No result found for mail: " + query);
			 return null;
		}
	}
	@Override
	public Userinf selectPhone(String phone) {
		String sql = "SELECT u.phone FROM Userinf u WHERE u.phone = :phone";
		TypedQuery<Userinf> query = entityManager.createQuery(sql, Userinf.class).
				setParameter("phone", phone);
		try {
			Userinf result = query.getSingleResult();
			System.out.println(phone);
			return result;
		} catch (NoResultException e) {
			 System.out.println("No result found for phone: " + phone);
			 return null;
		}
	}
}
