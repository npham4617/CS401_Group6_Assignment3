package project;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringUtilsTest {
	
	private final StringUtils StringUtils = new StringUtils();
	private String inputString;
	private String expectedOutput;
	
    public StringUtilsTest(String inputString, String expectedResult) {
        this.inputString = inputString;
        this.expectedOutput = expectedResult;
    }
	
    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
            {"false", "FALSE"},
            {"  true  ", "true"},
            {"Read", "eadR"}, 
            {"", ""},
            {"5678", "8765"},
            {"element", "e"}
        });
    }
	
    @Test
	public void concate() {
		String result = StringUtils.concate(inputString, "World");
        Assert.assertEquals(expectedOutput + "World", result);
	}
	
    @Test
	public void reverse() {
        String result = StringUtils.reverse(inputString);
        Assert.assertEquals(expectedOutput, result);
	}
	
    @Test
	public void upperString() {
        String result = StringUtils.upperString(inputString);
        Assert.assertEquals(expectedOutput.toUpperCase(), result);
	}
	
    @Test
	public void spaceTrim() {
        String result = StringUtils.spaceTrim(inputString);
        Assert.assertEquals(expectedOutput, result);
	}
}
