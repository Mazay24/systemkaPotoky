package com.metanit;


public class Main extends Thread {
    public void  run() {
        System.out.println(getName());
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++ ){
            (new Main()).start();
        }
        System.out.println("главный поток");
        Thread thread = new Thread();
        System.out.println(thread.currentThread());



    }

}