package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {
    @Test
    void givenFirstNameWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfFirstName("Mahesh"));
    }

    @Test
    void givenFirstNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfFirstName("bhavi"));
    }
    @Test
    void givenLastWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfLastName("Mahesh"));
    }

    @Test
    void givenLastNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfLastName("bhavi"));
    }
}
