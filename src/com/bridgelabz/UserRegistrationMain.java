package com.bridgelabz;
import java.util.regex.Pattern;
interface Validation{
        String Validate(String regex,String userdtarils);
}
public class UserRegistrationMain {
    public static void main(String[] args) {
        Validation ValidFisrtName = (pattern, firstname) -> {
            return "first name  " + Pattern.compile(pattern).matcher(firstname).matches();
        };
        System.out.println(ValidFisrtName.Validate("^[A-Z]+[a-z]{2,}", "Mahesh"));
        Validation ValidLastName = (pattern, lastname) -> {
            return "last name  " + Pattern.compile(pattern).matcher(lastname).matches();
        };
        System.out.println(ValidLastName.Validate("^[A-Z]+[a-z]{2,}", "Babu"));

    Validation ValidEmailId = (pattern, emailid) -> {
        return "emailid  " + Pattern.compile(pattern).matcher(emailid).matches();
    };
        System.out.println(ValidEmailId.Validate("^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$","maheshbabu12@gmail.com"));
        Validation ValidPhoneNUmber = (pattern,phonenumber)->{
            return "phone number  " + Pattern.compile(pattern).matcher(phonenumber).matches();
        };
        System.out.println(ValidPhoneNUmber.Validate("^[0-9]{2}+ +[0-9]{10}$","91 8353696252"));
        Validation ValidPassWord = (pattern , password)->{
            return "password  " +Pattern.compile(pattern).matcher(password).matches();
        };
        System.out.println(ValidPassWord.Validate("^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$", "Mahes123:WQ"));
    }

}
