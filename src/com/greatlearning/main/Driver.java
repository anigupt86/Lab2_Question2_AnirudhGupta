//Creating and importing packages
package com.greatlearning.main;
import com.greatlearning.service.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//Creating object of the service class
		MergeSortImplementation ms = new MergeSortImplementation();
		NotesCount nc = new NotesCount();
		
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking the required inputs from user
		System.out.println("Enter the size of currency denominations");
		
		int size = sc.nextInt();
		int array[] = new int[size];
		
		//Array to sor the currency denomination in descending order
		int array_descending_order[] = new int[size];
		
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++) {
		array[i] = sc.nextInt();	
		}
		
		//Calling the mergesort function the sort the curency denomination array
		ms.mergesort(array,0,array.length-1);
		
		int temp = size-1;
	
		//Sorting the currency denomination in descending order
		for(int i=0;i<array.length;i++)
		{
			array_descending_order[i]=array[temp];
			temp = temp-1;
			
		}
		
		//Input from the user
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		//Calling the notes counter function
		nc.notescountimplementation(array_descending_order, amount);

	}
	

}
