package com.dev.romaomoura.FinancialControl.resource;

import com.dev.romaomoura.FinancialControl.domain.record.ExpenseRecord;
import com.dev.romaomoura.FinancialControl.service.ExpenseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense")
public class ExpenseResource {
    @Autowired
    private ExpenseService expenseService;

    @Operation(summary = "Cria uma nova despesa", description = "Endpoint para cadastrar uma nova despesa.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Despesa cadastrada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Falha ao cadastrar despesa")
    })
    @PostMapping()
    public ResponseEntity<String> create(@RequestBody ExpenseRecord expenseRecord){
        try {
            expenseService.create(expenseRecord);
            return new ResponseEntity<>("Despesa cadastrada com sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Falha ao cadastrar despesa: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
