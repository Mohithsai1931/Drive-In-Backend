package com.drivein.www.dto;

public class UserDTO {
    private Long id;
    private String username;
    private String phone;
    private String vehicleNumber;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getVehicleNumber() { return vehicleNumber; }

    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
}
