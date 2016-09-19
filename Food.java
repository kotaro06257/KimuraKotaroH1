/**
 *
 */
package homework1;

/**
 * @author Kotaro
 *
 */
public class Food extends Player {

	private int nutrition, quantity;

	/**
	 * Constructor
	 *
	 * @param newName
	 * @param newWeight
	 */
	public Food(String newName, int newWeight, int newNutrition, int newQuantity) {
		super(newName, newWeight);
		nutrition = newNutrition;
		quantity = newQuantity;
	}

	/**
	 * getter for nutrition
	 *
	 * @return nutrition
	 */
	public int getNutrition() {
		return nutrition;
	}

	/**
	 * setter
	 *
	 * @param nutrition
	 */
	public void setNutrition(int nutrition) {
		this.nutrition = nutrition;
	}

	/**
	 * getter for quantity
	 *
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * setter
	 *
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
