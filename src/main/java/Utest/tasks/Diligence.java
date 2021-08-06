package Utest.tasks;

import Utest.model.RegisterData;
import Utest.userinterface.UtestCheck;
import Utest.userinterface.UtestDiligenceBasic;
import Utest.userinterface.UtestDiligenceDevices;
import Utest.userinterface.UtestDiligenceLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Diligence implements Task {

    public static String name,lname, emaila, monthb, dayb, yearb;

    public static Diligence information(String f_name,String l_name,String email,String month, String day, String year) {
        name = f_name;
        lname = l_name;
        emaila = email;
        monthb = month;
        dayb   = day;
        yearb  = year;
        return Tasks.instrumented(Diligence.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(name).into(UtestDiligenceBasic.INPUT_FIRST_NAME),
        Enter.theValue(lname).into(UtestDiligenceBasic.INPUT_LAST_NAME),
        Enter.theValue(emaila).into(UtestDiligenceBasic.INPUT_EMAIL),
        SelectFromOptions.byVisibleText(monthb).from(UtestDiligenceBasic.INPUT_MONTH),
        SelectFromOptions.byVisibleText(dayb).from(UtestDiligenceBasic.INPUT_DAY),
        SelectFromOptions.byVisibleText(yearb).from(UtestDiligenceBasic.INPUT_YEAR),
        Click.on(UtestDiligenceBasic.NEXT_BUTTON),
        Enter.theValue("Bogotá").into(UtestDiligenceLocation.INPUT_CITY),
        Enter.theValue("1100111").into(UtestDiligenceLocation.INPUT_ZIP),
        Click.on(UtestDiligenceLocation.NEXT_BUTTON),
        Click.on(UtestDiligenceDevices.INPUT_COMPUTER),
        Enter.theValue("Windows").into(UtestDiligenceDevices.INPUT_COMPUTER_A),
        Click.on(UtestDiligenceDevices.INPUT_VERSION),
        Enter.theValue("7").into(UtestDiligenceDevices.INPUT_VERSION_A),
        Click.on(UtestDiligenceDevices.INPUT_LANGUAGE),
        Enter.theValue("Spanish").into(UtestDiligenceDevices.INPUT_LANGUAGE_A),

        //Click.on(UtestDiligenceDevices.INPUT_MOBILE),
        //Enter.theValue("HP").into(UtestDiligenceDevices.INPUT_MOBILE_A),
        //Click.on(UtestDiligenceDevices.INPUT_MODEL),
        //Enter.theValue("Veer").into(UtestDiligenceDevices.INPUT_MODEL_A),
        //Click.on(UtestDiligenceDevices.INPUT_OPERATING),
        //Enter.theValue("Android 4.0").into(UtestDiligenceDevices.INPUT_OPERATING_A),
        Click.on(UtestDiligenceDevices.NEXT_BUTTON),
        Enter.theValue("Clave.1234+").into(UtestCheck.INPUT_PASSWORD),
        Enter.theValue("Clave.1234+").into(UtestCheck.INPUT_CONFIRM_PASSWORD),
        Click.on(UtestCheck.INPUT_CHECK_A),
        Click.on(UtestCheck.INPUT_CHECK_B),
        Click.on(UtestCheck.COMPLETE_BUTTON)


        );
    }
}
