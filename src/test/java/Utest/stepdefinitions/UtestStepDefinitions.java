package Utest.stepdefinitions;

import Utest.model.RegisterData;
import Utest.tasks.Diligence;
import Utest.tasks.OpenUp;
import Utest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.ArrayList;
import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^than a user called Diana who enters the test page and click the register button$")
    public void thanAUserCalledDianaWhoEntersTheTestPageAndClickTheRegisterButton()  {
        OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.thePage(),(Register.onThePage()));
    }



    @When("^she Diligence the form$")
    public void sheDiligenceTheForm(List<String> datos)  {
        String f_name = datos.get(0);
        String l_name = datos.get(1);
        String email = datos.get(2);
        String month = datos.get(3);
        String day = datos.get(4);
        String year = datos.get(5);
        OnStage.theActorInTheSpotlight().attemptsTo(Diligence.information(f_name,l_name,email,month,day,year));
    }

    @Then("^it is registered on the web$")
    public void itIsRegisteredOnTheWeb()  {

    }



}
