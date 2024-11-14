package com.dev.romaomoura.FinancialControl.domain.record;

import com.dev.romaomoura.FinancialControl.domain.Detail;
import com.dev.romaomoura.FinancialControl.domain.enums.StatusExpense;
import com.dev.romaomoura.FinancialControl.domain.enums.TypeExpense;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record ExpenseRecord(String expenseName, LocalDateTime dueDate, String description,
                            TypeExpense typeExpense, BigDecimal value, StatusExpense statusExpense,
                            Detail detail, Long cardId) {
}
