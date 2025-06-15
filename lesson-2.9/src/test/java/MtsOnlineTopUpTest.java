import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MtsOnlineTopUpTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    @BeforeEach
    public void openStartPage() {
        driver.get("https://www.mts.by/");
    }

    @Test
    @DisplayName("Проверка заголовка блока 'Онлайн пополнение без комиссии'")
    public void testBlockTitle() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"pay__wrapper\"]//h2")));
        String actualText = blockTitle.getText();
        System.out.println("Заголовок: " + actualText);

        assertTrue(actualText.contains("Онлайн пополнение"), "Заголовок не содержит 'Онлайн пополнение'");
        assertTrue(actualText.contains("без комиссии"), "Заголовок не содержит 'без комиссии'");
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    public void testPaymentSystemLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class=\"pay__wrapper\"]//li//img"));
        assertFalse(logos.isEmpty(), "Логотипы платёжных систем не найдены");
        System.out.println("Логотипы платежных систем найдены");
    }

    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе'")
    public void testMoreAboutServiceLink() {
        WebElement moreLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(), 'Подробнее о сервисе')]")
        ));
        String originalWindow = driver.getWindowHandle();
        moreLink.click();
        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"), "Открыт неверный URL после перехода.");
        driver.switchTo().window(originalWindow);
        System.out.println("Проверка работы ссылки 'Подробнее о сервисе'завершена");
    }

    @Test
    @DisplayName("Проверка формы пополнения (Услуги связи)")
    public void testFormSubmission() {
        // Ввод номера
        WebElement phoneInput = driver.findElement(By.xpath("//input[@placeholder=\"Номер телефона\"]"));
        phoneInput.clear();
        phoneInput.sendKeys("297777777");

        // Ввод суммы
        WebElement amountInput = driver.findElement(By.xpath("//input[@placeholder=\"Сумма\"]"));
        amountInput.clear();
        amountInput.sendKeys("5");

        // Кнопка "Продолжить"
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Продолжить']")
        ));
        button.click();
        assertTrue(button.isEnabled(), "Кнопка 'Продолжить' неактивна");
        System.out.println("Проверка формы пополнения (Услуги связи)завершена");
    }
}
