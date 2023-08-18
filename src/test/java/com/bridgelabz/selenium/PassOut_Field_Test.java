package com.bridgelabz.selenium;

import pages.PassOut_Field;
import baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.awt.*;
import java.io.IOException;

public class PassOut_Field_Test extends BaseClass {
    PassOut_Field passout;

    public PassOut_Field_Test() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization();
        passout = new PassOut_Field(driver);
    }
    @Test
    public void select_TwoThousandTwentyFour() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("TwoThousandTwentyFour"));
        Assert.assertEquals(msg,"2024");
    }
    @Test
    public void select_TwoThousandTwentyThree() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("TwoThousandTwentyThree"));
        Assert.assertEquals(msg,"2023");
    }
    @Test
    public void select_TwoThousandTwentyTwo() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("TwoThousandTwentyTwo"));
        Assert.assertEquals(msg,"2022");
    }
    @Test
    public void select_TwoThousandTwentyOne() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("TwoThousandTwentyOne"));
        Assert.assertEquals(msg,"2021");
    }
    @Test
    public void select_TwoThousandTwenty() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("TwoThousandTwenty"));
        Assert.assertEquals(msg,"2020");
    }
    @Test
    public void select_Before_TwoThousandTwenty() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("Before_TwoThousandTwenty"));
        Assert.assertEquals(msg,"Before 2020");
    }
    @Test
    public void select_After_TwoThousandTwentyFour() throws InterruptedException, AWTException {
        String msg = passout.passOut_Year(prop.getProperty("After_TwoThousandTwentyFour"));
        Assert.assertEquals(msg,"After 2024");
    }
    @Test
    public void not_Select_passOut_Year() throws InterruptedException, AWTException {
        String msg = passout.empty_Value();
        Assert.assertEquals(msg,"Year Required");
    }
//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
}
