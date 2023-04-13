/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw7;

/**
 *
 * @author olesiyakorgueva
 */
public class HW7 {

    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName());
       MyRunnable rn = new MyRunnable();
       MyRunnable_2 rn2 = new MyRunnable_2();
       Thread th = new Thread(rn);
       Thread th2 = new Thread(rn2);
       Thread.yield();
       th.start();
       th2.start();
      
    }
}
