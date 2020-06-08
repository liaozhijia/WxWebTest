package wework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import wework.page.ContactPage;
import wework.page.MainPage;

public class TestContact {
    static MainPage main;
    static ContactPage contact;

    @BeforeAll
    static void beforeAll() {
        main = new MainPage();
        contact = main.toContact();
    }

    @Test
    void testAddMember() {
//        MainPage main = new MainPage();
//        main.toContact().addMember("3", "3", "13691719731");
        contact.addMember("3", "3", "18888888888");

        //todo:assert
    }


    @Test
    void testSearch() {
//        MainPage main = new MainPage();
//        main.toContact().search("3").delete();
        contact.search("3").delete();
    }

    @AfterAll
    public static void afterAll() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        main.quit();
    }


}
