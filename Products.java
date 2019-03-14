/**
 * 
 * @author rickert
 *Controls whats in the machine
 */
public class Products {
	private String name;
	private double cost;
	private int quantity;
	
	/**
	 * 
	 * @param name
	 * @param cost
	 * @param quan, quantity of object
	 * creates the products
	 */
	public Products(String name, double cost, int quan){
		this.name=name;
		this.cost= cost;
		quantity=quan;
	}
	//=========================
	
	/**
	 * 
	 * @return name
	 * returns product name
	 */
	
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @return cost
	 * returns product cost
	 */
	public double getCost(){
		return cost;
	}
	/**
	 * 
	 * @return quantity
	 * returns quantity
	 */
	public int getQuantity(){
		return quantity;
	}
	//==========================
	/**
	 * 
	 * @param q
	 * resets quantity
	 */
	public void setQuantity(int q){
		quantity=q;
	}
	
	/**
	 * subtracts from quantity
	 */
	public void reduceQuantity(){
		quantity--;
	}
	
	
}
