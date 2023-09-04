package com.easy;

public class ReverseString{
    public static void main(String[] args) {
        String name="brock";
        String reverse="";
        char letters;
        for(int i =name.length()-1;i>=0;i--){
            letters=name.charAt(i);
            reverse=reverse+letters;
        }
        System.out.println(reverse);
    }
}