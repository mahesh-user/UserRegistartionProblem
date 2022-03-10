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
    public boolean validationOfMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        return mobileNumber.matches(regex);
    }
    public boolean validationOfPasswordRuleOne(String password) {
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    public boolean validationOfPasswordRuleTwo(String password) {
        String regex = "^(?=.*[A-Z])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    public boolean validationOfPasswordRuleThree(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
}
