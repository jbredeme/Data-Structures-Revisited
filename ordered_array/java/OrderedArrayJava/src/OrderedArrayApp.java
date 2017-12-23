/**
 * 
 * @author Jarid Bredemeier
 *
 */
public class OrderedArrayApp {
	public static void main(String[] args) {
		OrderedArray oarr = new OrderedArray(10);
		
		oarr.insert(2017001, 1.5, "MB1021");
		oarr.insert(2017002, 1.3, "MB1023");
		oarr.insert(2017003, 3.0, "MB1025");
		oarr.insert(2017004, 3.0, "MB1027");
		oarr.insert(2017005, 4.0, "MB1029");
		oarr.insert(2017006, 1.0, "MB1031");
		
		System.out.println(oarr);
	}
	
}
