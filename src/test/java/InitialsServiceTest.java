import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialsServiceTest {
    @Test
    public void getInitialsTwoWordsName() {
        InitialsService service = new InitialsService();
        String name = "Ivan Petrov";

        String actual = service.getInitials(name);

        assertEquals("IP", actual);
    }
}