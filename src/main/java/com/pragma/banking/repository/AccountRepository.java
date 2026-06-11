package com.pragma.banking.repository;

import com.pragma.banking.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    boolean existsByAccountNumber(String accountNumber);
    boolean existsByAccountNumberAndIdNot(String accountNumber, Long id);
}