package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage {

    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement PollTab;


    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement iFrame;


    @FindBy(xpath = "//body[contains(@style,'min-height: 184px;')]")
    public WebElement Title;

    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement AddMoreBtn;

    @FindBy(xpath = "//*[@id='question_0']")
    public WebElement inputQuestion;

    @FindBy(xpath = "//input[contains(@id,'answer_0__0_')]")
    public WebElement Answer1;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div/div/ol/li/ol/li[1]")
    public WebElement editAnswer;
    @FindBy(xpath = "//input[contains(@id,'answer_0__1_')]")
    public WebElement Answer2;

    @FindBy(xpath = "//input[contains(@id,'answer_0__2_')]")
    public WebElement Answer3;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/div/div/div[2]/form/div[2]/div[1]/div/div/ol/li/div[2]/input")
    public WebElement ClickBoxMulti;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement Send;

    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab_destination')]")
    public WebElement EmployeeAndDepartments;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[3]/div[1]/div[1]")
    public WebElement Employee_1;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[23]/div[1]/div[1]")
    public WebElement Employee_2;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[22]/div[1]/div[1]")
    public WebElement Employee_3;


    @FindBy(xpath = "//a[contains(@class, 'addq')]")
    public WebElement AddQuestion_btn;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[3]/div[2]/div[1]/div/div[1]/div[6]/div/a/span[1]")
    public WebElement MoreBtn;


    @FindBy(xpath = "//div[@class='feed-item-wrap'][1]/div/div/div[6]/div[1]/a[1]/span[1]")
    public WebElement MoreBtn2;

    @FindBy(xpath = "//div[contains(@id,'popup-window-content-menu-popup-blog-post-')][1]/div[1]/div[1]/span[5]/span[2]")
    public WebElement Delete;

    @FindBy(xpath = "//div[contains(@id,'popup-window-content-menu-popup-blog-post-')][1]/div[1]/div[1]/a[2]/span[2]")
    public WebElement Edit;

    @FindBy(css = "#votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff > div > ol > li > ol > li:nth-child(1) > label")
    public WebElement labelDeleteQuestion;

    @FindBy(xpath = "//span[contains(@style, 'top:')]")
    public WebElement AddMorePopUPCloseIcon;


}
