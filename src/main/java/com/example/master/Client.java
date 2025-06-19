package com.example.master;

public class Client {
    private static int counter = 1;
    private final int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phone;

    public Client(String firstName, String lastName, String middleName, String phone) {
        this.id = counter++;
        this.firstName = isEmpty(firstName) ? null : firstName;
        this.lastName = isEmpty(lastName) ? null : lastName;
        this.middleName = isEmpty(middleName) ? null : middleName;
        this.phone = isEmpty(phone) ? null : phone;
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = isEmpty(firstName) ? null : firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = isEmpty(lastName) ? null : lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = isEmpty(middleName) ? null : middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = isEmpty(phone) ? null : phone;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nИмя: " + (firstName != null ? firstName : "не указано") +
                "\nФамилия: " + (lastName != null ? lastName : "не указано") +
                "\nОтчество: " + (middleName != null ? middleName : "не указано") +
                "\nТелефон: " + (phone != null ? phone : "не указан");
    }
}