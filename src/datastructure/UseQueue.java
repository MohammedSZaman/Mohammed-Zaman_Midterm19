package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
         Queue<String> tv = new LinkedList<String>();
         tv.add("You");
         tv.add("One Tree Hill");
         tv.add("Suits");
         tv.add("Daredevil");
         tv.add("Mad Men");
         System.out.println("Length of Queue: " + tv.size());
         System.out.println("Head of the Queue: " + tv.peek());
         System.out.println("Before removal: ");
         for (String a:tv){
			System.out.println(a);
		}
        tv.remove();
        tv.remove();
        System.out.println("Size of Queue: " + tv.size());
        System.out.println("Head of the Queue: " + tv.element());
        Iterator it = tv.iterator();
        while(it.hasNext()) {
			System.out.println(it.next());
		}
		    }
}


