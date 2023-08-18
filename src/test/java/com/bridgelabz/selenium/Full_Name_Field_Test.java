package com.bridgelabz.selenium;

import pages.Full_Name_Field;
import baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

public class Full_Name_Field_Test extends BaseClass {

    Full_Name_Field name;
    public Full_Name_Field_Test() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization();
        name = new Full_Name_Field(driver);
    }
    @Test
    public void enter_Valid_FullName() throws InterruptedException {
        boolean msg = name.valid_FullName(prop.getProperty("Valid_FullName"));
        Assert.assertFalse(msg);
    }
    @Test
    public void enter_EmptyString() throws InterruptedException {
        boolean msg = name.invalid_FullName(" ");
        Assert.assertTrue(msg,"First Name Min 3 character required");
    }
    @Test
    public void enter_TwoChar() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Two_Char"));
        Assert.assertTrue(msg,"First Name Min 3 character required");
    }
    @Test
    public void enter_ThreeChar() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Three_Char"));
        Assert.assertTrue(msg,"Please enter first & last name (min. 3 letters each) separated by a space.");
    }
    @Test
    public void user_Enter_FullName_Without_Space() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("FullName_Without_Space"));
        Assert.assertTrue(msg,"Please enter first & last name (min. 3 letters each) separated by a space.");
    }
    @Test
    public void user_Enter_Space_After_LastName() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Valid_FullName") + " ");
        Assert.assertTrue(msg,"No space after first & last name");
    }
    @Test
    public void Enter_Double_Space_Between_First_And_LastName() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Double_Space_Between_FullName"));
        Assert.assertTrue(msg,"No space after fullname and character");
    }
    @Test
    public void user_Enter_ThreeGroup_Of_Char() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Three_Group_Of_Name"));
        Assert.assertTrue(msg,"No space after fullname and character");
    }
    @Test
    public void user_Enter_Numeric_Char() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Numeric_Value_In_NameField"));
        Assert.assertTrue(msg,"Name must contain alphabetic only");
    }
    @Test
    public void user_enter_Spacial_Char_() throws InterruptedException {
        boolean msg = name.invalid_FullName(prop.getProperty("Special_Char_In_NameField"));
        Assert.assertTrue(msg,"Name must contain alphabetic only");
    }
    @Test
    public void user_Remove_ValidName_From_NameField() throws InterruptedException {
        boolean msg = name.removing_Value_From_FullNameField(prop.getProperty("Valid_FullName"));
        Assert.assertTrue(msg,"You must enter a Full Name");
    }
    @Test
    public void user_Remove_InvalidName_From_NameField() throws InterruptedException {
        boolean msg = name.removing_Value_From_FullNameField(prop.getProperty("Two_Char"));
        Assert.assertTrue(msg,"You must enter a Full Name");
    }
//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
}
