package srpfacadelab;

public class Damage {
	private RpgPlayer player;

	public Damage(RpgPlayer player) {
		this.player = player;
	}

	public void takeDamage(int damage) {
        if (damage < player.getArmour()) {
            player.getGameEngine().playSpecialEffect("parry");
        }

        if (player.calculateInventoryWeight() < (player.getCarryingCapacity() * 0.5)) {
            damage = Math.round((float)(damage - (damage * .25)));
        }

        int damageToDeal = damage - player.getArmour();
        player.setHealth(player.getHealth() - damageToDeal);

        player.getGameEngine().playSpecialEffect("lots_of_gore");
    }
}