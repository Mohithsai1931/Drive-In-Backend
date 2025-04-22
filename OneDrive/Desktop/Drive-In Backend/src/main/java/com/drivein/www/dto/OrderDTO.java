package com.drivein.www.dto;

import java.util.List;

public class OrderDTO {
    private Long id;
    private Long userId;
    private List<Long> itemIds;
    private double totalAmount;
    private String orderTime;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    public List<Long> getItemIds() { return itemIds; }

    public void setItemIds(List<Long> itemIds) { this.itemIds = itemIds; }

    public double getTotalAmount() { return totalAmount; }

    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public String getOrderTime() { return orderTime; }

    public void setOrderTime(String orderTime) { this.orderTime = orderTime; }
}
