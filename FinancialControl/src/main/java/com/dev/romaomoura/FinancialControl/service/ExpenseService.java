package com.dev.romaomoura.FinancialControl.service;

import com.dev.romaomoura.FinancialControl.domain.Expense;
import com.dev.romaomoura.FinancialControl.domain.record.ExpenseRecord;
import com.dev.romaomoura.FinancialControl.repository.ExpenseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;
    @Autowired
    ModelMapper modelMapper;
    public void create(ExpenseRecord expenseRecord){
        expenseRepository.save(modelMapper.map(expenseRecord, Expense.class));
    }
}
