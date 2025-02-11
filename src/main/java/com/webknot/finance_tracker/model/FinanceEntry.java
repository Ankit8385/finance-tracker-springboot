package com.webknot.finance_tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "finance_entries")
public class FinanceEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String category;
    private String type;
    private String description;
    private String date;

    // Getter and Setter
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
