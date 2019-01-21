package com.company;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> words;

    public RandomStringChooser(String[] wordArr)
    {
        words = new ArrayList<String>();
        for(String word : wordArr)
        {
            words.add(word);
        }
    }

    public String getNext()
    {
        if(words.size() > 0)
        {
            return words.remove((int)(Math.random()*words.size()));
        }
        return "n/a";
    }
}
