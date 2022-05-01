package com.letscode.bankservice.controller;

import com.letscode.bankservice.dto.AccountNumberResponse;
import com.letscode.bankservice.services.AccountNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
@RequiredArgsConstructor
public class AccountNumberController {

    private final AccountNumberService accountNumberService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AccountNumberResponse create() {
        return accountNumberService.create();
    }
}
