public class Character {
	
	private int health;
	private int dmg;
	private int def;
	private int[] inventory;
	private int curency;
	
	
	public Character(int choice) {
		switch(choice){
			case 1:
				this.health = 20;
				break;
			case 2:
				this.health = 15;
				break;
			case 3:
				this.health = 10;
				break;
		}
	}
	
	public int health() {
		return this.health;
	}
	
}