package org.example;
import org.junit.Before;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0); // version will equal 0.0
        CodeupCrypt.version = 1.2; // setting new value of CodeupCrypt.version
        assertEquals(1.2, CodeupCrypt.version, 0); // version will equal 1.2
    }

    @Test
    public void testHashPassword(){
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
    }

}