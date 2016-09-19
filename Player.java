/**
 *
 */
package homework1;

/**
 * @author Kotaro Kimura
 *
 */
public class Player {
	private String name;
	private int weight;


	public Player(String newName, int newWeight) {
		setName(newName);
		setWeight(newWeight);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String examine(){
		String description = "Name: " + name + ", Weight: " + weight + "kg";

		return description;

	}


}
