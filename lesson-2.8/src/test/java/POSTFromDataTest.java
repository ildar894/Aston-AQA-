import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class POSTFromDataTest {

    @Test
    public void POSTFormDataTest() {
        // Создание JSON-объекта для тела запроса
        String requestBody = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";

        // Выполнение POST-запроса и проверка результата
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .body("data.foo1", equalTo("bar1"))
                .body("data.foo2", equalTo("bar2"));
    }
}