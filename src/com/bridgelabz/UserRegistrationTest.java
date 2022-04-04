package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//purpose:here these class verify  JUnit Test Methods
//          and Parameterised Test Method for following
//            user regisration probles

//Auther: mahesh babu
public class UserRegistrationTest {
    /**
     * this method is to verify or validate the user first name
     * @return true
     */

    @Test
    void givenFirstNameWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfFirstName("Mahesh"));
    }
    /**
     * this method is to verify or validate the user first name
     * @return  false
     */

    @Test
    void givenFirstNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfFirstName("mahesh"));
    }
    /**
     * this method is to verify or validate the user last name
     * @return true
     */
    @Test
    void givenLasNameWithFirstLetterCapitalMInThreeCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfLastName("Mahesh"));
    }
    /**
     * this method is to verify or validate the user last name
     * @return  false
     */
    @Test
    void givenLastNameWithOutFirstLetterCapitalMInThreeCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfLastName("mahesh"));
    }
    /**
     * this method is to verify the user entered emailId
     * @return true
     */
    @Test
    void givenEmailIdValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfEmailId("maheshbabu12@gmail.com"));
    }
    /**
     * this method is to verify the user entered emailId
     * @return false
     */
    @Test
    void givenEmailIdValidatingWithRegexReturnsFalse(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfEmailId("maheshbabu12@@gmail.com"));
    }
    /**
     * this is to check the password with minimum eight characters
     * @return true
     */
    @Test
    void givenMobileNumberValidatingWithRegexReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfMobileNumber("91 8353696252"));
    }
    /**
     * this is to check the password with minimum eight characters
     * @return false
     */
    @Test
    void givenMobileNumberValidatingWithRegexReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfMobileNumber("918353696252"));
    }
    /**
     * this is to check the password with minimum eight characters
     * @return true
     */
    @Test
    void givenPasswordValidatingWithMinEightCharactersReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleOne("Mahes123"));
    }
    /**
     * this is to check the password with minimum eight characters
     * @return false
     */
    @Test
    void givenPasswordValidatingWithMinEightCharactersReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleOne("mah123"));
    }

    @Test
    /**
     * this method is to validate the password with atleast one Upper case
     * @return true
     */
    void givenPasswordValidatingWithAtleastOneCapitalLetterReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleTwo("Mahesh123"));
    }
    /**
     * this method is to validate the password with atleast one Upper case
     * @return false
     */
    @Test
    void givenPasswordValidatingWithoutOneCapitalLetterReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleTwo("mahesh123"));
    }
    /**
     * this method is to validate password with atleast one number
     * @return true
     */
    @Test
    void givenPasswordValidatingWithAtLeastOneNumberReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleThree("Mahesh123"));
    }
    /**
     * this method is to validate password with atleast one number
     * @return false
     */
    @Test
    void givenPasswordValidatingWithoutOneNumberReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validationOfPasswordRuleThree("maheshmahesh"));
    }
    /**
     * this method is to validate password with Exactly one special character
     * @return true
     */
    @Test
    void givenPasswordValidatingWithAtLeastOneSpecialCharacterReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validationOfPasswordRuleFour("Mahesh123@"));
    }
    /**
     * this method is to validate password with Exactly one special character
     * @return false
     */
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
    /**
     * this method is to validate email sample provide saparately
     * @return true
     */
    @Test
    void givenUserDetailsShouldReturnHappy(){
        UserDetails userDetails = new UserDetails("Mahesh","Babu","maheshbabu12@gmail.com","91 9666069691","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Happy",userRegistration.validationOfAllDetails(userDetails));
    }
    /**
     * this method is to validate email sample provide saparately
     * @return false
     */
    @Test
    void givenUserDetailsShouldReturnSad(){
        UserDetails userDetails = new UserDetails("Mahesh","babu","maheshbabu12@gmail.com","91 9666569291","9966988298Ki@");
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Sad",userRegistration.validationOfAllDetails(userDetails));
    }

}
