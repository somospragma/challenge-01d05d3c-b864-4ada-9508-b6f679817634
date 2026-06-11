package com.pragma.banking.dto;

public class AccountDTO {
    private Long id;
    private String accountNumber;
    private Double balance;
    private String clientName;

    public AccountDTO() {}

    public AccountDTO(Long id, String accountNumber, Double balance, String clientName) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientName = clientName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}