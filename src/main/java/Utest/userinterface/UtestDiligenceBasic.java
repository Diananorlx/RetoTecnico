package Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDiligenceBasic extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("First name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("User email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Birth month")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Birth day")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Birth year")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Next button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a/span"));



}
