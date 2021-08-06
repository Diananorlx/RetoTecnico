package Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDiligenceLocation extends PageObject {
    public static final Target INPUT_CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Zip")
            .located(By.id("zip"));
    public static final Target NEXT_BUTTON = Target.the("Button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
