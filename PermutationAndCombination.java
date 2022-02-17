import java.util.Scanner;

class Calculate{
	public int get(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result=result*i;
		}
		return result;
	}
	
}
public class PermutationAndCombination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter variable 1:");
		int var1=sc.nextInt();
		System.out.println("Enter variable 2:");
		int var2=sc.nextInt();
		Calculate ob=new Calculate();
		System.out.println("Permutation is : "+(ob.get(var1)/ob.get(var1-var2)));
		System.out.println("Combination is : "+(ob.get(var1)/(ob.get(var1-var2)*ob.get(var2))));
	}
}
