package Scott_Tanaka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Scott_Tanaka_StringUtilsTest {
	
	Char test;
	String input1;
	String input2;
	String expectedResult;
	
	public Scott_Tanaka_StringUtilsTest(Char test, String input1, String input2, String expectedResult) {
		this.test = test;
		this.input1 = input1;
		this.input2 = input2;
		this.expectedResult = expectedResult;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.print("Setting Up Class...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.print("Tearing Down class...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.print("Setting Up Test Environment...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.print("Cleaning Up Test Environment...");
	}
	
	
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
	    return Arrays.asList(new Object[][] {
	            {'c', "string1", "string2", "string1string2"},
	            {'c', "", "string2", "string2"},
	            {'c', "string1", "", "string1" },
	            {'c', "","",""},
	            {'c', "string_!", "string2", "string_!string2"},
	            {'c', " string1", "string2 ", " string1string2 "},
	            {'c', "string 1", "string 2", "string 1string 2"},
	            {'r', "", "string", "gnirts"},
	            {'r', "", "str 1", "1 rts"},
	            {'r', "", " str", "trs "},
	            {'r', "", "str_!", "!_rts"},
	            {'u', "", "string", "STRING"},
	            {'u', "", "str123", "STR123"},
	            {'u', "", "str_1", "STR_1"},
	            {'u', "", "str str", "STR STR"},
	            {'t', "", " string", "string"},
	            {'t', "", "string ", "string"},
	            {'t', "", " string1 ", "string1"},
	            {'t', "", " str_1 str_2 ", "str_1 str_2"},
	            
	    });
	}
	

	@Test
	public void testConcatenate() {
		
		System.out.print("Testing Concatenation...");
		
		if(test == 'c') {
			String actualResult = concatenate(input1, input2);
			assertEquals(expectedResult, actualResult);
		}
		
	}

	@Test
	public void testReverse() {
		System.out.print("Testing Reverse...");
		
		if(test == 'r') {
			String actualResult = reverse(input2);
			assertEquals(expectedResult, actualResult);
		}
	}

	@Test
	public void testUppercase() {
		System.out.print("Testing Uppercase...");
		
		if(test == 'u') {
			String actualResult = uppercase(input2);
			assertEquals(expectedResult, actualResult);
		}
	}

	@Test
	public void testTrim() {
		System.out.print("Testing Trim...");
		
		if(test == 't') {
			String actualResult = trim(input2);
			assertEquals(expectedResult, actualResult);
		}
	}

}
