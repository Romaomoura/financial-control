package com.dev.romaomoura.FinancialControl.service;

import com.dev.romaomoura.FinancialControl.domain.Expense;
import com.dev.romaomoura.FinancialControl.domain.record.ExpenseRecord;
import com.dev.romaomoura.FinancialControl.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ModelMapper modelMapper;

    public void create(ExpenseRecord expenseRecord){
        expenseRepository.save(modelMapper.map(expenseRecord, Expense.class));
    }
}
