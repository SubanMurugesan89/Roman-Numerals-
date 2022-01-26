package main.com.romanNumerals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
This module is to convert an arabic numeral to a roman numeral
Range: 0 < n < 10000
Input:  Arabic Numbers ( Integer )
Output: Roman values ( String )
========================
Author : Suban Murugesan
Date : 27-Jan-2022
========================
 */
public class IntegerToRoman {
    public  String convertIntegerToRoman(int inputValue){

        String invalidInput = "Invalid Input";
        StringBuffer result = new StringBuffer();

        //Check for nulla
        if(inputValue == 0 ){
            return "nulla";
        }

        //Check for invalid inputs
        if(inputValue < 0 || inputValue > 10000){
            return invalidInput;
        }

        // Creating a Roman numeric key and its corresponding values in an LinkedHashMap
        // For include any new Roman character we need to change in this section
        // Include the value in the Map below
        Map<String,Integer> RomanChart = new LinkedHashMap<>();
        RomanChart.put("M", 1000);
        RomanChart.put("CM",900);
        RomanChart.put("D", 500);
        RomanChart.put("CD", 400);
        RomanChart.put("C", 100);
        RomanChart.put("XC", 90);
        RomanChart.put("L", 50);
        RomanChart.put("XL", 40);
        RomanChart.put("X", 10);
        RomanChart.put("IX", 9);
        RomanChart.put("V", 5);
        RomanChart.put("IV", 4);
        RomanChart.put("I", 1);

        //Iterate the RomanChar using for each
        for(Map.Entry<String, Integer> romanValue : RomanChart.entrySet()) {
            //Check for the input numeric value greater than the roman numeric value
            while(inputValue >= romanValue.getValue()) {
                //Subtract the roman value from input value
                inputValue = inputValue - romanValue.getValue();
                //Append the string value in result
                result.append(romanValue.getKey());
            }
        }

        return result.toString();
    }

}
