package com.training.innerclass;

public class TopClassExample {
	
	public TopClassExample(){
		
		// functional interface from Jdk8
		// SAM - Single Abstract Method
		// Runnable  - functional interface
		// run() - single abstract method
		Runnable runn = new Runnable() {// anonymous inner class
			
			@Override
			public void run() {
				System.out.println("run");
				
			}
		};
		Thread thread  = new Thread(runn);
		thread.start();
	}
	
	public void count(int i){
		
		class MetInnerClass{
			public MetInnerClass(){
				//i++;
			}
		}
		MetInnerClass metInner = new MetInnerClass();
	}
	
	public static class StaticInner {
		
	}
	public class InnerClass{
		
	}
	
	public static void main(String[] args) {
		TopClassExample outer = new TopClassExample();
		InnerClass innerCls = outer.new InnerClass();
		StaticInner staticInner = new StaticInner();
	}

}
