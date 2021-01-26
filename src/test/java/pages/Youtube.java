package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Youtube {
        public Youtube(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//input[@id='search']")
        public WebElement aramaKutusu;

        @FindBy(partialLinkText = "Git GitHub Project Download")
        public WebElement videoLink;

        @FindBy(xpath = "//span[@class='view-count style-scope yt-view-count-renderer']")
        public WebElement videoGoruntulenmeSayisi;

        @FindBy(xpath = "(//yt-formatted-string[@class='style-scope ytd-video-primary-info-renderer'])[2]")
        public WebElement videoYuklenmeTarihi;
}
