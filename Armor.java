/**
 *
 */
package homework1;

/**
 * @author Kotaro
 *
 */
public class Armor extends Player {

	private int defence;

	/**
	 * Constructor
	 *
	 * @param newName
	 * @param newWeight
	 * @param newDefence
	 */
	public Armor(String newName, int newWeight, int newDefence) {
		super(newName, newWeight);
		defence = newDefence;
	}

	/**
	 * getter
	 *
	 * @return defence
	 */
	public int getDefence() {
		return defence;
	}

	/**
	 * setter
	 *
	 * @param defence
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}

}
