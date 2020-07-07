package com.mvn.junittest03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    //실습1
    public void sortArr(int [] arr) {
    	
    	
    	int[] test = new int[5];
    	
    	Arrays.sort(test);
    	for(int i=0; i<test.length; i++) {
 
    		System.out.println(test[i]);
    		
    	}

    	
        
    	
    }
    
    //실습2
    public int max(int [] arr) {
    	//TODO
    	return 0;
    }
    
    public int min(int [] arr) {
    	//TODO
    	return 0;
    }
    
    //실습3
    public String toNumber(String str) {
    	String result = "";
    	//TODO
    	return result;
    }
    
}
