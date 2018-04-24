package com.garbagecollector;
import java.io.*;
import java.util.*;

public class GCSimulator {
    private static HashMap<String, Object> stackRef;
    // type 1 reference: stack-heap, a stack variable containing a
    // pointer that points to a heap object

    private static HashMap<Object, Map<String, Object>> heapRef;
    // type 2 reference: heap-heap, where a field of an object containing
    // a pointer that points to another heap object

    private static HashSet<Object> allObjects;
    // our goal is to identify and print unreachable objects, so we need to
    // use a set to store all objects created during execution

    public GCSimulator() {
        stackRef = new HashMap<String, Object>();
        heapRef = new HashMap<Object, Map<String, Object>>();
        allObjects = new HashSet<Object>();
    }

    static void assign(String aName, String bName, Object o) {
        //add pair <aName, o> into the stackRef.
        stackRef.put(aName, o);

        //add all map entries associated with o to a new HashMap.
        HashMap<String, Object> associatedRefs = new HashMap<String, Object>();

        if (stackRef.get(bName) != null)
            associatedRefs.put(bName, stackRef.get(bName));

        for (Map.Entry<String, Object> e : stackRef.entrySet()) {
            if (o.equals(e.getValue()) && !associatedRefs.containsKey(e.getKey()))
                associatedRefs.put(e.getKey(), e.getValue());
        }

        //add this HashMap associatedRefs into the heapRef, with Object o
        heapRef.put(o, associatedRefs);
    }
    // aName and bName represent the variable names “a” and “b”, respectively;
    // o denotes the object referenced by a and b

    static void createObject (String aName, Object o) {
        allObjects.add(o);
        stackRef.put(aName, o);
    }
    // aName is the name of variable “a”, and o represents the newly created object

    //todo: debug readObject if anything, all other methods (except writeObject as of now) seem right
    static void readObject (String bName, String aName,  Object o) {
        //add pair <bName, o> into the stackRef.
        stackRef.put(bName, o);
        //heapRef.put(o, new HashMap<String, Object>(stackRef)); //not sure
        //possibly other things?
    }
    // bName and aName represent the two variables “b” and “a”,
    // and o denotes the heap object referenced by b

    static void writeObject(String aName, String bName,  String fieldname, Object oa, Object ob) {
        //when a field write is seen, we need to perform the following map update:
        //( (Map)heapRef.get(oa) ).put(fieldname, ob), which basically replaces
        //the old object referenced by the field "fieldname" of oa w/ a new obj ob.
    }
    // bName and aName represent the two variables “b” and “a”,
    // fieldname denotes the name of the field f,
    // oa denotes the heap object referenced by a,
    // and ob denotes the heap object referenced by b

    static void gc() {
        //first, identify root objects, i.e. objects pointed to by stack variables
        //traverse stackRef and find such objects

        //use a graph traversal algorithm that iteratively identifies transitively
        //reachable objects by chasing references in map heapRef
    }

    // a gc method that will be explicitly called to collect garbage

}
