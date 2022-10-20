package basic;

public class Demostrate_Static_Variable_Method_Block {
        
	    static int a=10; //variable
	    static void display () {
	    	System.out.println("static method"); //static method
	    }
	    static {
	    	System.out.println("static block"); //static block
	    }
	public static void main(String[] args) {
		  System.out.println("VariableExample: "+a);
		     Demostrate_Static_Variable_Method_Block.display();

	}

}
