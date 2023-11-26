import java.util.LinkedList;

public class Lkdlst {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		
		l.addFirst(1);
		l.addLast(10);
		l.push(7);
		l.push(8);
		l.pop();
		l.offer(3);
		System.out.println(l);
		System.out.println(l.peek());
		
	         l.poll();
	         System.out.println(l);

	}
}
