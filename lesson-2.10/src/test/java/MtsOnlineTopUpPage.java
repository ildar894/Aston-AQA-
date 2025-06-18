import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class MtsOnlineTopUpPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private String baseUrl = "https://www.mts.by/";

    public MtsOnlineTopUpPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(baseUrl);
        acceptCookiesIfPresent();
    }

    public void acceptCookiesIfPresent() {
        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));
            WebElement acceptButton = shortWait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//button[@id='cookie-agree']")));
            if (acceptButton.isDisplayed()) {
                acceptButton.click();
            }
        } catch (TimeoutException ignored) {}
    }

    public String getBlockTitleText() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"pay__wrapper\"]//h2")));
        return blockTitle.getText();
    }

    public List<WebElement> getPaymentSystemLogos() {
        return driver.findElements(By.xpath("//div[@class=\"pay__wrapper\"]//li//img"));
    }

    public void clickMoreAboutServiceLink() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(), 'Подробнее о сервисе')]")));
        link.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void fillForm(String phoneNumber, String amount) {
        WebElement phoneInput = driver.findElement(By.xpath("//input[@placeholder=\"Номер телефона\"]"));
        phoneInput.clear();
        phoneInput.sendKeys(phoneNumber);

        WebElement amountInput = driver.findElement(By.xpath("//input[@placeholder=\"Сумма\"]"));
        amountInput.clear();
        amountInput.sendKeys(amount);
    }

    public void clickContinueButton() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()='Продолжить']")));
        button.click();
    }

    public void switchToPaymentFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[@class=\"bepaid-iframe\"]")));
    }

    public String getSumText() {
        WebElement sumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"pay-description__cost\"]")));
        return sumElement.getText();
    }

    public String getPhoneConfirmationText() {
        WebElement telElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"pay-description__text\"]")));
        return telElement.getText();
    }

    public String getLabelText(String labelText) {
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//label[contains(text(), '" + labelText + "')]")));
        return label.getText();
    }

    public List<WebElement> getPaymentIcons() {
        return driver.findElements(By.cssSelector("div.cards-brands__container img"));
    }

    public void selectPaymentOption(String optionText) {
        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"select__header\"]")));
        menuButton.click();

        WebElement menuOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[@class=\"select__option\"][contains(text(), '" + optionText + "')]")));
        menuOption.click();
    }

    public String getPlaceholder(String placeholderText) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder=\"" + placeholderText + "\"]")));
        return field.getAttribute("placeholder");
    }
}
