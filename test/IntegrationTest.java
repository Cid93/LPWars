import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class IntegrationTest {

    /**
     * Test sur la page d'accueil
     */
    @Test
    public void index() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertThat(browser.pageSource()).contains("LPWars");
                assertThat(browser.pageSource()).contains("Bienvenue sur LPWars");
                assertThat(browser.pageSource()).contains("<a href=\"/jouer\">");
            }
        });
    }

    /**
     * Test sur la page plateau
     * page jouer
     */
    @Test
    public void plateau() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333/jouer");
                assertThat(browser.pageSource()).contains("LPWars");
                assertThat(browser.pageSource()).contains("<table id=\"plateau\" class=\"col-lg-5\">");
                assertThat(browser.pageSource()).contains("<td class=\"bleu\">");
                assertThat(browser.pageSource()).contains("<td class=\"rouge\">");
                assertThat(browser.pageSource()).contains("<a href=\"/jouer/informations?i=0&amp;j=0\">");
            }
        });
    }

    /**
     * Test sur la prise d'information
     * page information
     */
    @Test
    public void infoBleu() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333/jouer/informations?i=0&j=0");
                assertThat(browser.pageSource()).contains("LPWars");
                assertThat(browser.pageSource()).contains("<table id=\"plateau\" class=\"col-lg-5\">");
                assertThat(browser.pageSource()).contains("<td class=\"bleu\">");
                assertThat(browser.pageSource()).contains("<div id=\"info\" class=\"bleu col-lg-offset-1 col-lg-6\">");
                assertThat(browser.pageSource()).contains("<div id=\"action\">");
            }
        });
    }

    /**
     * Test sur la prise d'information
     * page information
     */
    @Test
    public void infoRouge() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333/jouer/informations?i=9&j=9");
                assertThat(browser.pageSource()).contains("LPWars");
                assertThat(browser.pageSource()).contains("<table id=\"plateau\" class=\"col-lg-5\">");
                assertThat(browser.pageSource()).contains("<td class=\"rouge\">");
                assertThat(browser.pageSource()).contains("<div id=\"info\" class=\"rouge col-lg-offset-1 col-lg-6\">");
            }
        });
    }

    /**
     * Test sur la prise d'information
     * page information
     */
    @Test
    public void mouvement() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333/jouer/mouvement?i=0&j=0&thei=2&thej=0");
                assertThat(browser.pageSource()).contains("LPWars");
                assertThat(browser.pageSource()).contains("<table id=\"plateau\" class=\"col-lg-5\">");
                assertThat(browser.pageSource()).contains("<td class=\"bleu\">");
                assertThat(browser.pageSource()).contains("<div id=\"info\" class=\"bleu col-lg-offset-1 col-lg-6\">");
                assertThat(browser.pageSource()).contains("<div id=\"action\">");
            }
        });
    }
}
