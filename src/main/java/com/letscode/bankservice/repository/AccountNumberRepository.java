package com.letscode.bankservice.repository;

import com.letscode.bankservice.models.AccountNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountNumberRepository extends JpaRepository<AccountNumber, Long> {
}
