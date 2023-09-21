package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage {

    public PollPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement PollTab;
    

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement iFrame;



    @FindBy(xpath = "//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']//iframe[@class='bx-editor-iframe']")
    public WebElement Title;

    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement AddMoreBtn;

    @FindBy(xpath = "//*[@id='question_0']")
    public WebElement inputQuestion;

    @FindBy(xpath = "//li[@class='vote-block-inp-wrap'][.//*[@id='answer_0__0_']]")
    public WebElement Answer1;

    @FindBy(xpath = "//li[@class='vote-block-inp-wrap'][.//*[@id='answer_0__1_']]")
    public WebElement Answer2;

    @FindBy(id="multi_0")
    public WebElement ClickBoxMulti;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement Send;

    @FindBy(xpath = "//*[@id=\"destDepartmentTab_destination5410601\"]")
    public WebElement EmployeeAndDepartments;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[3]/div[1]/div[1]")
    public WebElement Employee_1;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[23]/div[1]/div[1]")
    public WebElement Employee_2;

    
    @FindBy(xpath = "//a[contains(@class, 'addq')]")
    public WebElement AddQuestion_btn;

    @FindBy(xpath = "//*[@id='feed-post-menuanchor-2755']/span[1]")
    public WebElement MoreBtn;
    //    @FindBy(xpath = "//*[@id='feed-post-more-2754']")
//    public WebElement FeedPostMore;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div/div/span[5]/span[2]")
    public WebElement Delete;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div/div/a[2]/span[2]")
    public WebElement Edit;

    @FindBy(xpath = "//label[@for='question_106']")
    public WebElement labelDeleteQuestion;

    @FindBy(xpath = "//span[contains(@style, 'top:')]")
    public WebElement AddMorePopUPCloseIcon;




    

  


}
