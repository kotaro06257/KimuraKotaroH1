/**
 *
 */
package homework1;

/**
 * @author Kotaro
 *
 */
public class Weapon extends Player {

	private int damage;

	/**
	 * Constructor
	 *
	 * @param newName
	 * @param newWeight
	 * @param newDamage
	 */
	public Weapon(String newName, int newWeight, int newDamage) {
		super(newName, newWeight);
		damage = newDamage;
	}

	/**
	 * getter
	 *
	 * @return damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * setter
	 *
	 * @param damage
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

}
