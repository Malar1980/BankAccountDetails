package org.malar.dao;
import java.util.List;

import org.malar.entity.Account;
import org.malar.exception.AccountNotFoundException;
public interface AccountDao {


	public Account deleteAccount(long accnumber) throws AccountNotFoundException;
	public Account createAccount(Account account) throws AccountNotFoundException;
	public Account depositMoney(long accnumber) throws AccountNotFoundException;
	public Account withdrawMoney(long accnumber) throws AccountNotFoundException;
	public List<Account> ViewAll();
	public Account checkBalance(long accnumber) throws AccountNotFoundException;
	

}
