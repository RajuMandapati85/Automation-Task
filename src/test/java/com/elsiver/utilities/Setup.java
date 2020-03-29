package com.elsiver.utilities;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by vmandapati on 27/03/2020.
 */


public class Setup extends DriverFactory {

    public static DriverFactory driver = new DriverFactory();

    @BeforeClass
    public static void setupDriver(){
        driver.initialiseDriver();
    }

    @AfterClass
    public static void destroyDriver(){
        if(DriverFactory.driver != null){
            DriverFactory.driver.quit();
            DriverFactory.driver = null;
        }
    }

}





