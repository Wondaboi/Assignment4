package com.assignment4.ISP;

interface WorkerJob{
    public void eat();
    public void sleep();
    public void work();
}

class Worker implements WorkerJob{

    public void eat(){
        System.out.println("Eats Food");
    }
    public void sleep(){
        System.out.println("Sleeps in Bed");
    }
    public void work(){
        System.out.println("Works Hard");
    }
}

