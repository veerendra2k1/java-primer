/*A Java program can contain any number of classes. Following Java program comprises of two classes: Computer and Laptop.
Both classes have their own constructors and a method.
In the main method, we create objects of two classes and call their methods.*/



package Overview;

/**
 * @author veerendra
 *
 */
class Computer {
	  Computer() {
	    System.out.println("Constructor of Computer class.");
	  }
	 
	  void computer_method() {
	    System.out.println("Power gone! Shut down your PC soon...");
	  }
	 
	  public static void main(String[] args) {
	    Computer my = new Computer();
	    Laptop your = new Laptop();
	 
	    my.computer_method();
	    your.laptop_method();
	  }
	}
	 
	class Laptop {
	  Laptop() {
	    System.out.println("Constructor of Laptop class.");
	  }
	 
	  void laptop_method() {
	    System.out.println("99% Battery available.");
	  }
	}
