package com.characters;

import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior {

	
	
	public SmurfWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmurfWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.MACE);
	}


}
