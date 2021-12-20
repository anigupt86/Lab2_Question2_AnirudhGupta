package com.greatlearning.service;

public class NotesCount {
	
	public static void notescountimplementation(int array[],int amount) {
	
	//Declaring array to store the count of currency denomination	
	int notecount[] = new int[array.length-1];
	
	try {	
		for(int i=0;i<array.length-1;i++) 
		{
			//Checking if the required amount is greater than available currency denomination
			if(amount>=array[i]) 
			{
			
			//Getting the count of respective currency denomination
			notecount[i]=(amount/array[i]);
			
			//Calculating the remaining amount
			amount = amount - (notecount[i]*array[i]);
			
			}
			
		}
		
		//If any amount is pending after dividing through the available currency denominations
		if(amount>0) {
				System.out.println("Not possible to divide the amount in the available currency denomination");
		}
		
		//Displaying the value of currency denomination for splitting the amount
		else 
		{
			for(int i=0;i<array.length-1;i++) 
			{
				if(notecount[i]!=0) 
				{
				System.out.println("Number of currency of denomination "+array[i]+" is "+notecount[i]);
				}
			}
		}
	}
	
	//Catching arithmetic exception
	catch(ArithmeticException e)
	
	{
		System.out.println(e+"Notes of denomination 0 is invalid");	
	}
			
	}
}
