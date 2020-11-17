import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("RandomTestClass_1")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AuthorizationTest {

    private final PageHelper pageHelper = new PageHelper();

    @DisplayName("RandomTest_3")
    @Test
    @Order(1)
    public void randomTest_1() {
        pageHelper.randomMethod();
        assertEquals("https://www.google.kz/", pageHelper.getUrl());
    }

    @DisplayName("RandomTest_2")
    @Test
    @Order(2)
    public void randomTest_2() throws InterruptedException {
        pageHelper.randomMethod();
        Thread.sleep(1000);
        assertTrue(pageHelper.isElementDisplayed(pageHelper.getElement("//div[@class='FPdoLc tfB0Bf']//input[@value='Поиск в Google']")));
    }

    @DisplayName("RandomTest_1")
    @Test
    @Order(3)
    public void randomTest_3() {
        pageHelper.randomMethod();
        assertEquals("https://www.google.kz/?gws_rd=ssl", pageHelper.getUrl());
    }

    @AfterEach
    public void close() {
        pageHelper.close();
    }
}
