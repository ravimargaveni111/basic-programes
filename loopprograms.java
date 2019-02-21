package com.regnant;

public class loopprograms {
	
 public static void main(String[] args) {

	
		System.out.println("one to ten");
		for(int a=1;a<=10;a++) {
	System.out.println(a);
		}
		
		
	System.out.println("ten to one");
for(int b=10;b>=1;b--) {
	System.out.println(b);
}


	System.out.println("even numbers 1-20");
	int c;
	for(c=1;c<=20;c++)
	if(c%2==0)
		System.out.println(c);
	
	
	
     System.out.println("odd numbers 1-20");
     for(int d=1;d<=20;d++)
    	if(d%2!=0)
     System.out.println(d);
	
     
     
     System.out.println("numbers divisible by 7 upto 50");
     for(int e=1;e<=50;e++)
    	 if(e%7==0)
     System.out.println(e);
	
     
     
	System.out.println("alternative numbers from 1 to 10");
	for(int f=1;f<=10;f=f+2)
	System.out.println(f);
		
	

}}