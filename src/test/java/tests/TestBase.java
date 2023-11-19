package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = System.getProperty("browser","chrome");
        Configuration.browserVersion = System.getProperty("version","100");
        Configuration.browserSize = System.getProperty("size", "1920X1280");
        Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }
}