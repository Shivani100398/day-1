package com.ibm.thread;

public class Application {
public static void main(String[] args) {
	
	Thread T1= new Worker();
	T1.start();
	Thread T2=new Thread(new AnotherWorker());
	T2.start();
	System.out.println("In main method");
}
}
