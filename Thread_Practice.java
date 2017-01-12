/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Rahul
 */
public class Thread_Practice extends Thread {
	
	
	public void run(){ 			
			System.out.println("Running thread name is:"+Thread.currentThread().getName());  
			System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 Thread_Practice t1=new Thread_Practice();  
			 Thread_Practice t2=new Thread_Practice();
			 Thread_Practice t3=new Thread_Practice();
			 t1.setName("Thread-A");
			 t2.setName("Thread-B");
			 t3.setName("Thread-C");
			 t1.setPriority(Thread.MIN_PRIORITY);  
			 t2.setPriority(Thread.NORM_PRIORITY);  
			 t3.setPriority(Thread.MAX_PRIORITY);
			 t1.start();  
			 t2.start();  
			 t3.start();
		   
		 
		  
		 }  
}
