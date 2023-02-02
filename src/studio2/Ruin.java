package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is your startAmount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("What is the total Simulations?");
		double totalSimulations = in.nextDouble();
		System.out.println("The win limit is : " + totalSimulations);

		
		int count = 0;
		  
		int win = 0;
		  
		int loss = 0;
		  
		  for (int A = 0; A < totalSimulations; A++);
		  {
		   double chance = Math.random();
		   if (chance < (winChance * 0.01));
		   {
		    
		    
		   }
		   
		  }
		   
		   
		 
