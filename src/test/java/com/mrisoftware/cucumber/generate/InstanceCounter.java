package com.mrisoftware.cucumber.generate;

import com.mrisoftware.cucumber.generate.name.Counter;

public class InstanceCounter implements Counter {

    private int counter = 1;

    public int next() {
        return counter++;
    }

}