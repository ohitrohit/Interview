package interview;

public class NumberPrimeOrnot {

	public static void main(String[] args) {
	
		int a =17;
		for(int i=2; i<=a/2; i++) {
			if(a%i==0) {
				System.out.println(a+" not a prome number");
				return;
			}
		}
		System.out.println(a+" a prime number");
	}
}
