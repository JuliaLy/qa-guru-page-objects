package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import pages.components.TextBoxCheckResultComponent;

public class TextBoxTests extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxCheckResultComponent textBoxCheckResultComponent = new TextBoxCheckResultComponent();
    @Test
    void fillTextBoxTest(){
        textBoxPage.openPage("\\text-box")
                .setName("Julia Lysakova")
                .setEmail("ulyaro@mail.ru")
                .setCurrentAddress("Test street, 12B")
                .setPermanentAddress("Test street, 12B")
                .submitButtonClick();

textBoxCheckResultComponent.verifyResultName("Julia Lysakova")
        .verifyResultEmail("ulyaro@mail.ru")
        .verifyResultCurrentAddress("Test street, 12B")
        .verifyResultPermanentAddress("Test street, 12B");
    }
}
