package test;

import main.com.romanNumerals.IntegerToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    IntegerToRoman intRom = new IntegerToRoman();

@Test
//Check for given example MCMXCVIII = 1998
void checkIntToRomTest1(){

    assertEquals("MCMXCVIII",intRom.convertIntegerToRoman(1998));
}

@Test
// check for MMXXI
void checkIntToRomTest2(){
    assertEquals("MMXXI",intRom.convertIntegerToRoman(2021));
}

@Test
//Check for nulla
void checkIntToRomTest3(){
    assertEquals("nulla",intRom.convertIntegerToRoman(0));
}

@Test
// Negative testing
void checkIntToRomTest4(){
    assertEquals("Invalid Input",intRom.convertIntegerToRoman(-1));
}

@Test
// Check for Max limit
    void checkIntToRomTest5(){
        assertEquals("Invalid Input",intRom.convertIntegerToRoman(100001));
}

}