package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google;
import utilities.Driver;
public class GoogleAramaStepDefinitions {
    Google google = new Google();
    @Given("kullanici google sayfasindadir")
    public void kullanici_google_sayfasindadir() {
        Driver.getDriver().get("http://google.com");
    }
    @Given("kullanici selim akaslan aramasi yapar")
    public void kullanici_kemal_ozden_aramasi_yapar() {
        google.aramaKutusu.sendKeys("selim akaslan" + Keys.ENTER);
    }
    @Then("arama sayfasinin basligi dogrulanir")
    public void arama_sayfasinin_basligi_dogrulanir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selim akaslan"));
    }
}