package net.trycloud.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    public void setUpScenario(){
        System.out.println("-------Setting up browser with further details....");
    }



    public void afterScenario(){
        System.out.println("-------Returning test results and closing browser");
    }

}
