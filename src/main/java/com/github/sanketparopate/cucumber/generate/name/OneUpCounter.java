package com.github.sanketparopate.cucumber.generate.name;

public class OneUpCounter implements Counter {

    private static int counter = 1;

    public int next() {
        return counter++;
    }

}
