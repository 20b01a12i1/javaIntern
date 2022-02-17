import java.util.Scanner;
class Verify{
	public int check(int a[]){
		for(int i=0;i<a.length;i++){
			if(a[a[i]]!=i){
				return -1;
			}
		}
		return 1;
	}
}

public class MirrorInverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Verify ob=new Verify();
		if(ob.check(arr)==1){
			System.out.println("Yes,given array is inverse array");
		}
		else{
			System.out.println("No,given array is not an inverse array");
		}
	}
}
