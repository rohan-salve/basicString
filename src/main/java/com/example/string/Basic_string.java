package com.example.string;

public class Basic_string {


    public static void main(String[] args) {

        getStrFromUser s = new getStrFromUser();
        String s1 = s.strGiven();
        String s2 = s.strGiven();

        String s3 = "ROHAN";
        String s4 = "SALVE";

        String s5 = "ROHAN";

        System.out.println(s1);
        System.out.println(s2);

        new compareStr(s1,s2);

        new checkStrRefInSCP(s1,s2);

        new checkStrValues(s1,s2);

        System.out.println("reversing the First String");

        new revStr(s1);

        new compareStr(s3,s4);
        new compareStr(s3,s5);

        new checkStrRefInSCP(s3,s4);
        new checkStrRefInSCP(s3,s5);

        new checkStrValues(s3,s4);
        new checkStrValues(s3,s5);

        new checkStrValuesIgnoreCase(s1,s2);

        String s6 = new String("ROHAN");// FETR00003 Here it creates two Objects one in SCP as we have passed "ROHAN" literal directly and one in HEAP

        new checkStrRefInSCP(s3,s6); // FETR00003 Here It will fail as s6 is referring to string object stored in HEAP.



    }


}
