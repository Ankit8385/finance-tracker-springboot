package com.webknot.finance_tracker.service;

import com.webknot.finance_tracker.model.FinanceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webknot.finance_tracker.repository.FinanceRepository;

import java.util.List;

@Service
public class FinanceService {
    @Autowired
    private FinanceRepository repository;

    public FinanceEntry saveEntry(FinanceEntry entry) {
        return repository.save(entry);
    }

    public List<FinanceEntry> getAllEntries() {
        return repository.findAll();
    }

    public FinanceEntry getEntryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteEntry(Long id) {
         repository.deleteById(id);
    }

    public Double getTotalIncome() {
        return repository.getTotalIncome();
    }

    public Double getTotalExpense() {
        return repository.getTotalExpense();
    }
}
