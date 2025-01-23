package com.clinicmanagementsystem.clinicmanagementsystem;

public class Patient extends User {
    private int age;
    private String phoneNumber;

    public Patient(int userId, String name, String email, String password, String role, int age, String phoneNumber) {
        super(userId, name, email, password, role);
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void register() {
        // Implementation
    }

    public void viewAvailableDoctors() {
        // Implementation
    }
}
