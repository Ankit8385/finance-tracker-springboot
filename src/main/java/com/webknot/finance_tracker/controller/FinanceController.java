package com.webknot.finance_tracker.controller;

import com.webknot.finance_tracker.model.FinanceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.webknot.finance_tracker.service.FinanceService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/entries")
public class FinanceController {
    @Autowired
    private FinanceService service;

    @PostMapping
    public FinanceEntry createEntry(@RequestBody FinanceEntry entry) {
        return service.saveEntry(entry);
    }

    @GetMapping
    public List<FinanceEntry> getAllEntries() {
        return service.getAllEntries();
    }

    @GetMapping("/{id}")
    public FinanceEntry getEntryById(@PathVariable Long id) {
        return service.getEntryById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable Long id) {
        service.deleteEntry(id);
    }

    @GetMapping("/summary")
    public Map<String, Object> getSummary() {
        Map<String, Object> response = new HashMap<>();
        response.put("totalIncome", service.getTotalIncome());
        response.put("totalExpenses", service.getTotalExpense());
        response.put("message", "Financial summary retrieved successfully");
        return response;
    }
}
