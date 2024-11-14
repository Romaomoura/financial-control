package com.dev.romaomoura.FinancialControl.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int lastFourDigits;
    private LocalDateTime cardExpiration;
    private BigDecimal totalLimit;
    private BigDecimal limitUsed;
    private BigDecimal availableLimit;
    private LocalDateTime invoiceExpiration;
    @Enumerated(EnumType.STRING)
    private TypeCard typeCard;

    @OneToOne
    private WalletAccount walletAccount;

    private void setLimitUsed(BigDecimal availableLimit){
        //TODO Limite usado é o limite disponivel menos o limite total
        this.limitUsed = availableLimit.min(this.totalLimit);
    }

    private void setAvailableLimit(BigDecimal limitUsed){
        //TODO Limite disponivel é o limite usado menos o limite total
        this.availableLimit = limitUsed.min(this.totalLimit);
    }
}
