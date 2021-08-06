package Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UtestCheck extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("First password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Second password")
            .located(By.id("confirmPassword"));

    public static final Target INPUT_CHECK_A = Target.the("First check")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target INPUT_CHECK_B = Target.the("Second check")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_BUTTON = Target.the("Complete button")
            .located(By.id("laddaBtn"));


}
