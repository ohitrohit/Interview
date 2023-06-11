package interview;

import java.util.Scanner;

public class calcy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a ");
		int a = sc.nextInt();
		System.out.println("enter the value of b ");
		int b = sc.nextInt();
		
		System.out.println("chose the opratiion: \n + \n - \n * \n / \n %");
		char option = sc.next().charAt(0);
		
		switch(option) {
		case '+':{
			 int sum = a+b;
			 System.out.println(sum);
		}
		break;
		case '-':{
			int minus = a-b;
			System.out.println(minus);
		}
		break;
		default:{
			System.out.println("choose the correct opration");
		}
		
		}
		
		
	}
}
