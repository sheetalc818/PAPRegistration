package com.bridgelabz.selenium;

import pages.*;
import baseclass.BaseClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class Registration_Test extends BaseClass {

    Ph_Num_Field ph;
    Full_Name_Field name;
    Email_Field email;
    Education_Qualification qualification;
    PassOut_Field passout;
    Location location;
    Registration registration;

    public Registration_Test() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization();
        ph = new Ph_Num_Field(driver);
        name = new Full_Name_Field(driver);
        email = new Email_Field(driver);
        qualification = new Education_Qualification(driver);
        passout = new PassOut_Field(driver);
        location = new Location(driver);
        registration = new Registration(driver);
    }
    @Test
    public void valid_registration() throws InterruptedException, AWTException {
        ph.valid_phNumber();
        name.valid_FullName(prop.getProperty("Valid_FullName"));
        email.valid_email_id(prop.getProperty("Valid_EmailId"));
        qualification.eduction_Qualification(prop.getProperty("Masters_Cs_Or_It"));
        passout.passOut_Year(prop.getProperty("Before_TwoThousandTwenty"));
        location.location(prop.getProperty("Mumbai"));
        registration.click_RegisterNow();
        Thread.sleep(3000);
    }

}
