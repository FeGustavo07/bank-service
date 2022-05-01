package com.letscode.bankservice.services.impl;

import com.letscode.bankservice.dto.AccountNumberResponse;
import com.letscode.bankservice.models.AccountNumber;
import com.letscode.bankservice.repository.AccountNumberRepository;
import com.letscode.bankservice.services.AccountNumberService;
import com.letscode.bankservice.utils.GenerateNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountNumberServiceImpl implements AccountNumberService {

    private final AccountNumberRepository accountNumberRepository;

    @Override
    public AccountNumberResponse create() {
        GenerateNumber generateNumber = new GenerateNumber();
        var accountNumber = AccountNumber.builder().number(generateNumber.execute()).build();
        accountNumberRepository.save(accountNumber);
        return new AccountNumberResponse(accountNumber);
    }
}
