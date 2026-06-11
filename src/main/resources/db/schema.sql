CREATE TABLE accounts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR(255) NOT NULL,
    balance DECIMAL NOT NULL,
    client_name VARCHAR(255) NOT NULL
);