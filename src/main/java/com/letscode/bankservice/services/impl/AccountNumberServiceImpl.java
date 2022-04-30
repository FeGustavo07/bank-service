package com.letscode.bankservice.services.impl;

import com.letscode.bankservice.dto.AccountNumberResponse;
import com.letscode.bankservice.models.AccountNumber;
import com.letscode.bankservice.repository.AccountNumberRepository;
import com.letscode.bankservice.services.AccountNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class AccountNumberServiceImpl implements AccountNumberService {

    private final AccountNumberRepository accountNumberRepository;

    @Override
    public AccountNumberResponse create() {
        AccountNumber accountNumber = new AccountNumber();
        Random generator = new Random();
        accountNumber.setNumber(generator.nextInt(100) * 10);
        accountNumberRepository.save(accountNumber);
        return new AccountNumberResponse(accountNumber);
    }
}
