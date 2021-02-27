package com.company;

public class Main {

    public static void main(String[] args) {
	    char a = 'a';
    }
}

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] stringArr = name.split(" ");
        char first = stringArr[0].charAt(0);
        char second = stringArr[1].charAt(0);
        return Character.toUpperCase(first) + "." + Character.toUpperCase(second);
    }
}