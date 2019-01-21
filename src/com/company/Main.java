package com.company;

public class Main {

    public static void main(String[] args) {
	String[] wordArray = {"wheels","on","the","bus"};
	RandomStringChooser stringChooser = new RandomStringChooser(wordArray);
	for(int i = 0; i < 6; i++)
    {
        System.out.println(stringChooser.getNext() + "");
    }
    }
}
