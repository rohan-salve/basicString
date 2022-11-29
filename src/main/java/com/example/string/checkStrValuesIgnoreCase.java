package com.example.string;

public class checkStrValuesIgnoreCase {
    checkStrValuesIgnoreCase(String str1 , String str2)
    {
        System.out.println("Ignoring Case Checking if the contents of string "+ str1 +" and "+ str2 +" are same with str1.equalsIgnoreCase(str2)");
        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println("String contents are same");
        }
        else System.out.println("String Contents are Different");
    }
}
