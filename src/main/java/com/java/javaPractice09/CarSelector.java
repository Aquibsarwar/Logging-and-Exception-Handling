package com.java.javaPractice09;
import java.io.IOException;

public class CarSelector {

	public static void main(String[] args)  {
		Car car = new Car();
		for (String argument : args) {
			if(isValid(argument)) {	
				car.process(argument);
				System.out.println("valid state: " +argument);
				}
			else{
				System.err.println("invalid state: " +argument);
				}
		}
	
	}

	private static boolean isValid(String argument) {
		// TODO Auto-generated method stub
		try {
			CarState.valueOf(argument);
			//System.out.print("it ran perfectfully");
		}catch(IllegalArgumentException e){
			//System.out.print("now I am here");
			return false;
		}
		return true;
	
	}
} 