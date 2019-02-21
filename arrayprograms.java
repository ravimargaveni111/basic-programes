package com.regnant;

public class arrayprograms {
    
	public static void main(String[] args) {
		System.out.println("array elements");
		int arr[] = {21,21,25,24,26,14,35};
		
		for(int x:arr)
		{
		System.out.println(x);}
		
		
		System.out.println("even numbers in array");
		int ravi[] = {23,5,4,88,9,66,4,7,7,5,7,5,899,6,58};
		for(int i=0;i<ravi.length;i++) 
		if(ravi[i]%2==0) {
		System.out.println(ravi[i]);}
		
		
		System.out.println("odd numbers in array");

		int array[] = {21,5,54,58,69,5,854,74,7,545};
		for(int m=0;m<array.length;m++)
		if(array[m]%2!=0) 
			System.out.println(array[m]);
		
		
		System.out.println("elements at even index in array");
		 int ar[] = {2,1,2,55,4,7,8,78,7,8,7,6,9,99};
		 for(int b=0;b<ar.length;b++)
		 if(b%2==0)
		 System.out.println(ar[b]);
		 
		 
			 
			System.out.println("elements at odd index in array");
			
		int arrr[] = {2,1,2,55,4,7,8,78,7,8,7,6,9,99};
		for(int c=0;c<arrr.length;c++)
			if(c!=0)
				System.out.println(arrr[c]);
		
		
		
		System.out.println("middle to left");
		int left[] = {2,1,2,55,4,7,8,78,7,8,7,6,9,99};
		for (int e=left.length/2;e>0;e--) {
		System.out.println(left[e]);}
		
		
		
		System.out.println("middle to right");
		int right[] = {2,1,2,55,4,7,8,78,7,8,7,6,9,99};
		for(int f=right.length/2;f<right.length;f++)
		System.out.println(right[f]);
		
		

		System.out.println("Alternate Elements in an Array");
		int alter[] = {92,1,2,55,4,7,8,78,7,8,7,6,9,9};
	    for(int g=0;g<alter.length;g=g+2)
	    System.out.println(alter[g]);
	    
	    
	    System.out.println("Finding the index of a given element");
	    int index[] = {92,1,2,55,4,7,8,78,7,8,7,6,9,9};
	    int k=78;
	    for(int h=0;h<index.length;h++)
	    	if(index[h]==k)
	    System.out.println(h);
	    
	    
	    
	    System.out.println("Sum & Average of an Array");
	   int some[] = {92,1,2,55,4,7,8,78,7,8,7,6,9,9};
	   int l=0;
	   for(int x=0;x<some.length;x++)  
	   l=some[x]+l;
	   System.out.println("some "+ l);
	   int o=l/some.length;
	   System.out.println("avg "+o);
	   
	    
	   
	   
	   
	   
	   
	   
	   
	}}


