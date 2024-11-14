package com.dev.romaomoura.FinancialControl.repository;

import com.dev.romaomoura.FinancialControl.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
