package org.malar.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.malar.dao.AccountDao;
import org.malar.entity.Account;
import org.malar.exception.AccountNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AccountDaoImpl implements AccountDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Account deleteAccount(long accnumber) throws AccountNotFoundException {

		Account result = checkBalance(accnumber);
		if (result != null) {

			manager.remove(result);
			return result;
		} else {
			throw new AccountNotFoundException("accnumber Not Found");
		}
	}

	public Account createAccount(Account account) throws AccountNotFoundException {
		manager.persist(account);

		return account;

	}

	public Account depositMoney(long accnumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Account withdrawMoney(long accnumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> ViewAll() {
		System.out.println("ViewAll***8******************************************************************************************");

		List<Account> accountList = manager.createQuery("Select a From Account a",Account.class).getResultList();
		return accountList;
		
		
	}

	@Override
	public Account checkBalance(long accnumber) throws AccountNotFoundException {

		Account result = (Account) manager.find(Account.class, accnumber);
		if (result != null) {

			Account account = result;
			System.out.println("View By Accnuber" + account.getId());
			return account;
		} else {
			throw new AccountNotFoundException("accountNumber Not Found");
		}

	}

}
