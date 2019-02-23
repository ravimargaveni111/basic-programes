
public class string_programs {
	public static void main(String[] args) {
		
		//printing String in upper case
		String ravi = "lagaan is ameer's movie";
		String r=ravi.toUpperCase();
		System.out.println(r);
		
		
		//printing String in lower case
		
		String k = "RAVI MARGAVENI";
		String c=k.toLowerCase();
        System.out.println(c);
        
        
        //Reverse a string
        String j = "java programming";
       StringBuffer y = new StringBuffer(j);
       y.reverse();
       System.out.println(y);
	
	
		//Write a program for swapping of two string
		String s = "ravi ";
		String h = "margaveni";
		String q=s;
		s=h;
		h=q;
		System.out.println("The text in s after swapping is "+ s);
		System.out.println("The text in h after swapping is "+ h);
		
	
		//program to remove all white spaces from a string
		String w = ("Iam a music lover");
		w = w.replaceAll(" ", "");
		System.out.println(w);
		
		
		//converting integer to string in java
		
		int u = 121;
		String t = Integer.toString(u);
		System.out.println(t);
		
		
		//converting string to integer
		String d = "325";
		int z = Integer.parseInt(d);
		System.out.println(z);
					//or 
		int v = Integer.valueOf(d);
		System.out.println(v);
		
		
		//counting number of vowels and consonants in a String
		String ee = "regnant software solutions";
		int vowels=0, consonants=0;
		for(int g=0;g<ee.length();g++)  {
		char dd = ee.charAt(g);
		if(dd=='a'||dd=='e'||dd=='i'||dd=='o'||dd=='u') {
			vowels++;}
		
		else if(dd>='a' && dd<='z'){
			consonants++;}
		}
	System.out.println("number of vowels in string "+vowels);
	System.out.println("number of cosonants in string " +consonants);
	
	
		
		//counting duplicate letters in string
	
	String rams= "ravi margaveni";
	 System.out.println("duplicate characters are  ");
	char[]ram= rams.toCharArray();
	for(int i=0;i<rams.length();i++) {
	for(int pp=i+1;pp<rams.length();pp++) {
	
	if(ram[i]==ram[pp]) {
	
	System.out.println(ram[pp]);
	    }
	  }
	}
	//counting number of words in string
	String ramm= "regnant software solutions";
		int count=0;
		String [] i = ramm.split(" ");
		for (String kk:i)
		
		{
			if(kk!=(" ")) {
				count++;}}
				System.out.println("number of words in string  " +count);
			//or
				
				
		String oo= "regnant  software solutions bengaluru";
		int countt=1;
		char[] re=oo.toCharArray();
		for(int nn=0;nn<oo.length();nn++)
		{
		if((re[nn]==' ')&&(re[nn+1]!=' '))
		{
		countt++;}}
     	System.out.println("number of words in string "+countt);
				
				
			
		
			
				
				
			//palindrome
				
			String ra= "ravi";
			StringBuffer ll= new StringBuffer(ra);
			StringBuffer ww=ll.reverse();
			String sa =ww.toString();
			if(sa.equals(ra)) {
			System.out.println("string is palindrome");
			}
			else
			{System.out.println("string is not palindrome");
			}
				
			String out= "mom";
			StringBuffer ss= new StringBuffer(out);
			StringBuffer uu=ss.reverse();
			String tt=uu.toString();
			if(tt.equals(out)) {
				System.out.println("string is palindrome");
				}
				else
				{System.out.println("string is not palindrome");
				}
			
		
			
		
	
		
	
}}