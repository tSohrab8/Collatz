import java.util.*;

public class Collatz {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		
		System.out.println(num);
		
		collatz(num);
		
	}
	
	static void collatz(int num){
		
		int newNum;
		
		if ((num % 2) == 0){
			newNum = num / 2;
		}
		else{
			newNum = (num*3) + 1;
		}
		
		System.out.println(newNum);
		
		if (newNum == 1){
			return;
		}
		
		collatz(newNum);
		
		
	}

}
