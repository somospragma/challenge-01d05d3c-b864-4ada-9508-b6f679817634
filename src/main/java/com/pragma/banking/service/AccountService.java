package com.pragma.banking.service;

import com.pragma.banking.dto.AccountDTO;
import com.pragma.banking.exception.AccountNotFoundException;
import com.pragma.banking.repository.AccountRepository;
import com.pragma.banking.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public AccountDTO createAccount(AccountDTO accountDTO) {
        if (accountRepository.existsByAccountNumber(accountDTO.getAccountNumber())) {
            throw new AccountNotFoundException("Account number must be unique");
        }
        Account account = new Account();
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setBalance(accountDTO.getBalance());
        account.setClientName(accountDTO.getClientName());
        Account savedAccount = accountRepository.save(account);
        return new AccountDTO(savedAccount.getId(), savedAccount.getAccountNumber(), savedAccount.getBalance(), savedAccount.getClientName());
    }

    @Transactional
    public AccountDTO getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found"));
        return new AccountDTO(account.getId(), account.getAccountNumber(), account.getBalance(), account.getClientName());
    }

    @Transactional
    public AccountDTO updateAccount(Long id, AccountDTO accountDTO) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found"));
        if (accountRepository.existsByAccountNumberAndIdNot(accountDTO.getAccountNumber(), id)) {
            throw new AccountNotFoundException("Account number must be unique");
        }
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setBalance(accountDTO.getBalance());
        account.setClientName(accountDTO.getClientName());
        Account updatedAccount = accountRepository.save(account);
        return new AccountDTO(updatedAccount.getId(), updatedAccount.getAccountNumber(), updatedAccount.getBalance(), updatedAccount.getClientName());
    }

    @Transactional
    public void deleteAccount(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found"));
        accountRepository.delete(account);
    }
}