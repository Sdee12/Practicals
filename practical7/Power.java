package practical7;

public class Power {
	
	public double power(int length, int p){
		if( p == 1 ) return length;
		if( p > 1 )  return Math.pow(length,p);
		return 0;
	}
	public static void main(String[] args){
		Power p = new Power();
		int length = 6;
		System.out.println("The square of " + length + " is: " + p.power(length,2) );
		System.out.println("The cube of " + length + " is: " + p.power(length,3));
		System.out.println("The hypercube of " + length + " is: " + p.power(length,4));
		System.out.println("The hypercube of " + length + " is: " + p.power(length,5));
		System.out.println("The hypercube of " + length + " is: " + p.power(length,6));
	}
}
