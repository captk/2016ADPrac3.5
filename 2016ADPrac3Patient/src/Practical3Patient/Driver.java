/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical3Patient;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author k
 */
public class Driver {

    public static void main(String[] args) {
        Queue<Patient> pQueue = new PriorityQueue<Patient>();

        boolean morePatients = true;
        String line;
        Scanner in = new Scanner(System.in);

        try {
            pQueue.add(new Patient("John", 5, 10.5));
            pQueue.add(new Patient("David", 10, 11.3));
            pQueue.add(new Patient("Jim", 10, 10.8));
            pQueue.add(new Patient("Joan", 3, 12.0));
            pQueue.add(new Patient("Jane", 15, 3.2));
            //System.out.println(pQueue);
        } catch (SeverityOutOfBoundsException e) {
            System.out.println("Severity is not within 1-10");
        }

        while (morePatients) {
            System.out.println("Please give Name Severity Time:");
            line = in.nextLine();
            if (line.equals("QUIT")) {
                morePatients = false;
            } else if (line.equals("PROCEED")) {
                while (!pQueue.isEmpty()) {
                    System.out.println(pQueue.poll());
                }
            } else {
                Scanner lineReader = new Scanner(line);
                try {
                    pQueue.add(new Patient(lineReader.next(), lineReader.nextInt(),
                            lineReader.nextDouble()));

                } catch (SeverityOutOfBoundsException e) {
                    System.out.println("Severity is not within 1-10");
                }
            }
        }

    }
}
