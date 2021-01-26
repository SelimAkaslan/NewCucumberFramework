package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Google;
import pages.Youtube;
import utilities.Driver;

public class YoutubeVideoBilgileriStepDefinitions {
    Youtube youtube = new Youtube();
    @Given("kullanici youtubea gider")
    public void kullanici_youtubea_gider() {
        Driver.getDriver().get("https://www.youtube.com/");

    }
    @Given("kullanici techproed aramasi yapar")
    public void kullanici_techproed_aramasi_yapar() throws InterruptedException {
        Thread.sleep(2000);
        youtube.aramaKutusu.sendKeys("techproed"+ Keys.ENTER);

    }
    @Given("kullanici bir videoya tiklar")
    public void kullanici_bir_videoya_tiklar() {
        youtube.videoLink.click();

    }

    @Then("kullanici videonun bilgilerini alir")
    public void kullanici_videonun_bilgilerini_alir() {
        String goruntulenmeSayisi = youtube.videoGoruntulenmeSayisi.getText();
        System.out.println(goruntulenmeSayisi);

        String videoTarihi = youtube.videoYuklenmeTarihi.getText();
        System.out.println(videoTarihi);
    }


}
