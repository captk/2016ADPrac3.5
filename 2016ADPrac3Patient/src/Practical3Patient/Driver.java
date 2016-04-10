/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical3Patient;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author k
 */
public class Driver {

    public static void main(String[] args) {
        Queue<Patient> pQueue = new PriorityQueue<Patient>();
        pQueue.add(new Patient("John", 5, 10.5));
        pQueue.add(new Patient("David", 10, 11.3));
        pQueue.add(new Patient("Jim", 10, 10.8));
        pQueue.add(new Patient("Joan", 3, 12.0));
        pQueue.add(new Patient("Jane", 15, 3.2));
        //System.out.println(pQueue);
        
        while(!pQueue.isEmpty()){
            System.out.println(pQueue.poll());
        }
    }
}
