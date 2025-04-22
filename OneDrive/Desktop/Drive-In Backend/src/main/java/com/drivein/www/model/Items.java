package com.drivein.www.model;

import jakarta.persistence.*;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private boolean available;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private MenuCategory category;

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    public MenuCategory getCategory() { return category; }

    public void setCategory(MenuCategory category) { this.category = category; }
}
