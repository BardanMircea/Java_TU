package fr.wildcodeschool.test;

import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void singleVowelShouldReturnAVowel(){
        String result = StringUtils.vowels("a");
        System.out.println(result);

        assertEquals("a", result);
    }

    @Test
    public void nullParameterShouldReturnEmptyString(){
        String result = StringUtils.vowels(null);
        System.out.println(result);

        assertEquals("", result);
    }

    @Test
    public void vowelsAndConsonantsShouldReturnAllVowels(){
        String vowels = "eAaoui";
        String consonants = "ghRtrv";
        String result = StringUtils.vowels(vowels + consonants);
        System.out.println(result);

        assertEquals(vowels, result);
    }
}
