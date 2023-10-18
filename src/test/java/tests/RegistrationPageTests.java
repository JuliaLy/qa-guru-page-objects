package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationPageTests extends TestBase{
    RegistrationPage regPage = new RegistrationPage();

@Test
    void successfulRegistrationTest(){
    regPage.openPage("/automation-practice-form")
            .setFirstName("Julia")
            .setLastName("Lysakova")
            .setUserEmail("ulyaro@mail.ru")
            .setGender("Female")
            .setUserNumber("1234567890")
            .setDateOfBirth("20","July", "1991")
            .uploadImage("AAOV9ga.jpg")
            .setAddress("Test street, 12B")
            .setState("NCR")
            .setCity("Delhi")
            .clickSubmitButton()
            .checkResultTable("Julia")
            .checkResultTable("Lysakova")
            .checkResultTable("ulyaro@mail.ru")
            .checkResultTable("Female")
            .checkResultTable("1234567890")
            .checkResultTable("20 " + "July," + "1991")
            .checkResultTable("AAOV9ga.jpg")
            .checkResultTable("Test street, 12B")
            .checkResultTable("NCR " +"Delhi" );
}
}
