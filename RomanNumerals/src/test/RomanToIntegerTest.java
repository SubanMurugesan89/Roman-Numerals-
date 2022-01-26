package test;

import main.com.romanNumerals.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    RomanToInteger romInt = new RomanToInteger();
@Test
// Test for given example MCMXCVIII =  1998
    void checkRomeToIntTest1(){
    assertEquals(1998,romInt.convertRomanToInteger("MCMXCVIII"));
}
    @Test
// Test for given example MMXXI =  2021
    void checkRomeToIntTest2(){
        assertEquals(2021,romInt.convertRomanToInteger("MMXXI"));
    }

    @Test
// Test for invalue inputs other than Roman char. Output returns -1 for invalid inputs
    void checkRomeToIntTest3(){
        assertEquals(-1,romInt.convertRomanToInteger("SUBAN"));
    }

    @Test
// Test for invalue inputs other than Roman char. Output returns -1 for invalid inputs
    void checkRomeToIntTest4(){
        assertEquals(-1,romInt.convertRomanToInteger("1234"));
    }

    @Test
// Test for invalue inputs other than Roman char for last char . Output returns -1 for invalid inputs
    void checkRomeToIntTest5(){
        assertEquals(-1,romInt.convertRomanToInteger("XVIVS"));
    }

    @Test
// Test for null
    void checkRomeToIntTest6(){
        assertEquals(0,romInt.convertRomanToInteger(""));
    }

    @Test
// Test for nulla
    void checkRomeToIntTest7(){
        assertEquals(0,romInt.convertRomanToInteger("nulla"));
    }

    @Test
// Test for test rules
// The symbols V, L and D must not be repeated.
    void checkRomeToIntTest8(){
        assertEquals(-1,romInt.convertRomanToInteger("VVVXC"));
    }

    @Test
// Test for test rules
// The symbols I, X, C and M can be repeated at most 3 times
    void checkRomeToIntTest9(){
        assertEquals(-1,romInt.convertRomanToInteger("MMMMMMMMMM"));
    }
}