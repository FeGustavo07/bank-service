package com.letscode.bankservice.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "account_number")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountNumber {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private int number;
}
