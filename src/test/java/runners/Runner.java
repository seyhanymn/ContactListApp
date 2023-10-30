package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@name",// iki tane tag calistirmak icinde "@gp1 or @gp2" diye yazariz
        dryRun = false
)

public class Runner {

    /*
    Runner  Class i TestNg deki XML mantigi ile calisir calistirmak istediginiz seneryolara tag belirtiriz
    ve belirtigimiz taglari calistirir. XML deki gibi istedigimiz test leri calistirmak icin kullaniriz
    runner class bady si bostur ve runner class inda ekleycegimiz notosyonlari aktive eder
    Bu class da kullnacagimiz 2 adet notasyon vrdir
    -@RunWith(Cucumber.class) notasyonu runner class ina calisma ozelligi ekler
    Bu notosyan oldugu icin Cucumber fremwork umuzde Junit kullanmayi tercih ederiz
    -@CucumberOptions notasyonu icinde
    features = Runner dosyasinin feature dosyasini nereden bulacagini tarif eder
    -glue = stepDefinitions yolunu belirtiriz
    -tags = hngi tag i calistirmak istiyorsak onu belirler

    - dryRun : iki secenek vardir
    - dryRun = true; dersek testimizi calistirmadan adimlari bize verir
    -  dryRun = false; testlerimizi driver ile calistirir
     */

}
