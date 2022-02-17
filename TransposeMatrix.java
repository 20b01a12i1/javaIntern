import java.util.Scanner;


public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[][]=new int[n][n];
		int arr2[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix before transpose:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr2[i][j]=arr[j][i];
			}
		}
		System.out.println("Matrix after transpose:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
