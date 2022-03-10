package com.bridgelabz;

public class UserRegistration {
    public boolean validationOfFirstName(String str) {
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }
    public boolean validationOfLastName(String str) {
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }
    public boolean validationOfEmailId(String emailId) {
        String regex = "^[A-Za-z0-9-+._]+@[a-z0-9]+(.[a-z]{2,3})+$";
        return emailId.matches(regex);
    }
}
