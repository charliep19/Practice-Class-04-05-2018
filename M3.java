import java.util.Scanner;
public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Even and Odd");
		
		int [] list =new int[5];
		int counter=0;
		System.out.println("Elements");
		for ( int k=0; k<list.length; k++) 
		{
			list[k]=scan.nextInt();
		}
		for (int j=0; j<list.length; j++) 
		{
			
			if(list[j]%2==0)
				{
				counter++;
				}
	}
System.out.println(counter);
System.out.println("even nums"+ (counter)+"odd nums"+(list.length-counter));
}

}