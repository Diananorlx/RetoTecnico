package Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDiligenceDevices extends PageObject {

    public static final Target INPUT_COMPUTER = Target.the("Computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_COMPUTER_A = Target.the("Computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    //
    public static final Target INPUT_VERSION = Target.the("Version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_VERSION_A = Target.the("Version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));

    public static final Target INPUT_LANGUAGE = Target.the("Language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_LANGUAGE_A = Target.the("Language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));


    public static final Target INPUT_MOBILE = Target.the("Mobile")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_A = Target.the("Mobile")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));


    public static final Target INPUT_MODEL = Target.the("Model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL_A = Target.the("Model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));

    public static final Target INPUT_OPERATING = Target.the("System Operating")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OPERATING_A = Target.the("System Operating")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_BUTTON = Target.the("Next button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
