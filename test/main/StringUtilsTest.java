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

    // "1234" -> false, "1212" -> true, "12" -> true, "1"-> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GeneralAllDifferentFalse() {
        assertFalse(su.are2CharsAtHeadAndTailEqual("1234"));
    }
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GeneralAllSameFalse() {
        assertTrue(su.are2CharsAtHeadAndTailEqual("1212"));
    }
    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyTwo() {
        assertTrue(su.are2CharsAtHeadAndTailEqual("12"));
    }
    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyOne() {
        assertFalse(su.are2CharsAtHeadAndTailEqual("1"));
    }
}