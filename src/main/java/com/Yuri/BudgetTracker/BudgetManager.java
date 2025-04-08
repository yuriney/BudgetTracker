package com.Yuri.BudgetTracker;

import com.Yuri.BudgetTracker.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class BudgetManager {

    @Autowired
    public Transaction transaction;

    public Transaction addIncome(Transaction transaction){
        transaction.setType("Income");
        return transaction;
    }
}
