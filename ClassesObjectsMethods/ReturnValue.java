/**
 * 
 */
package ClassesObjectsMethods;

/**
 * @author veerendra
 *
 */
public class ReturnValue {

	/**
	 * @param args
	 */
	public String name = "Tom";
	public void getName(){
		System.out.println("Name is :" +name);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnValue rv = new ReturnValue();
		
		rv.getName();
		

	}

}
