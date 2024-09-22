package DSA;

import java.util.*;

class PrepInsta
{
    // Driver method to test Map class
    public static void main(String[] args)
    {
        HashSet<String> myhashset = new HashSet<String>();


        myhashset.add("PrepInsta");
        myhashset.add("Learn");
        myhashset.add("Prime Video");


        System.out.println(myhashset);
        System.out.println(myhashset.contains("Learn"));

        for (String s : myhashset) {
            System.out.print(s + " ");
        }

        System.out.println("");

        System.out.println(myhashset.size());
        boolean b = myhashset.contains("Learn");
        System.out.println(b);

        myhashset.remove("Learn");
        System.out.println(myhashset.size());


        Iterator<String> i = myhashset.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next() + " ");
        }

        System.out.println("\n" + myhashset.isEmpty());
        myhashset.clear();

    }
}
