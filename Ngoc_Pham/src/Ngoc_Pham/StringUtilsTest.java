package Ngoc_Pham;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsTest {

	// Parameterized method for testConcatenation()
	@Parameters(name = "{index}: Concatenating {0} and {1} should be {2}")
	public static Collection<Object[]> concatenationData() {
		return Arrays.asList(new Object[][] { { null, null, null }, { null, "Ngoc", "Ngoc" }, { "Pham", null, "Pham" },
				{ "", "", " " }, { "Ngoc", "Pham", "Ngoc Pham" }, { "Ngoc", "1", "Ngoc 1" }, { "", "Pham", " Pham" },
				{ "!@#$", "!#$%^&*&", "!@#$ !#$%^&*&" }, { " ", "@", "  @" },
				{ "Ngoc Ngan", "Pham", "Ngoc Ngan Pham" } });
	}

	private String a;
	private String b;
	private String expectedresult;

	public StringUtilsTest(String a, String b, String expectedresult) {
		this.a = a;
		this.b = b;
		this.expectedresult = expectedresult;
	}

	@Test
	public void testConcatenation() {
		StringUtils obj = new StringUtils();
		String output = obj.ConcatenateStrings(a, b);
		assertEquals(expectedresult, output);
	}

	@Test
	public void testReversal() {
		StringUtils obj = new StringUtils();
		String output = obj.ReverseStrings("Pham Ngoc Ngan");
		assertEquals("nagN cogN mahP", output);
	}

	public void testUpperCase() {
		StringUtils obj = new StringUtils();
		StringBuffer output = obj.UppercaseStrings("Pham Ngoc Ngan");
		assertEquals("PHAM NGOC NGAN", output);
	}

	public void testTrimming() {
		StringUtils obj = new StringUtils();
		StringBuffer output = obj.UppercaseStrings(" Pham Ngoc Ngan ");
		assertEquals("Pham Ngoc Ngan", output);
	}
}
