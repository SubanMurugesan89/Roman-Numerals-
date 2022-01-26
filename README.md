# Roman-Numerals-
Natwest Assignment - Suban Murugesan
Author : Suban Murugesan
Date : 27-01-2022
Reviewer : Craig Berry, Jonathan Osborne

Project Details:
https://us-south.git.cloud.ibm.com/aicoe-training/roman-numerals

Assumption:
============
1. In the given requirement the value for Roman symbol V is given incorrectly as 1.
Assuming this as 5.
2. Max length to convert the arabic to Roman and Roman to arabic is mentioned as below
nulla < n < MMMMMMMMMM
0 < n < 10000
The max range of Roman number is 3999.
The symbols I, X, C and M can be repeated at most 3 times.
Assuming the above given max length is incorrectly as this is overriding the Roman conversion rule.

High level Design:
==================

Integer To Roman:
===============
The Roman numerals are usually written largest to smallest from left to right.
But the number 4 is not IIII. Instead, the number four is written as IV.
Because the one is before the five so we subtract it making as four.
The same logic applies to the number 9, so the reuslt will be IX.
There are six instances where we need to do subtraction.

* I can be placed before V (5) and X (10) to make 4 and 9.
* X can be placed before L (50) and C (100) to make 40 and 90.
* C can be placed before D (500) and M (1000) to make 400 and 900.

Solution:
--------
Create a map of Roman numerals and it’s corresponding values as key value pair.
Update the map from largest to smallest, as we want to pick the largest Roman numeral first than smallest one, here we are using LinkedHashMap maintain insertion order.
Iterate the map and check if input number is greater than the map value.
In that case subtract map value from the number and append the corresponding roman numeral in a string Buffer.

Class: Integer To Roman
Method name : convertIntegerToRoman
Input:  Arabic Numbers ( Integer )
Output: Roman values ( String )

Roman to Integer:
================

Solution:
--------
Iterate the given input string and get each roman numeral char at a time.
Convert each symbol of Roman Numeral into the values as per Map
If current value of numeral is greater than or equal to the value of next numeral,then add this value to the running total.
Else subtract this value from the result.

Class: Roman To Integer
Method name : convertRomanToInteger
Input:  Roman values ( String )
Output: Arabic Numbers ( Integer )

Unit Test:
==========
Unit test cases for the both the classes are provided in test Package separtely.
