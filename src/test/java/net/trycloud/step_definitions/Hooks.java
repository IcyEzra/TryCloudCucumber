package net.trycloud.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.trycloud.utilities.Driver;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("-------Setting up browser with further details....");
    }


    @After
    public void afterScenario(){
        System.out.println("-------Returning test results and closing browser");
        Driver.closeDriver();
    }

}
