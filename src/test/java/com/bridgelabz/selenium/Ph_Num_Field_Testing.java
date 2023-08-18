package com.bridgelabz.selenium;

import pages.Ph_Num_Field;
import baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
public class Ph_Num_Field_Testing extends BaseClass {
    Ph_Num_Field ph;

    public Ph_Num_Field_Testing() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization();
        ph = new Ph_Num_Field(driver);
    }
    @Test
    public void new_User_Enter_Valid_PhNumber() throws InterruptedException {
        ph.valid_phNumber();
    }
    @Test
    public void new_User_Enter_EmptyString() throws InterruptedException {
        boolean msg=ph.invalid_PhNumber(" ");
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_Enter_SpecialChar() throws InterruptedException {
        boolean msg=ph.invalid_PhNumber(prop.getProperty("SpecialChar_PhNumber"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_Enter_Character() throws InterruptedException {
        boolean msg=ph.invalid_PhNumber(prop.getProperty("Char_PhNumber"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_Enter_Space_Between_PhNumber() throws InterruptedException {
        boolean msg=ph.invalid_PhNumber(prop.getProperty("Space_PhNumber"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_Enter_plus_NinetyOne() throws InterruptedException {
        boolean msg=ph.invalid_PhNumber(prop.getProperty("Plus_NinetyOne_PhNumber"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_Enter_plus_NinetyOne_And_Hyphen() throws InterruptedException {
        boolean msg=ph.invalid_PhNumber(prop.getProperty("Plus_NinetyOne_Hyphen"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_Enter_NineDigit_PhNumber() throws InterruptedException {
        boolean msg=ph.user_Remove_Invalid_PhNum_From_PhField(prop.getProperty("Nine_Digit_PhNumber"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Invalid Phone Number");
    }
    @Test
    public void new_User_After_Enter_InValidData_RemoveData_Form_PhField() throws InterruptedException {
        boolean msg=ph.user_Remove_Invalid_PhNum_From_PhField(prop.getProperty("Nine_Digit_PhNumber"));
        System.out.println(msg);
        Assert.assertTrue(msg,"Phone Number Required");
    }
    @Test
    public void new_User_After_Enter_ValidData_RemoveData_Form_PhField() throws InterruptedException {
        boolean msg=ph.user_Remove_Valid_PhNum_From_PhField(prop.getProperty("Valid_PhNumber"));
        System.out.println(msg);
        Assert.assertFalse(msg);
    }
//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }

}
