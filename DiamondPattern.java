import java.util.Scanner;
class PrintPattern{
	public void get(int n){
		int k=n-1;
		for(int i=0;i<n;i++){
			for(int j=0;j<k;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
			k--;
		}
		k=0;
		for(int i=n;i>0;i--){
			for(int j=0;j<k;j++){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
			k++;
		}
	}
}

public class DiamondPattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of stars:");
		int n=sc.nextInt();
		PrintPattern ob=new PrintPattern();
		ob.get(n);
	}

}
