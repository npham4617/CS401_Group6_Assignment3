import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();
    private final String inputString;
    private final String expectedResult;

    public StringUtilsTest(String inputString, String expectedResult) {
        this.inputString = inputString;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {"hello", "HELLO"},
                {"  hello  ", "hello"},
                {"", ""},
                {"Java", "avaJ"},
                {"12345", "54321"}, 
                {"java", "j"}
        });
    }

    @Test
    public void testConcatenation() {
        String result = stringUtils.concatenate(inputString, "World");
        Assert.assertEquals(expectedResult + "World", result);
    }

    @Test
    public void testReversal() {
        String result = stringUtils.reverse(inputString);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testToUpperCase() {
        String result = stringUtils.toUpperCase(inputString);
        Assert.assertEquals(expectedResult.toUpperCase(), result);
    }

    @Test
    public void testTrimWhitespace() {
        String result = stringUtils.trim(inputString);
        Assert.assertEquals(expectedResult, result);
    }
}
