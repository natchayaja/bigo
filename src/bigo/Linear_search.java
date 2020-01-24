/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Random;
import static javafx.util.Duration.millis;

/**
 *
 * @author JAJA
 */
public class Linear_search {
    public static void main(String[] args)
	{
   	 
    	Random rd = new Random();
     	int[] arr = new int[2000];
    	int n = arr.length;
    	for (int i = 0; i < arr.length; i++)
     	arr[i] = rd.nextInt();
    	long millis = System.currentTimeMillis();
            
    	System.out.println(millis);
    	Arrays.sort(arr);
    	System.out.println("Duration:" +(System.currentTimeMillis()-millis)+"millisecond");
   	 
      
	}
}


