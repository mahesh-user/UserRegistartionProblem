package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    void givenEmailIdValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfEmailId("maheshbabu12@gmail.com"));
    }
    @Test
    void givenEmailIdValidatingWithRegexReturnsFalse(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfEmailId("maheshbabu12@@gmail.com"));
    }
    @Test
    void givenMobileNumberValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfMobileNumber("91 8353696252"));
    }

    @Test
    void givenMobileNumberValidatingWithRegexReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfMobileNumber("918353696252"));
    }
    @Test
    void givenPasswordValidatingWithMinEightCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleOne("mahes123"));
    }
    @Test
    void givenPasswordValidatingWithMinEightCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleOne("mah123"));
    }
    @Test
    void givenPasswordValidatingWithAtleastOneCapitalLetterReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleTwo("Mahesh123"));
    }
    @Test
    void givenPasswordValidatingWithoutOneCapitalLetterReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("mahesh123"));
    }
    @Test
    void givenPasswordValidatingWithAtLeastOneNumberReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleThree("Mahesh123"));
    }
    @Test
    void givenPasswordValidatingWithoutOneNumberReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleThree("maheshmahesh"));
    }
    @Test
    void givenPasswordValidatingWithAtLeastOneSpecialCharacterReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleFour("Mahesh123@"));
    }
    @Test
    void givenPasswordValidatingWithoutOneSpecialCharacterReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("maheshmahesh12234"));
    }
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com",
            "abc-100@abc.net", "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    void givenEmailIdsShouldReturnTrue(String str){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfEmailId(str));
    }
    @Test
    void givenUserDetailsShouldReturnHappy(){
        UserDetails userDetails = new UserDetails("Mahesh","Babu","maheshbabu12@gmail.com","91 9666069691","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Happy",userRegistration.validationOfAllDetails(userDetails));
    }
    @Test
    void givenUserDetailsShouldReturnSad(){
        UserDetails userDetails = new UserDetails("Mahesh","babu","maheshbabu12@gmail.com","91 9666569291","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Sad",userRegistration.validationOfAllDetails(userDetails));
    }

}
