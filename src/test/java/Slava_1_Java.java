import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Slava_1_Java {
    @Test
    void myUdachniTests() {
        open("https://yandex.by/");
        $("[name=text]").setValue("selenide").pressEnter();
        $("[id=search-result]").shouldHave(text("selenide.org"));
        closeWindow();

        open("https://duckduckgo.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=r1-0]").shouldHave(text("selenide.org"));
    }
}
