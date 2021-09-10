package lesson9;

import org.junit.Assert;
import org.junit.Test;

public class TextFormatterTests {
    @Test
    public void isPalindromeInLineTest(){
        String text = "Это предложение содержит палиндром - шалаш.";
        Assert.assertTrue(TextFormatter.isPalindromeInLine(text));
    }

    @Test
    public void getWordCountText(){
        int expectedResult  = 5;
        Assert.assertEquals(expectedResult, TextFormatter.getWordCount("1, 2, 3, 4, 5"));
    }
}
