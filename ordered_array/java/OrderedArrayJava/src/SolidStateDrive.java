/**
 * 
 * @author Jarid Bredemeier
 *
 */
public class SolidStateDrive  {
	private int serialNum;
	private double capacity;
	private String modelNum;
	
	public SolidStateDrive(int serialNum, double capacity, String modelNum) {
		this.serialNum = serialNum;
		this.capacity = capacity;
		this.modelNum = modelNum;
		
	}
	
	public int getSerialNum() {
		return serialNum;
		
	}
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
		
	}
	
	public double getCapacity() {
		return capacity;
		
	}
	
	public void setCapacity(double capacity) {
		this.capacity = capacity;
		
	}
	
	public String getModelNum() {
		return modelNum;
		
	}
	
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
		
	}
	
	public String toString() {
		return new String("Serial Number: " + serialNum + "\n" + "Capacity: " + capacity + "\n" + "Model: " + modelNum + "\n");
		
	}

}
