package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    // "   **" -> "**", " **"->"**", "****", "**  "-> "**  "
    StringUtils su = new StringUtils();

    @Test
    public void testChopOff2StarsAtHead_Both() {
        assertEquals("**", su.chopOff2SpacesAtHead("  **"));
    }
    @Test
    public void testChopOff2StarsAtHead_Single() {
        assertEquals("**", su.chopOff2SpacesAtHead("  **"));
    }
    @Test
    public void testChopOff2StarsAtHead_None() {
        assertEquals("****", su.chopOff2SpacesAtHead("****"));
    }
    @Test
    public void testChopOff2StarsAtHead_BothAtRight() {
        assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
    }
}