package com.Yuri.BudgetTracker.Service;

import com.Yuri.BudgetTracker.Entity.Transaction;
import com.Yuri.BudgetTracker.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getAllTransaction(){
        return transactionRepository.findAll();
    }

    public Transaction postTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

}
