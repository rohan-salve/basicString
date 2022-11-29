package com.example.string;

public class compareStr {
    compareStr(String str1, String str2)
    {
        System.out.println("Compairing Strings Contents "+str1+" and "+ str2 +" with .compareTo() method");
        if(str1.compareTo(str2)==0)
        {
            System.out.println("Same String man!");
        }
        else System.out.println("Strings not matching");
    }
}
