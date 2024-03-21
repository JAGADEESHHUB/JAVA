package Queue;
import java.util.*;
import java.util.Queue;

public class Q_ueue {

	public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        int g=q.peek();
        System.out.println(g);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        
        
		
	
	
	}

}
