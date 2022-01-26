package main.com.romanNumerals;

import java.util.HashMap;
import java.util.Map;

/*
This module is to convert a roman numeral to an arabic numeral
Range: nulla < n < MMMMMMMMMM
Input:  Roman values ( String )
Output: Arabic Numbers ( Integer )
========================
Author : Suban Murugesan
Date : 27-Jan-2022
========================
 */
public class RomanToInteger {

    public  int convertRomanToInteger(String inputString) {

        int result = 0;
        int invalidInput = -1;
        String max_value = "MMMMMMMMMM";

        //Check for nulla, null,empty inputs
        if (inputString == null || inputString.length() == 0 || inputString.equalsIgnoreCase("nulla")) {
            return 0;
        }

        //Check for max value
        if(inputString.length() > max_value.length()){
            return invalidInput;
        }

        //The symbols V, L and D must not be repeated.
        if(checkForLetterCount('V',inputString) > 1 || checkForLetterCount('L',inputString) > 1 || checkForLetterCount('D',inputString) > 1){
            return invalidInput;
        }
        //The symbols I, X, C and M can be repeated at most 3 times.
        if(checkForLetterCount('I',inputString) > 3 || checkForLetterCount('X',inputString) > 3 || checkForLetterCount('C',inputString) > 3 || checkForLetterCount('M',inputString) > 3){
            return invalidInput;
        }

        //Creating a map for Roman numerical and its integer
        Map<Character,Integer> romanChart = new HashMap<>();

        romanChart.put('I',1);
        romanChart.put('V', 5);
        romanChart.put('X', 10);
        romanChart.put('L', 50);
        romanChart.put('C', 100);
        romanChart.put('D', 500);
        romanChart.put('M', 1000);
        // For include any new Roman character we need to change in this section
        // Include the value in the Map above

        //Iterate the input string
        for(int i=0; i< inputString.length()-1;i++){
            //Check for the valid Roman numerical input for current and next char
            if(romanChart.containsKey(inputString.charAt(i)) && romanChart.containsKey(inputString.charAt(i+1))){
                // If current roman char is greater than the next value then add the value
                if(romanChart.get(inputString.charAt(i)) >= romanChart.get(inputString.charAt(i+1)) ){
                    result = result + romanChart.get(inputString.charAt(i));
                }else{
                    result = result - romanChart.get(inputString.charAt(i));
                }
            }
            else{
                return invalidInput;
            }
        }

        //Check for the valid Roman numerical input
        if(romanChart.containsKey(inputString.charAt(inputString.length()-1))){
            //Accommodate the last input character
            result = result + romanChart.get(inputString.charAt(inputString.length()-1));
        }else{
            return  invalidInput;
        }

        return  result;
    }

    public int checkForLetterCount(Character charToFind,String inputString){

        int charCount = 0;
        char temp;
        for (int i = 0; i < inputString.length(); i++) {

            temp = inputString.charAt(i);
            if (temp == charToFind)
                charCount++;
        }
        return  charCount;
    }

}
