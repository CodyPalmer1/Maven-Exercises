import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestMain {
    @Test
    public void testCodeupString(){
        //assertEquals("Codeup", "CodeUp"); //Test fail
        assertNotEquals("Codeup", "CodeUp"); //Test pass
    }

    @Test
    public void testNotSameArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages); // Test pass
        //assertSame(languages, moreLanguages); // Test fail
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers); // Test pass
        //assertArrayEquals(number[1], otherNumbers[1]); //Test fail
    }

    @Test
    public void testCharactersString(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
}
