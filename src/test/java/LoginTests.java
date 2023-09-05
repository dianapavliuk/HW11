import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test

    public void loginPositiveTest() {

        openLoginRegistrationForm();

        fillLoginRegistrationForm("love@mail.com", "abC121314#");

        pause(3000);

        Assert.assertTrue(isElementPresent(By.tagName("button")));

    }
}
