package com.ibm.thread;

public class Worker extends Thread {
  public void run()
  {
	  System.out.println(Thread.currentThread());
  }
}
