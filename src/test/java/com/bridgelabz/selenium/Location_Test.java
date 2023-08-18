package com.bridgelabz.selenium;

import pages.Location;
import baseclass.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class Location_Test extends BaseClass {
    Location location;
    public Location_Test() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization();
        location = new Location(driver);

    }
    @Test
    public void select_None() throws InterruptedException, AWTException {
        location.location(prop.getProperty("None"));
    }
    @Test
    public void select_Ncr() throws InterruptedException, AWTException {
        location.location(prop.getProperty("NCR"));
    }
    @Test
    public void select_Bangalore() throws InterruptedException, AWTException {
        location.location(prop.getProperty("Bangalore"));
    }
    @Test
    public void select_Mumbai() throws InterruptedException, AWTException {
        location.location(prop.getProperty("Mumbai"));
    }
    @Test
    public void select_Hyderabad() throws InterruptedException, AWTException {
        location.location(prop.getProperty("Hyderabad"));
    }
    @Test
    public void select_Pune() throws InterruptedException, AWTException {
        location.location(prop.getProperty("Pune"));
    }
}
