package com.garbagecollector;

public class Main {

    public static void main(String[] args) {
	    GCSimulator simulator = new GCSimulator();

	    Object a = new Object();
	    Object b = new Object();
	    Object c = b;

	    simulator.createObject("a", a);
	    simulator.createObject("b", b);
	    simulator.assign("c", "b", b);
	    //simulator.writeObject("c", "a", "f", c, a);
        //simulator.assign("a", "b", b);
        simulator.gc();
    }
}
