package org.example.service.string;

public class EqualsCheck {

    public static void main (String[] args){

        String s1 = "Anjali";
        String s2 = "Anjali";
        String s3 = s1;

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        s1 = "Aatika";

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }

}
