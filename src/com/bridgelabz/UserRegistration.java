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
}
