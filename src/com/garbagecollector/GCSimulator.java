package com.garbagecollector;

public class GCSimulator {

    public GCSimulator() {

    }

    static void assign(String aName, String bName, Object o) {

    }

    // aName and bName represent the variable names “a” and “b”, respectively;
    // o denotes the object referenced by a and b
    static void createObject (String aName, Object o) {

    }

    // aName is the name of variable “a”, and o represents the newly created object
    static void readObject (String bName, String aName,  Object o) {

    }

    // bName and aName represent the two variables “b” and “a”,
    // and o denotes the heap object referenced by b
    static void writeObject(String aName, String bName,  String fieldname, Object oa, Object ob) {

    }

    // bName and aName represent the two variables “b” and “a”,
    // fieldname denotes the name of the field f,
    // oa denotes the heap object referenced by a,
    // and ob denotes the heap object referenced by b

    static void gc() {

    }

    // a gc method that will be explicitly called to collect garbage

}
