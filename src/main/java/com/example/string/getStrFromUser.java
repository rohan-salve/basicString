package com.example.string;

import java.util.Scanner;

public class getStrFromUser {

 public String strGiven()
    {
        System.out.println("Enter String :: ");
        final Scanner sc = new Scanner(System.in);

        String s = sc.next();

        return s;



    }
}
