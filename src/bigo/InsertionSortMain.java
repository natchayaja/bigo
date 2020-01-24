/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author JAJA
 */
public class InsertionSortMain {
    public static void main(String args[])
	{
//		int  arr1[]={20,50,45,67,87,67,88,88,99,00};
//		int  arr2[]={100,20,50,89,07,99,34,56,55,22};

                Random rd = new Random();
     	int[] arr1 = new int[5000];
        int[] arr2 = new int[5000];
    	int n1 = arr1.length;
        int n2 = arr2.length;
    	for (int i = 0; i < arr1.length; i++)
     	arr1[i] = rd.nextInt();
        for (int i = 0; i < arr2.length; i++)
     	arr2[i] = rd.nextInt();
    	long millis = System.currentTimeMillis();
            
    	System.out.println("Time LinearSort Before Sorting: "+millis);
    	Arrays.sort(arr1);
    	System.out.println("Duration: " +(System.currentTimeMillis()-millis)+"millisecond");
            
        
       
        
       long ins = System.currentTimeMillis();    
            System.out.println("Time Insertion Sort Before Sorting: "+ins);
            insertionSort(arr2);
            System.out.println("Duration2:" +(System.currentTimeMillis()-ins)+"millisecond");
        
	}
 
	public static int[] insertionSort(int arr2[])
	{
		for (int i = 1; i < arr2.length; i++) 
		{ 
			int valueToSort = arr2[i];
			int j; 
			// If we get smaller value than valueToSort then , we stop at that index. 
			for ( j = i; j > 0 && arr2[j - 1] > valueToSort; j--) {
				arr2[j] = arr2[j - 1];
			}
 
			// We will put valueToSort at that index
			arr2[j] = valueToSort;
			System.out.print("Iteration "+(i)+": ");
			printArray(arr2);
		}
 
		return arr2;
	}
	public static void printArray(int arr2[])
	{
		for (int i = 0; i <arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
}
