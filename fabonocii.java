import java.util.Scanner;

public class fabonocii {
    
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many terms you want to get ");
	int num=sc.nextInt();
	System.out.print("Fibonacci Series : ");
	for(int i = 0; i < num ;i++){
			System.out.print(fibonacciRecursion(i) +" ");
			
		}
	}
}