package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();
    TableComponent table = new TableComponent();

    SelenideElement titleLabel = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            cityWrapper = $(("#stateCity-wrapper")),
            submitButton = $("#submit");

    public RegistrationPage openPage(String pageAddress) {
        open(pageAddress);
        titleLabel.shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubject(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage selectHobby(String hobby) {
        hobbiesWrapper.$(byText(hobby)).click();
        return this;
    }

    public RegistrationPage uploadImage(String fileName) {
        uploadPictureInput.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        currentAddressInput.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        stateInput.click();
        stateInput.$(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity(String city) {
        cityInput.click();
        cityWrapper.$(byText(city)).click();
        return this;
    }

    public RegistrationPage clickSubmitButton() {
        submitButton.click();
        return this;
    }
    public RegistrationPage checkResultTable(String value) {
        table.checkResultTable(value);
        return this;
    }
}
