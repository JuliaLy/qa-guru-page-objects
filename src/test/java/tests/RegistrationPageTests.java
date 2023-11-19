package tests;

import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationPageTests extends TestBase{
    RegistrationPage regPage = new RegistrationPage();
    TestData testData=new TestData();

@Test
    void successfulRegistrationTest(){
    SelenideLogger.addListener("allure", new AllureSelenide());
    regPage.openPage()
            .hideBanner()
            .setFirstName(testData.randomName)
            .setLastName(testData.randomLastName)
            .setUserEmail(testData.randomEmail)
            .setGender(testData.randomGender)
            .setUserNumber(testData.randomNumber)
            .setDateOfBirth(testData.randomDay, testData.randomMonth, testData.randomYear)
            .setSubject(testData.randomSubject)
            .selectHobby(testData.randomHobbi)
            .uploadImage(testData.randomPicture)
            .setAddress(testData.randomAdress)
            .setState(testData.randomState)
            .setCity(testData.randomStateCity)
            .clickSubmitButton()
            .checkResultTable(testData.randomName+ " " +testData.randomLastName)
            .checkResultTable(testData.randomEmail)
            .checkResultTable(testData.randomGender)
            .checkResultTable(testData.randomNumber)
            .checkResultTable(testData.randomDay+ " " +testData.randomMonth+ "," +testData.randomYear)
            .checkResultTable(testData.randomSubject)
            .checkResultTable(testData.randomHobbi)
            .checkResultTable(testData.randomPicture)
            .checkResultTable(testData.randomAdress)
            .checkResultTable(testData.randomState+" "+testData.randomStateCity);
}
}
