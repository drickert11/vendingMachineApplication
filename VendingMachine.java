import java.util.*;
/**
 * 
 * @author rickert
 *
 *The class for the vending machine itself
 */
public class VendingMachine {
	private int register;
	

	ArrayList<Object> prod=new ArrayList<>();
	/**
	 * constructor
	 */
	public VendingMachine(){
		register=0;	
	Products Coke=new Products("Coke",1.5, 6);
	Products Chips=new Products("Chips",1, 5);
	Products Pepsi=new Products("Pepsi",2, 7);
	Products Cookie=new Products("Cookie",.75, 4);
	Products Water=new Products("Water",5, 3);
	
	prod.add(Coke);
	prod.add(Chips);
	prod.add(Pepsi);
	prod.add(Cookie);
	prod.add(Water);
	}
	
	/**
	 * 
	 * @param m adds to the current amount of money
	 */
	public void addMoney(double m){
		register+=m;
	}
	/**
	 * 
	 * @return register, returns the amount of money
	 */
	public double getMoney(){
		return register;
	}
	
	/**
	 * resets the register
	 */
	public void resetReg(){
		register=0;
	}
		/**
		 * 
		 * @param pos, to select a specific object
		 * @return to return that object
		 */
	public Products getProduct(int pos){
		return (Products) (prod.get(pos));	
	}
	
	
}
