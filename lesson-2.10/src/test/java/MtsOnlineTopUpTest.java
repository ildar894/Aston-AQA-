import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MtsOnlineTopUpTest {

    private WebDriver driver;
    private MtsOnlineTopUpPage page;

    @BeforeAll
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new MtsOnlineTopUpPage(driver);
    }

    @BeforeEach
    public void openStartPage() {
        page.open();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка заголовка блока 'Онлайн пополнение без комиссии'")
    public void testBlockTitle() {
        String actualText = page.getBlockTitleText();
        assertTrue(actualText.contains("Онлайн пополнение"));
        assertTrue(actualText.contains("без комиссии"));
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    public void testPaymentSystemLogos() {
        List<WebElement> logos = page.getPaymentSystemLogos();
        assertFalse(logos.isEmpty());
    }

    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе'")
    public void testMoreAboutServiceLink() {
        page.clickMoreAboutServiceLink();
        assertTrue(page.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    @Test
    @DisplayName("Проверка формы пополнения 'Услуги связи'")
    public void testFormPayment() {
        page.fillForm("297777777", "5");
        page.clickContinueButton();
        page.switchToPaymentFrame();

        assertEquals("5.00 BYN", page.getSumText());
        assertEquals("Оплата: Услуги связи Номер:375297777777", page.getPhoneConfirmationText());
        assertEquals("Номер карты", page.getLabelText("Номер карты"));
        assertEquals("Срок действия", page.getLabelText("Срок действия"));
        assertEquals("CVC", page.getLabelText("CVC"));
        assertEquals("Имя и фамилия на карте", page.getLabelText("Имя и фамилия на карте"));

        assertFalse(page.getPaymentIcons().isEmpty());
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для 'Домашний интернет'")
    public void testPlaceholdersForHomeInternet() {
        page.selectPaymentOption("Домашний интернет");

        assertEquals("Номер телефона", page.getPlaceholder("Номер телефона"));
        assertEquals("Сумма", page.getPlaceholder("Сумма"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("E-mail для отправки чека"));
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для 'Рассрочка'")
    public void testPlaceholdersForInstallment() {
        page.selectPaymentOption("Рассрочка");

        assertEquals("Номер счета на 44", page.getPlaceholder("Номер счета на 44"));
        assertEquals("Сумма", page.getPlaceholder("Сумма"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("E-mail для отправки чека"));
    }

    @Test
    @DisplayName("Проверка плейсхолдеров для 'Задолженность'")
    public void testPlaceholdersForArrears() {
        page.selectPaymentOption("Задолженность");

        assertEquals("Номер счета на 2073", page.getPlaceholder("Номер счета на 2073"));
        assertEquals("Сумма", page.getPlaceholder("Сумма"));
        assertEquals("E-mail для отправки чека", page.getPlaceholder("E-mail для отправки чека"));
    }
}
