package com.example.string;

public class checkStrRefInSCP {

    checkStrRefInSCP(String str1, String str2)
    {
        System.out.println("Checking if both "+str1+" and "+ str2 +" pointing to same String in SCP with str1==str2");
        if (str1==str2)
            System.out.println("Whoa! Reference of Strings are pointing to same String Object in SCP!");
        else System.out.println("Strings are not pointing to same String Object in SCP!");
    }
}
