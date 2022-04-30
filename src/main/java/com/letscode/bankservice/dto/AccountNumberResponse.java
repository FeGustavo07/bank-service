package com.letscode.bankservice.dto;

import com.letscode.bankservice.models.AccountNumber;

public class AccountNumberResponse {
    private int number;

    public AccountNumberResponse(AccountNumber accountNumber) {
        this.number = accountNumber.getNumber();
    }
}
