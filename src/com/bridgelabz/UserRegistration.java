package com.bridgelabz;
//purpose: here these class verify user registration using Java Regular Expressions
//          and Patterns  with valid first name,valid last name,valid email,
//          valid password with different charactersand valid phone number


//Auther: mahesh babu

public class UserRegistration {
/**
 * this method is to verify or validate the user first name
 * @param str
 */

    public boolean validationOfFirstName(String str) {
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }
    /**
     * this method is to verify the user entered last name
     * @param str
     */

    public boolean validationOfLastName(String str) {
        String regex = "^[A-Z]+[a-z]{2,}";
        return str.matches(regex);
    }
    /**
     * this method is to verify the user entered emailId
     * @param emailId
     */
    public boolean validationOfEmailId(String emailId) {
        String regex = "^[A-Za-z0-9-+._]+@[a-z0-9]+(.[a-z]{2,3})+$";
        return emailId.matches(regex);
    }
    /**
     * this method is to check the user entered mobile number
     * @param mobileNumber
     */
    public boolean validationOfMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        return mobileNumber.matches(regex);
    }
    /**
     * this is to check the password with minimum eight characters
     * @param password
     */
    public boolean validationOfPasswordRuleOne(String password) {
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    /**
     * this method is to validate the password with atleast one Upper case
     * @param password
     */
    public boolean validationOfPasswordRuleTwo(String password) {
        String regex = "^(?=.*[A-Z])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    /**
     * this method is to validate password with atleast one number
     * @param password
     */
    public boolean validationOfPasswordRuleThree(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    /**
     * this method is to validate password with Exactly one special character
     * @param password
     */
    public boolean validationOfPasswordRuleFour(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[._@#$%&^*()+:?])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    /**
     * this method is to validate user email sample provide saparately
     * @param userDetails
     */
    public String validationOfAllDetails(UserDetails userDetails) {
        if ((this.validationOfFirstName(userDetails.firstName)) && (this.validationOfLastName(userDetails.lastName))
                && (this.validationOfEmailId(userDetails.email)) && (this.validationOfMobileNumber(userDetails.mobile)) &&
                (this.validationOfPasswordRuleFour(userDetails.password))){
            return "Happy";
        }
        else
            return "Sad";
    }
}
