package wework.page;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.time.Duration;


public class ContactPage extends BasePage {
    By addMember = By.linkText("添加成员");
    By username = By.name("username");
    By delete = By.linkText("删除");

    public ContactPage(RemoteWebDriver driver) {
        super(driver);
    }


    public ContactPage addMember(String username, String acctid, String mobile) {
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new WebDriverWait( driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(addMember));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        new WebDriverWait( driver, 10)
//                .until(ExpectedConditions.elementToBeClickable(addMember));
        //todo: 就算可点击，仍然有一定的概率是点击不成功的
//        new WebDriverWait( driver, 10)
//                .until(ExpectedConditions.visibilityOfElementLocated(addMember));

        while (driver.findElements(this.username).size() == 0) {
//            driver.findElement(addMember).click();
            click(addMember);
        }

        //todo:
//         driver.findElement(addMember).click();
//        driver.findElement(this.username).sendKeys(username);
//        driver.findElement(By.name("acctid")).sendKeys(acctid);
//        driver.findElement(By.name("mobile")).sendKeys(mobile);
        //改造成sendKeys方法
        sendKeys(this.username, username);
        sendKeys(By.name("acctid"), acctid);
        sendKeys(By.name("mobile"), mobile);
//        driver.findElement(By.cssSelector(".js_btn_save")).click();
        //封装成click
        click(By.cssSelector(".js_btn_save"));
        return this;
    }

    public ContactPage search(String keyword) {
//        driver.findElement(By.id("memberSearchInput")).sendKeys(keyword);
//        new WebDriverWait(driver, 10000)
//                .until(ExpectedConditions.elementToBeClickable(delete));
        sendKeys(By.id("memberSearchInput"), keyword);
        return this;
    }

    public ContactPage delete() {
//         driver.findElement(delete).click();
//        driver.findElement(By.cssSelector(".js_del_member")).click();
//        driver.findElement(By.linkText("确认")).click();
//        driver.findElement(By.id("clearMemberSearchInput")).click();
//        click(delete);
        click(By.cssSelector(".js_del_member"));
        click(By.linkText("确认"));
        click(By.id("clearMemberSearchInput"));
        return this;
    }

    public String getUserName() {
        return driver.findElement(By.cssSelector(".member_display_cover_detail_name")).getText();
    }

    public ContactPage importFromFile(URL path) {
        //todo:
        System.out.println(path.getPath());

        String path_utf = "";
        try {
            path_utf = URLDecoder.decode(path.getFile(), "UTF-8");
            System.out.println(path_utf);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        click(By.cssSelector(".ww_operationBar:nth-child(1) .ww_btn_PartDropdown_left"));
        click(By.linkText("文件导入"));
//        click(By.name("file"));
//        sendKeys(By.name("file"), "C:\\fakepath\\通讯录批量导入模板.xlsx");
        upload(By.name("file"), path_utf);
//        driver.findElement(By.name("file")).sendKeys("/Users/seveniruby/projects/Java3/src/main/resources/通讯录批量导入模板.xlsx");
//        sendKeys(By.name("file"), "C:\\fakepath\\通讯录批量导入模板.xlsx");
        click(By.linkText("导入"));
        click(By.linkText("完成"));

        return this;
    }
}
