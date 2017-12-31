/**
 * 
 * @author Jarid Bredemeier
 *
 */
public class DoublyLinkedList {
	private int count;
	private Node head;
	private Node tail;
	
	/**
	 * Constructor
	 */
	public DoublyLinkedList() {
		head = null;
		tail = null;
		count = 0;
		
	}
	
	/**
	 * TODO
	 * 
	 * @param payload
	 */
	public void insertHead(int payload) {
		Node inserted = new Node(payload);
		
		if(count == 0) {
			tail = inserted;
			
		} else {
			inserted.setNext(head);
			head.setPrev(inserted);
			
		}
		head = inserted;
		count += 1;
		
	}
	
	/**
	 * TODO
	 * 
	 * @param payload
	 */
	public void insertTail(int payload) {
		Node inserted = new Node(payload);
		
		if(count == 0) {
			head = inserted;
			
		} else {
			inserted.setPrev(tail);
			tail.setNext(inserted);
			
		}
		tail = inserted;
		count += 1;
		
	}	
	
	/**
	 * TODO
	 * 
	 * @param key
	 * @param payload
	 */
	public void insertAfter(int key, int payload) {
		Node curr = find(key);
		Node temp = new Node(payload);
		
		if(count == 0) {						//=> empty list
			head = new Node(payload);
			tail = head;
			
		} else {						
			if(curr == tail || curr == null) {	//=> key is tail, or not found
				tail.setNext(temp);
				temp.setPrev(tail);
				tail = temp;
				
			} else {							//=> insert new node behind key
				temp.setNext(curr.getNext());
				curr.getNext().setPrev(temp);
				temp.setPrev(curr);
				curr.setNext(temp);
				
			}
			
		}
		count += 1;
		
	}

	/**
	 * TODO
	 * 
	 * @param key
	 * @param payload
	 */
	public void insertBefore(int key, int payload) {
		Node curr = find(key);
		Node temp = new Node(payload);
		
		if(count == 0) {						//=> empty list
			head = new Node(payload);
			tail = head;
			
		} else {						
			if(curr == head || curr == null) {	//=> key is head, or not found
				temp.setNext(head);
				head.setPrev(temp);
				head = temp;
				
			} else {							//=> insert new node behind key
				curr.getPrev().setNext(temp);
				temp.setPrev(curr.getPrev());
				temp.setNext(curr);
				curr.setPrev(temp);
				
			}
			
		}
		count += 1;
		
	}
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public Node deleteHead() {
		Node dNode = null;
		
		if(count != 0) {		
			if(head == tail) {
				dNode = head;
				head = null;
				tail = null;
				
			} else {
				dNode = head;
				head = dNode.getNext();
				head.setPrev(null);
				dNode.setNext(null);
				
			}
			count -= 1;
			
		}
		return dNode;
		
	}
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public Node deleteTail() {
		Node dNode = null;
		
		if(count != 0) {		
			if(tail == head) {
				dNode = head;
				head = null;
				tail = null;
				
			} else {
				dNode = tail;
				tail = dNode.getPrev();
				tail.setNext(null);
				dNode.setPrev(null);
				
			}
			count -= 1;
			
		}
		return dNode;
		
	}

	/**
	 * TODO
	 * 
	 * @param key
	 * @return
	 */
	public Node deleteKey(int key) {
		Node curr = find(key);
		
		if(count != 0 && curr != null) {
			if(curr == head && curr == tail) {
				head = null;
				tail = null;
				
			} else if(curr == head) {
				head = curr.getNext();
				head.setPrev(null);
				curr.setNext(null);
				
			} else if(curr == tail) {
				tail = curr.getPrev();
				tail.setNext(null);
				curr.setPrev(null);
				
			} else {
				curr.getPrev().setNext(curr.getNext());
				curr.getNext().setPrev(curr.getPrev());
				curr.setPrev(null);
				curr.setNext(null);
				
			}
			count -= 1;
			
		}
		return curr;
		
	}
	
	/**
	 * TODO
	 * 
	 * @param payload
	 * @return
	 */
	public Node find(int payload) {
		Node curr = head;
		boolean isFound = false;
		
		if(count != 0) {
			while(curr != null && !isFound) {
				if(curr.getPayload() != payload) {
					curr = curr.getNext();
					
				} else {
					isFound = true;
					
				}
				
			}
			
		}
		return curr;
		
	}
	
	/**
	 * TODO
	 */
	public String toString() {
		Node curr = head;
		String output = new String();
		
		while(curr != null) {
			output += curr.toString();
			curr = curr.getNext();
			
		}
		return output;
		
	}
	
}
