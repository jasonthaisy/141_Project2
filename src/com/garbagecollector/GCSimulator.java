package com.garbagecollector;
import java.io.*;
import java.util.*;

public class GCSimulator {
    private HashMap<String, Object> stackRef;
    // type 1 reference: stack-heap, a stack variable containing a
    // pointer that points to a heap object

    private HashMap<Object, Map<String, Object>> heapRef;
    // type 2 reference: heap-heap, where a field of an object containing
    // a pointer that points to another heap object

    public GCSimulator() {
        stackRef = new HashMap<String, Object>();
        heapRef = new HashMap<Object, Map<String, Object>>();
    }

    static void assign(String aName, String bName, Object o) {
        //add pair <aName, o> into the stackRef.
    }

    // aName and bName represent the variable names “a” and “b”, respectively;
    // o denotes the object referenced by a and b
    static void createObject (String aName, Object o) {

    }

    // aName is the name of variable “a”, and o represents the newly created object
    static void readObject (String bName, String aName,  Object o) {
        //add pair <bName, o> into the stackRef.
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
