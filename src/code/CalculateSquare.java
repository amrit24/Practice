package code;

import java.util.Scanner;

public class CalculateSquare {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sq = 0;
		for(int i=1; i<=num; i++) {
		   sq+=num;	
		}
		
		System.out.println("Square of "+num+ " is "+sq);

	}

}
