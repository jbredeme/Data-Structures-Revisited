/**
 * 
 * @author Jarid Bredemeier
 *
 */

import java.util.*;

public class StackApp {

	public static void main(String[] args) {
		int max = 1024;
		Random ran = new Random();
		
		// Collections employment
		LinkedList<Node> stack = new LinkedList<Node>();
		
		// Push elements onto the stack
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));
		stack.push(new Node(ran.nextInt(max)));

		System.out.println(displayStack(stack));
		
		// Remove elements on the stack
		for(int i = 0; i < 4; i++) {
			System.out.println("Removing: " + stack.pop());
			
		}
		
		System.out.println(displayStack(stack));
		
	}
	
	public static String displayStack(LinkedList<Node> stack) {
		String out = new String();
		
		// Display elements currently on the stack
		for(Node x : stack) {
			out += x.getPayload() + " ";
			
		}
		
		return out;
	}
	
	
	
	
}
