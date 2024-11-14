package com.dev.romaomoura.FinancialControl.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "detail-expense")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfInstallments;
    private Integer quantityPaid;
    private Integer quantityOpened;
    private String productDescription;
    private BigDecimal amount;
}
