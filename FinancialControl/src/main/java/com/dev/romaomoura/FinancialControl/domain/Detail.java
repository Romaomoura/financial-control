package com.dev.romaomoura.FinancialControl.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Embeddable
public class Detail {
    private Integer NumberOfInstallments;
    private Integer quantityPaid;
    private Integer quantityOpened;
    private String productDescription;
    private BigDecimal Amount;
}
