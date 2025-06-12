import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PUTRequestTest {

    @Test
    public void PUTRequestTest() {
        // Создание JSON-объекта для тела запроса
        String requestBody = "This is expected to be sent back as part of response body.";

        // Выполнение POST-запроса и проверка результата
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}