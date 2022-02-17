import java.util.Scanner;

class Result{
	public int print(int n){
		if(n==0 || n==1){
			return 1;
		}
		return print(n-1)+print(n-2);
	}
}
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of terms in a series:");
		int n=sc.nextInt();
		Result ob=new Result();
		for(int i=0;i<n;i++){
			System.out.print(ob.print(i)+" ");
		}
	}

}
