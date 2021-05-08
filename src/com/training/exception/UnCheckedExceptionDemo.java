package com.training.exception;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			int result = 5 / 0;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException aioe) {
			aioe.printStackTrace();
		}
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
		try {
			String user = "lion";
			System.out.println(user.charAt(7));
		} 
		catch(StringIndexOutOfBoundsException siobe){
			System.out.println(siobe.getMessage());
		}
		finally {
			System.out.println("close the resources");
			System.out.println("end");
		}
	}

}
