import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class POSTRawTextTest {

    @Test
    public void testPostRequest() {

        // Создание JSON-объекта для тела запроса
        String requestBody = "{\"test\": \"value\"}";

        // Выполнение POST-запроса и проверка результата
        given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .body("json.test", equalTo("value"));
    }
}