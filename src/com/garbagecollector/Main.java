package com.garbagecollector;

public class Main {

    public static void main(String[] args) {
        GCSimulator simulator = new GCSimulator();

        Test A = new Test("A");
        Test B = new Test("B");
        Test C = A;
        Test D = C;
        Test E = B;

        simulator.createObject("a", A);
        simulator.createObject("b", B);
        simulator.assign("c", "a", A);
        simulator.assign("d", "c", C);
        simulator.assign("e", "b", B);
        simulator.assign("a", "b", B);

        simulator.gc();
    }
}
