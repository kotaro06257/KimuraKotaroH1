/**
 *
 */
package homework1;

/**
 * @author Kotaro
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player p1 = new Player("Sony", 77);
		Item p2 = new Item("Candy", 1);
		Weapon p3 = new Weapon("Phantom Blade", 6, 777);
		Armor p4 = new Armor("Phantom Shield", 10, 555);
		Food p5 = new Food("Sushi", 2, 100, 999);
		// Player
		System.out.println("Plyaer test.....");
		System.out.println(p1.examine());
		System.out.println("");

		// Item
		System.out.println("Item test.....");
		System.out.println(p2.examine());
		System.out.println("");

		// Weapon
		System.out.println("Weapon test.....");
		System.out.println(p3.examine());
		System.out.println("Damage is " + p3.getDamage());
		System.out.println("");

		// Armor
		System.out.println("Armor test.....");
		System.out.println(p4.examine());
		System.out.println("Defence is " + p4.getDefence());
		System.out.println("");

		// Food
		System.out.println("Food test.....");
		System.out.println(p5.examine());
		System.out.println("Nutrition is " + p5.getNutrition() + ", Quantity is " + p5.getQuantity());
		System.out.println("setQuantity test... Let quantity = 50");
		p5.setQuantity(50);
		System.out.println("New Quantity is " + p5.getQuantity());

	}

}
