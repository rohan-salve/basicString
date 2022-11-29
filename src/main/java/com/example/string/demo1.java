package com.example.string;

import java.util.Locale;


public class demo1 {
    public static void main(String[] args) {
        String s1 = "Rohan";
        String s2 = new String("Rohan");

        System.out.println(s1);
        System.out.println(s2);

        s1.toLowerCase(Locale.ROOT);
        System.out.println("As immutable it wont get Lowercase here  \n"+s1);

        s1.toLowerCase();
        System.out.println(s1.toLowerCase());

        System.out.println(s1.charAt(2));

        char [] s3 = s1.toCharArray();
        for (char ch  : s3)
        {
            System.out.println(ch);
        }
        char [] s4 = s2.toCharArray();
        System.out.println(s3.length);
        for (int i = s3.length-1 ; i >=0 ; i--)
        {
            System.out.println(s3[i]);
        }

        System.out.println(s1.codePointBefore(4));

        System.out.println(s1.indent(3));

        String s5 = "Bananammnn";

        System.out.println(s5.indexOf("a"));
        char[] s6 = s5.toCharArray();
        int count = 0;
        int index=0;
        int aIndex =0;
        for (char c: s6)
        {
            index++;
            if(c=='a')
            { count++;
                aIndex=index-1;
            }
        }
        System.out.println("Number of a in s6 :: "+count + "and Last Index is "+ aIndex);

        int cpc = s1.codePointCount(2, 5);
        System.out.println(cpc);

        String s7 = new String(s2);
        String s8 = s1;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s7.hashCode());
        System.out.println(s8.hashCode());

        System.out.println(s1.compareTo(s2));

        System.out.println("euquals method compares values of String variable hence \n s1.equals(s2) "+s1.equals(s2));
        System.out.println("== acts as reference hence \n s1==s2 "+ (s1==s2));
        System.out.println(s1);



    }
}
