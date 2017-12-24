/**
 * 
 * @author Jarid Bredemeier
 *
 */
public class OrderedArray {
	private int numElements;		//=> element counter
	private int[] arr;				//=> working array
	
	
	/**
	 * Constructor creates a new array of specified size, and initializes 
	 * the number of elements to zero.
	 * 
	 * @param size is the size of the array.
	 */
	public OrderedArray(int size) {
		arr = new int[size];
		numElements = 0;
		
	}
	
	
	/**
	 * Inserts an element into an ordered array so that it remains ordered.
	 * 
	 * @param num the value to be inserted into the array.
	 */
	public void insert(int num) {
		int index;
		
		if(numElements == 0) {
			arr[numElements] = num;
			numElements += 1;
			System.out.println("Inserting " + num + " at index 0");
			
		} else {
			index = _hfind(num);
					
			if(arr[index] <= num) {
				index = find(arr[index])[1] + 1;
				
			} else {
				index = find(arr[index])[0];
				
			}

			for(int x = numElements - 1; x >= index; x--) {
				arr[x + 1] = arr[x];
				
			}
			System.out.println("Inserting " + num + " at index " + index);
			arr[index] = num;
			numElements += 1;
			
		}
				
	}
	
	
	/**
	 * Finds and copies over a target element that is to be removed from the array 
	 * by shifting elements down in position and decrementing the counter for the
	 * number of current elements in the array. Supports ordered arrays with 
	 * duplicate values allow, all elements of repeating values are removed. 
	 * 
	 * @param target the element to be removed from the array.
	 * @return 1 if deletion was successful and -1 otherwise.
	 */
	public int delete(int target) {
		int isDelete = -1;
		int step;
		int[] range = find(target);
		String out = new String();
		
		if(range[0] != -1) {
			step = range[1] - range[0] + 1;
			
			for(int i = range[0]; i < numElements; i++) {
				arr[i] = arr[i + step];
				
			}
			numElements -= step;
			isDelete = 1;
			
			for(int i = range[0]; i <= range[1]; i++) {
				out += i + ", ";
				
			}
			out = out.substring(0, out.length() - 2);
			System.out.println("Deleting...\n" + target + " at index(s) " + out);
			
		}
		return isDelete;
		
	}
	
	
	/**
	 * Helper method that uses binary search to locate an index in an ordered array
	 * for an insertion point for a new element.
	 * 
	 * @param target the value that is to be inserted.
	 * @return integer value that represents the index for proper insertion.
	 */
	private int _hfind(int target) {
		boolean isFound = false;
		int lowerBound = 0;
		int upperBound = numElements - 1;
		int middle = 0;
		
		while(lowerBound <= upperBound && !isFound) {	//=> base case
			middle = (lowerBound + upperBound) / 2;

			if(arr[middle] == target) {				
				isFound = true;							//=> exit loop return value for middle
				
			} else if(arr[middle] > target) {
				upperBound = middle - 1;
				
			} else {
				lowerBound = middle + 1;
				
			}
			
		}
		return middle;
		
	}
	
	
	/**
	 * find method locates a specific entry in an ordered array with duplicates allowed.
	 * 
	 * @param target is the value being searched for.
	 * @return the indexes of the first and last occurrence of target. If no target is found returns -1, -1.
	 */
	public int[] find(int target) {
		int lowerBound = 0;
		int upperBound = numElements - 1;
		int middle = 0;
		int[] range = {-1, -1};
		
		while(lowerBound <= upperBound) {		//=> base case
			middle = (lowerBound + upperBound) / 2;
			if(arr[middle] == target) {
				range[0] = middle;
				upperBound = middle - 1;		//=> keep checking left of middle
				
			} else if(arr[middle] > target) {
				upperBound = middle - 1;
				
			} else {
				lowerBound = middle + 1;
				
			}
			
		}
		
		if(range[0] != -1 ) {					//=> no value for leading index, implies no value for tail index
			lowerBound = 0;
			upperBound = numElements - 1;
			while(lowerBound <= upperBound) {
				middle = (lowerBound + upperBound) / 2;
	
				if(arr[middle] == target) {
					range[1] = middle;
					lowerBound = middle + 1;	//=> keep checking right of middle
					
				} else if(arr[middle] > target) {
					upperBound = middle - 1;
					
				} else {
					lowerBound = middle + 1;
					
				}
				
			}
			
		}
		return range;
		
	}

	
	/**
	 * Overrides the object class toString to print out the array.
	 */
	public String toString() {
		String output = new String("> [");
		for(int x = 0; x < numElements; x++) {
			if(x != (numElements - 1)) {
				output += arr[x] + ", ";
				
			} else {
				output += arr[x];
				
			}
			
		}
		output += "]\n";
		return output;
		
	}
	
}