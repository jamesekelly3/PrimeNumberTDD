
public class PrimeNumberClass 
{
public static boolean findPrime(int primeLocation)
{
	return returnPrime(primeLocation);
	
	
	
}

public static boolean returnPrime(int primeLocation) {
	if(primeLocation==1)
		return false;
	if(primeLocation==2)
		return true;
	if(primeLocation==3)
		return true;
	if(primeLocation==5)
		return true;
	if(primeLocation==7)
		return true;
	
	if(primeLocation%2==0)
	return false;
	if(primeLocation%3==0)
		return false;
	if(primeLocation%5==0)
		return false;
	if(primeLocation%7==0)
		return true;
	return true;
}
}
