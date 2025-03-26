import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;

class Recitation3Test extends OutputTest{
    @Test
    @DisplayName("[1] 1st test of main")
    void test_main_1() {
        setTestInput("12\n14");
        Recitation3.main(new String[]{});
        String expected = "Enter x:\n" +
                "Enter y:\n" +
                "true\n";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        expected = "^"+expected+"$";
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);

    }

    @Test
    @DisplayName("[1] 2nd test of main")
    void test_main_2() {
        setTestInput("200\n300");
        Recitation3.main(new String[]{});
        String expected = "Enter x:\n" +
                "Enter y:\n" +
                "false\n";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        expected = "^"+expected+"$";
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);

    }
}