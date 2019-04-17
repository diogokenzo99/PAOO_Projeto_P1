public abstract class Character {
	
	public Character(WeaponBehavior w) {
		this.weapon = w;
	}
	
	
	WeaponBehavior weapon;
	double vida;
	
	public void fight(){
		weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public void atacar(Character c) {
		c.getHit();
	}
	
	public boolean getHit() {
		if(vida > 0.1) {
			this.vida-=0.1;
			return true;
		}
		System.out.println(this.getClass().getSimpleName()+" esta morto");
		return false;
	}
	
	
}
