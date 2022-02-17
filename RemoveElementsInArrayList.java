import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveElementsInArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList l=new ArrayList();
		l.add("asdf");
		l.add("ghj");
		l.add("abcd");
		l.add("efgh");
		l.add("xyz");
		l.remove("asdf");
		l.remove("efgh");
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
