package com.webknot.finance_tracker.repository;

import com.webknot.finance_tracker.model.FinanceEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FinanceRepository extends JpaRepository<FinanceEntry, Long> {
    @Query("SELECT SUM(amount) FROM FinanceEntry WHERE type = 'income'")
    Double getTotalIncome();

    @Query("SELECT SUM(amount) FROM FinanceEntry WHERE type = 'expense'")
    Double getTotalExpense();
}
