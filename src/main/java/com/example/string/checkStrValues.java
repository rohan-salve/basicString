package com.example.string;

public class checkStrValues {
    checkStrValues()
    {
        System.out.println("Default Contructor called... Please run app again");
    }
    checkStrValues(String str1, String str2)
    {
        System.out.println("Checking if the contents of string "+ str1 +" and "+ str2 +" are same with str1.equals(str2)");
        if (str1.equals(str2))
        {
            System.out.println("String contents are same");
        }
        else System.out.println("String Contents are Different");
    }
}
