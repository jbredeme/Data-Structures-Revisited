/**
 * 
 * @author Jarid Bredemeier
 *
 */

public class OrderedArrayApp {
	public static void main(String[] args) {
		OrderedArray arr = new OrderedArray(15);
		int num;
		int[] temp;
		String output;
		
		arr.insert(17);
		System.out.println(arr);
		
		arr.insert(2);
		System.out.println(arr);
		
		arr.insert(12);
		System.out.println(arr);
		
		arr.insert(15);
		System.out.println(arr);
		
		arr.insert(12);
		System.out.println(arr);
		
		arr.insert(7);
		System.out.println(arr);
		
		arr.insert(9);
		System.out.println(arr);
		
		arr.insert(12);
		System.out.println(arr);
		
		arr.delete(2);
		System.out.println(arr);
		
		arr.delete(12);
		System.out.println(arr);
		
		arr.insert(9);
		System.out.println(arr);
		
		arr.insert(14);
		System.out.println(arr);
		
		arr.insert(16);
		System.out.println(arr);
		
		num = 9;
		temp = arr.find(num);
		
		System.out.printf("Finding %d...\n", num);
		if(temp[0] == -1) {
			System.out.printf("%d is not in the array.\n\n", num);
			
		} else {
			output = new String();
			for(int i = temp[0]; i <= temp[1]; i++) {
				output += i + ", ";
			}
			System.out.printf("%d is located at index(s) %s\n\n", num, output.substring(0, output.length() - 2));
			
		}
		
		num = 3;
		temp = arr.find(num);
		
		System.out.printf("Finding %d...\n", num);
		if(temp[0] == -1) {
			System.out.printf("%d is not in the array.\n\n", num);
			
		} else {
			output = new String();
			for(int i = temp[0]; i <= temp[1]; i++) {
				output += i + ", ";
			}
			System.out.printf("%d is located at index(s) %s\n\n", num, output.substring(0, output.length() - 2));
			
		}		
		
		num = 17;
		temp = arr.find(num);
		
		System.out.printf("Finding %d...\n", num);
		if(temp[0] == -1) {
			System.out.printf("%d is not in the array.\n\n", num);
			
		} else {
			output = new String();
			for(int i = temp[0]; i <= temp[1]; i++) {
				output += i + ", ";
			}
			System.out.printf("%d is located at index(s) %s\n\n", num, output.substring(0, output.length() - 2));
			
		}			
		
		
		
		
		
		
		

		
		
	}
	
}
