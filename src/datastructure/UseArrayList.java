package datastructure;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	     ArrayList<String> wrestling = new ArrayList<String>();
	     wrestling.add("Randy Orton");
	     wrestling.add("John Cena");
	     wrestling.add("The Rock");
	     wrestling.add("Triple H");
	     wrestling.add("Kane");
	     wrestling.add("Batista");
	     System.out.println("Before Removing:");
	     System.out.println("wrestling list size: " + wrestling.size());
	     for (String a : wrestling) {
			 System.out.println(a);
		 }
	     Iterator it = wrestling.listIterator();
	     System.out.println("wrestling list size after removing: " + wrestling.size());
	     while (it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}
