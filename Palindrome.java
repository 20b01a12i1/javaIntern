import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=sc.next();
		String result="";
		for(int i=a.length()-1;i>=0;i--){
			result=result+a.charAt(i);
		}
		if(a.equals(result)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}

}
