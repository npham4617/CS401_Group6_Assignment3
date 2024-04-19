package com.eastbay.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    private String input;
    private String expectedConcatResult;
    private String expectedReverseResult;
    private String expectedUpperCaseResult;
    private String expectedTrimResult;

    // The constructor for each parameters for each test case
    public StringUtilsTest(String input, String expectedConcatResult,
                           String expectedReverseResult, String expectedUpperCaseResult,
                           String expectedTrimResult) {
        this.input = input;
        this.expectedConcatResult = expectedConcatResult;
        this.expectedReverseResult = expectedReverseResult;
        this.expectedUpperCaseResult = expectedUpperCaseResult;
        this.expectedTrimResult = expectedTrimResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"one two", "one twoone two", "owt eno", "ONE TWO", "one two"},
            {" abc ", " abc  abc ", " cba ", " ABC ", "abc"},
          
        });
    }

    @Test
    public void testConcatenate() {
        assertEquals(expectedConcatResult, StringUtils.concatenate(input, input));
    }
    
    @Test
    public void testReverse() {
        assertEquals(expectedReverseResult, StringUtils.reverse(input));
    }

    @Test
    public void testToUpperCase() {
        assertEquals(expectedUpperCaseResult, StringUtils.toUpperCase(input));
    }

    @Test
    public void testTrim() {
        assertEquals(expectedTrimResult, StringUtils.trim(input));
    }
}
