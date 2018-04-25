package com.garbagecollector;

public class Test extends Object {
    private String myName;
    public Test() {
        super();
    }

    public Test(String name) {
        super();
        myName = name;
    }

    public String toString() {
        super.toString();
        return myName;
    }
}
