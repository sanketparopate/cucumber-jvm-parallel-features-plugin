package com.github.sanketparopate.cucumber.generate;

import com.github.sanketparopate.cucumber.generate.name.Counter;

public class InstanceCounter implements Counter {

    private int counter = 1;

    public int next() {
        return counter++;
    }

}