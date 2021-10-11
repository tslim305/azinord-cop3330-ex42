

/*
 *  UCF COP3330 Fall 2021 Exercise 42 Solution
 *  Copyright 2021 Timothy Azinord
 */

package com.company;

import java.util.*;
import java.io.*;

public class Employee {

    // function ( not used to calling them methods yet lmao) to print table
    public void printDetails(String filename)  {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }
            //used in instance that file is not found in line 11
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        Employee emp = new Employee();

        //formatting table
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");

        //display names and salary
        emp.printDetails("exercise42_input.txt");
    }
}