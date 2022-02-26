package Assignments_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import Collection.Demo01;

/*
  Develop a java class with a method saveEvenNumbers(int N)
  using ArrayList to store even numbers from 2 to N, where N is a
  integer which is passed as a parameter to the method
  saveEvenNumbers().
  
  The method should return the ArrayList (A1) created. In the
  same class create a method printEvenNumbers()which iterates
  through the arrayList A1 in step 1, and It should multiply
  each number with 2 and display it in format 4,8,12....2*N. and
  add these numbers in a new ArrayList (A2).
  
  The new ArrayList (A2) created needs to be returned. Create a
  method printEvenNumber(int N) parameter is a number N. This
  method should search the arrayList (A1) for the existence of
  the number �N� passed. If exists it should return the Number
  else return zero.Hint: Use instance variable for storing the
  ArrayList A1 and A2.
NOTE: You can test the methods using a main method.
*/
public class QueA1 {

ArrayList<Integer> A1 = new ArrayList<Integer>();
	
	public ArrayList<Integer> saveEvenNumbers(int N) 
	{
		A1 = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) A1.add(i);
		}
		
		return A1;
	}
	
	public int printEvenNumbers(int a) {
		
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		boolean flag = false;
		int b = 0;
		
		for (int j : A1) {
			A2.add(j * 2);
			System.out.println(j * 2);
		
		}
		
		for(int j : A1)
		{	
			b = (A2.get(j));
			System.out.println("Pointer at Element is : "+A2.get(j));
			
			if(a == b)
			{
				 flag = true;
			}
		
		}
		if(flag == true)
			return a;
		else
			return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		QueA1 q1 = new QueA1();
		
		int b = 0;
		System.out.println("Enter a Number : ");
		int N = sc.nextInt();

		q1.saveEvenNumbers(N);
		
		System.out.println("Enter the Number to search in the List : ");
		int a = sc.nextInt();
		a = q1.printEvenNumbers(a);
		
		if(b != 0)
		{
			System.out.println(b+" Exists in List !");
		}
		else
		{
			System.out.println(b+" Doesn't Exist in List !");
		}
	}
}