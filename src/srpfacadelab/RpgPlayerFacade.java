package srpfacadelab;

public class RpgPlayerFacade {

	private Inventory inventory;
	private Damage damage;

	public RpgPlayerFacade(Inventory inventory, Damage damage) {
		this.inventory = inventory;
		this.damage = damage;
	}

	public void takeDamage(int amount) {
		damage.takeDamage(amount);
	}

	public void useItem(Item item) {
		inventory.useItem(item);
    }

    public boolean pickUpItem(Item item) {
    	return inventory.pickUpItem(item);
    }

}