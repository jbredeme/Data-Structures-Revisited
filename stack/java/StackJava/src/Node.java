/**
 * 
 * @author Jarid Bredemeier
 *
 */
public class Node { 
	private int payload;
	private Node next;
	
	/**
	 * Constructor
	 * 
	 * @param next reference to the next node;
	 * @param prev reference to the previous node;
	 * @param payload integer value but can be replaced with other data;
	 */
	public Node(Node next, Node prev, int payload) {
		this.next = next;
		this.payload = payload;
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param payload integer value but can be replaced with other data;
	 */
	public Node(int payload) {
		this.payload = payload;
		this.next = null;
		
	}
	
	/**
	 * Gets the reference to next node.
	 * 
	 * @return reference to next node.
	 */
	public Node getNext() {
		return next;
		
	}
	
	/**
	 * Sets the reference variable next.
	 * 
	 * @param next Node reference.
	 */
	public void setNext(Node next) {
		this.next = next;
		
	}
	
	/**
	 * Gets the data value stored in payload.
	 * 
	 * @return payload value.
	 */
	public int getPayload() {
		return payload;
		
	}
	
	/**
	 * Sets the payload value.
	 * 
	 * @param payload data value stored in a node.
	 */
	public void setPayload(int payload) {
		this.payload = payload;
		
	}
	
	/**
	 * Returns a string of the value currently stored in payload.
	 */
	public String toString() {
		return Integer.toString(payload);
		
		
	}
	
}
