package com.thread;

public class RealHelloWorldMultiThreaded {

    public static class Greeter extends Thread{
        private String country;

        public Greeter(String country){
            this.country = country;
        }

        @Override
        public void run(){
            Thread.currentThread().setName(country);
            System.out.println("Hello\t"+country+"Thread Name\t"+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        String[] countries = {"France","India","China","USA","Germany"};

        for(String country :countries){
            new Greeter(country).start();
        }
    }

}
