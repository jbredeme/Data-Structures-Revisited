/**
 * 
 * @author Jarid Bredemeier
 *
 */
public abstract class Stack {
	private int size;
	
	public Stack() {
		size = 0;
		
	}
	
	public int size() {
		return size;
		
	}
	
	public abstract Node pop();
	public abstract boolean push();
 	
}
