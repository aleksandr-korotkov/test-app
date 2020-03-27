import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    private static Utils utils;

    @BeforeAll
    static void setUp() {
        utils = new Utils();
    }

    @ParameterizedTest
    @MethodSource("Providers#testCalcFactorialProvider")
    @DisplayName("Тест метода Utils.computeFactorial(int number)")
    void testCalcFactorial(int param, int expected) {
        assertEquals(expected, utils.computeFactorial(param), "Для входого параметра: " + param);
    }

    @ParameterizedTest
    @MethodSource("Providers#testConcatenateWordsProvider")
    @DisplayName("Тест метода Utils.concatenateWords(String ... strings)")
    void testConcatenateWords(String[] param, String expected) {
        assertEquals(expected, utils.concatenateWords(param));
    }

    //@Ignore
    @Test(timeout = 1000)
    public void testFactorialWithTimeout() {
        Random random = new Random();
        utils.computeFactorial(random.nextInt());
    }
}