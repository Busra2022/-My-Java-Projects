import java.util.Arrays;

public class Summe {
	
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		int summe = 0;
		
		for(int i = 0; i<a.length; i++) {
			
			summe += a[i];
			
		}
		
		System.out.println("summe:" + summe);
	}

}
