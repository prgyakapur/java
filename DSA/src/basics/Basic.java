package basics; 
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//			System.out.print("*");
//		}
//			System.out.println();
//		}
		
		String[] name = new String[5];
		
		for(int i=0; i<=4;i++) {
			name[i] = sc.nextLine();
			
		}
		for(String n:name ) {
			System.out.print(n);
		}
		
		
	}

}
