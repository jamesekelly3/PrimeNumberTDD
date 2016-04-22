import java.util.ArrayList;
import java.util.Scanner;

public class myApp {
static Scanner in= new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer>primeArray=new ArrayList<>();
		System.out.println("Prime Finder!!!");
		System.out.println("Enter a number 1-25 to find out what prime is in that position:");
		int input=in.nextInt();
		
	for(int i=1;i<input*input;i++){
			if(PrimeNumberClass.findPrime(i)==true)
				primeArray.add(i);
		
	}System.out.println("Prime number at position "+ input+" is "+ primeArray.get(input-1));
			
		
	}

}
