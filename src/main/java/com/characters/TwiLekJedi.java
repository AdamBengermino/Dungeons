package com.characters;

import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.TwiLek;

public class TwiLekJedi extends TwiLek implements Jedi {

	
	
	public TwiLekJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwiLekJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}
 
	public TwiLekJedi makeTwiLekJedi(){
		
		TwiLekJedi ourTwiLekJedi = new TwiLekJedi(); 
		
		ourTwiLekJedi.changeHealth();
		ourTwiLekJedi.changeMagic();
		ourTwiLekJedi.setName(null);
		ourTwiLekJedi.setWeapon(null);
		
		return ourTwiLekJedi;
	}
}
