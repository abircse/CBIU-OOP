package com.lab.cbiu;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("MR X");
        mylist.add("MR W");
        mylist.add("MR R");
        mylist.add("MR F");
        mylist.add("MR Y");
        mylist.add("MR G");
        mylist.add("MR U");

        if (mylist.isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println(mylist.toString());
        }

    }
}
