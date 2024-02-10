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

    private String name;
    private LocalDateTime paymentDate;
    private LocalDateTime dueDate;
    private String description;

    @Enumerated(EnumType.STRING)
    private TypeExpense typeExpense;
    private BigDecimal value;
    private StatusExpense statusExpense;

    @OneToOne
    private Detail detail;

    @ManyToOne
    private Card card;

    private void setStatusExpensiveLate(){
        if ( (this.paymentDate == null) && (this.dueDate.isBefore(LocalDateTime.now()) )){
            this.statusExpense = StatusExpense.DELAYED_EXPENSES;
        }
    }
}
