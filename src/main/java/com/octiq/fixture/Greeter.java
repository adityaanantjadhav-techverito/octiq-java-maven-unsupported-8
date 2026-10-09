package com.octiq.fixture;

import java.util.ArrayList;
import java.util.List;

public class Greeter {
    public List<String> greet(String name) {
        List<String> out = new ArrayList<String>();
        out.add("Hello, " + name);
        return out;
    }
}
