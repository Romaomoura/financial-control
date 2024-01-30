package com.dev.romaomoura.FinancialControl.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

@Embeddable
@Data
public class Details {
    private Integer NumberOfInstallments;
    private Integer quantityPaid;
    private Integer quantityOpened;
    private String productDescription;
    private BigDecimal Amount;
}
