package cbiu.ac.bd.inheritance;

import java.sql.Array;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        String[] department = {"ENG","BBA","EEE","CSE","LAW","BHTM"};
        for (int i = 0 ; i < department.length; i++)
        {
            if (department[i].equals(department[3]))
            {
                System.out.println("This is CSE Department & position is "+department[i].length());
                break;
            }
        }

    }

}



