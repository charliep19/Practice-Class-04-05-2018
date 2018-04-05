import java.util.Scanner;
public class M1 {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		int [] numlist= new int[5];
		
		System.out.println("Enter the array elements");
		
		for (int j=0; j<numlist.length; j++) {
			
			numlist[j] = scan.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<numlist.length; i++) {
		
		sum = sum + numlist[i];
			
		
		}
		
		sum = sum/numlist.length;
		
		System.out.println(sum);
		
		
		
		
}
}