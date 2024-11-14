package com.dev.romaomoura.FinancialControl.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "wallet-accounts")
public class WalletAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String holder;

    private String name;

    // O saldo deverá ser a soma das entradas menos as deduçoes de despesas naquela conta
    static BigDecimal balance;

    private String description;

}
