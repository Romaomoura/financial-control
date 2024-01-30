package com.dev.romaomoura.FinancialControl.domain;

import com.dev.romaomoura.FinancialControl.domain.enums.StatusExpense;
import com.dev.romaomoura.FinancialControl.domain.enums.TypeExpense;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expenseName;
    private LocalDateTime PaymentDate;
    private LocalDateTime dueDate;
    private String description;

    @Enumerated(EnumType.STRING)
    private TypeExpense typeExpense;
    private BigDecimal value;
    private StatusExpense statusExpense;

    @Embedded
    private Details details;
}
