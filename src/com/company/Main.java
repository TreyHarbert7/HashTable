import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	Hashtable<Integer, String> ht1 = new Hashtable<>();//creates hashtable named ht1 keyed by an integer and a string

    Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();//creates a second hashtable named ht2 keyed by an integer and a string

    //buckets for first hashtable using put method
    ht1.put(1, "one");
    ht1.put(2, "two");
    ht1.put(3, "three");
    ht1.put(4, "four");

    //buckets for second hashtable using put method
    ht2.put(5, "five");
    ht2.put(6, "six");
    ht2.put(7, "seven");
    ht2.put(8, "eight");

    System.out.println("Mappings of ht1: " + ht1);
    System.out.println("Mappings of ht2: " + ht2);

    }
}
