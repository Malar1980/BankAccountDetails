package org.malar.service.impl;

import java.util.List;

import org.malar.dao.AccountDao;
import org.malar.entity.Account;
import org.malar.exception.AccountNotFoundException;
import org.malar.service.api.AccountService;
import org.malar.service.to.AccountList;
import org.malar.service.to.AccountRequest;
import org.malar.service.to.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;

	@Override
	@Transactional
	public AccountResponse createAccountService(AccountRequest accountRequest) throws Exception {
		AccountResponse accountResponse = new AccountResponse();
		Account account = new Account();
		if (accountRequest.getAccnumber() != 0) {
			account.setAccnumber(accountRequest.getAccnumber());

		} else {
			throw new AccountNotFoundException();
		}

		double balance = 0.0;
		account.setAcccreateddate(accountRequest.getAcccreateddate());
		account.setAccname(accountRequest.getAccname());
		account.setAcctype(accountRequest.getAcctype());
		account.setAccupdateddate(accountRequest.getAccupdateddate());
		account.setAccbalance(balance);

		Account accountReturn = new Account();
		accountReturn = accountDao.createAccount(account);

		accountResponse.setAccnumber(accountReturn.getAccnumber());
		accountResponse.setAccname(accountReturn.getAccname());
		accountResponse.setAccbalance(accountReturn.getAccbalance());
		accountResponse.setMessage("Your Account Successfully Created");

		return accountResponse;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Transactional
	@Override
	public AccountResponse deleteAccountService(long accNumber) throws AccountNotFoundException {

		if (accNumber != 0) {
			AccountResponse accountResponse = new AccountResponse();
			Account accountReturn = new Account();
			accountReturn = accountDao.deleteAccount(accNumber);
			accountResponse.setAccnumber(accountReturn.getAccnumber());
			accountResponse.setAccname(accountReturn.getAccname());
			accountResponse.setId(accountReturn.getId());
			accountResponse.setMessage("Your Account Successfully Deleted");
			return accountResponse;
		} else {
			throw new AccountNotFoundException();
		}

	}

	public AccountResponse withdrawService(AccountRequest accountRequest) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountResponse depositService(AccountRequest accountRequest) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public AccountResponse checkBalanceService(long accNumber) throws AccountNotFoundException {

		Account account = accountDao.checkBalance(accNumber);
		AccountResponse accountResponse = new AccountResponse();
		accountResponse.setAccnumber(account.getAccnumber());
		accountResponse.setAccname(account.getAccname());
		accountResponse.setId(account.getId());
		accountResponse.setAccbalance(account.getAccbalance());
		return accountResponse;

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public AccountList viewAllAccountService() {
		AccountList accountListAll = new AccountList();
		System.out.println("view all2***8******************************************************************************************");
		List<Account> accountlist = accountDao.ViewAll();
		System.out.println("view all3***8******************************************************************************************");
		for (Account account : accountlist) {
			AccountResponse accountResponse = new AccountResponse();
			accountResponse.setAccnumber(account.getAccnumber());
			accountResponse.setAccname(account.getAccname());
			accountResponse.setId(account.getId());
			accountResponse.setAccbalance(account.getAccbalance());
			accountListAll.getAccountList().add(accountResponse);

		}

		return accountListAll;

	}

}
