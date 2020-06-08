package wework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {
    //    public static ChromeDriver driver = null;


    public MainPage() {
        super();
        String url = "https://work.weixin.qq.com/wework_admin/frame";
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().addCookie(new Cookie("pgv_pvid", "5168053990"));
        driver.manage().addCookie(new Cookie("pgv_pvi", "9584156672"));
        driver.manage().addCookie(new Cookie("eas_sid", "11I5U8g8v2s6L6p5L826U0s7X1"));
        driver.manage().addCookie(new Cookie("LW_uid", "P1A5r8R8e5D3v7V298Q3I032M1"));
        driver.manage().addCookie(new Cookie("RK", "UfTIzRZ3Yo"));
        driver.manage().addCookie(new Cookie("ptcz", "bd8becfb7d183905e815cb9a080a5fc827ce0e5535f216a1e8a40bae317a3deb"));
        driver.manage().addCookie(new Cookie("uin_cookie", "o0469615008"));
        driver.manage().addCookie(new Cookie("ied_qq", "o0469615008"));
        driver.manage().addCookie(new Cookie("ptui_loginuin", "469615008@qq.com"));
        driver.manage().addCookie(new Cookie("LW_sid", "D1R5G8z930u3B1P7Q0Y9u5b899"));
        driver.manage().addCookie(new Cookie("wwrtx.i18n_lan", "zh"));
        driver.manage().addCookie(new Cookie("_ga", "GA1.2.1804276443.1590580919"));
        driver.manage().addCookie(new Cookie("_gid", "GA1.2.53247700.1591542473"));
        driver.manage().addCookie(new Cookie("Hm_lvt_9364e629af24cb52acc78b43e8c9f77d", "1590581059,1591542474"));
        driver.manage().addCookie(new Cookie("pgv_info", "ssid"));
        driver.manage().addCookie(new Cookie("pgv_si", "s1502410752"));
        driver.manage().addCookie(new Cookie("_qpsvr_localtk", "0.4087514491939981"));
        driver.manage().addCookie(new Cookie("skey", "@NI9aO3TDG"));
        driver.manage().addCookie(new Cookie("luin", "o0469615008"));
        driver.manage().addCookie(new Cookie("lskey", "00010000df91ae79bd38459c30ae2e8e14028db06eb714274425d30bf57b43e0da592664c4f60fa78bd0cd4e"));
        driver.manage().addCookie(new Cookie("wwrtx.ref", "direct"));
        driver.manage().addCookie(new Cookie("wwrtx.refid", "19127427773588514"));
        driver.manage().addCookie(new Cookie("ww_rtkey", "7437187154"));
        driver.manage().addCookie(new Cookie("_gat", "1"));
        driver.manage().addCookie(new Cookie("wwrtx.d2st", "a590593"));
        driver.manage().addCookie(new Cookie("wwrtx.sid", "gjilTBZUVh5_nRaXQoKdWXo1XkH8S0GxKpWY6PrfBJH7Yw1uyhy6NwMXsUkMplsC"));
        driver.manage().addCookie(new Cookie("wwrtx.ltype", "1"));
        driver.manage().addCookie(new Cookie("wxpay.corpid", "1970325112139803"));
        driver.manage().addCookie(new Cookie("wxpay.vid", "1688851908685689"));
        driver.manage().addCookie(new Cookie("wwrtx.vst", "tmSZ1zQGj_9f6NmwVNXRM0pjmP9iPpn1Ydcq12tYUzcMBtpvwkGYBMQiZBSjKLDBtEVheEOzCbKAuCXeSM5pQhvoVcSseBAEwhjW-x0lYKd1z6vYtJEUyHzx-CKdOcz5Tl4pmq53McHuw_mhSsIPVIJOCjJX-hsz95idPF16Nsf7zDlLrRg6E6TeeUuouhFKbAzLxD21FaWCoUCNVP6Qa-HxZXskc7oJb7tO2Dps7UsSABa_T--OWH-BD37OC2lE-P6q9hl3gIGrNDGwf6R6Zw"));
        driver.manage().addCookie(new Cookie("wwrtx.vid", "1688851908685689"));
        driver.manage().addCookie(new Cookie("wwrtx.logined", "true"));
        System.out.println(driver.manage().getCookies());
        driver.get(url);
    }

    public ContactPage toContact() {

        //todo:
//        driver.findElement(By.cssSelector("#menu_contacts")).click();
//        return new ContactPage();
        click(By.cssSelector("#menu_contacts"));
        return new ContactPage(driver);
    }


}
