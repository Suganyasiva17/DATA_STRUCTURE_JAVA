package DSA;

import java.util.*;

class PrepInsta
{
    // Driver method to test Map class
    public static void main(String[] args)
    {
        HashMap<Integer, String> myhashmap  = new HashMap<>();


        // Add elements to the map
        myhashmap.put(1, "Chennai");
        myhashmap.put(2, "Trichy");
        myhashmap.put(3, "Kanpur");
        myhashmap.put(4, "Coimbatore");
        myhashmap.put(5, "Bhopal");

        System.out.println(myhashmap);
        System.out.println(myhashmap.size());

        for (Map.Entry<Integer, String> x : myhashmap.entrySet())
            System.out.println(x.getKey() + " " + x.getValue());

        if (myhashmap.containsKey(1))
            System.out.println("Contains 1: " + myhashmap.get(1));
        else
            System.out.println("Doesnt contain 1 key");

        myhashmap.remove(1);
        System.out.println(myhashmap);
        System.out.println(myhashmap.size());

        if (myhashmap.containsValue("Bhopal"))
            System.out.println("Contains Bhopal");
        else
            System.out.println("Does Not contain Bhopal");

        for (Integer i : myhashmap.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (String i : myhashmap.values()) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : myhashmap.keySet()) {
            System.out.println("key: " + i + " value: " + myhashmap.get(i));
        }

        myhashmap.clear();
        System.out.println(myhashmap.isEmpty());

    }
}
