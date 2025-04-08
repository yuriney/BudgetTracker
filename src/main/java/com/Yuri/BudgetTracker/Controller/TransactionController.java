package com.Yuri.BudgetTracker.Controller;

import com.Yuri.BudgetTracker.Entity.Transaction;
import com.Yuri.BudgetTracker.Repository.TransactionRepository;
import com.Yuri.BudgetTracker.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Transaction> getAll(){
        return transactionService.getAllTransaction();
    };

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Transaction saveTransaction(@RequestBody Transaction transaction){
        return transactionService.postTransaction(transaction);
    }
}
