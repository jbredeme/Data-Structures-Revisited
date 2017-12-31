/**
 * 
 * @author Jarid Bredemeier
 *
 */
public class DoublyLinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertHead(500);
		list.insertTail(600);
		list.insertHead(400);
		list.insertTail(700);
		list.insertHead(200);
		list.insertTail(800);		
		
		list.insertAfter(200, 300);

		System.out.println(list);
		list.deleteHead();
		
		System.out.println(list);
		list.deleteTail();		
		
		System.out.println(list);
		list.deleteKey(600);
		
		System.out.println(list);
		list.insertBefore(300, 200);
		
		System.out.println(list);
		
	}
}
