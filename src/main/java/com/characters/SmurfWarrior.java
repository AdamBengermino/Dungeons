package com.characters;

import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior {

	
	
	public SmurfWarrior() {
		super();
	}

	public SmurfWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 75);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 0);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.MACE);
	}
	
	public SmurfWarrior makeSmurfWarrior(){
		
		SmurfWarrior ourSmurfWarrior = new SmurfWarrior(); 
		
		ourSmurfWarrior.changeHealth();
		ourSmurfWarrior.changeMagic();
		ourSmurfWarrior.setName(null);
		ourSmurfWarrior.setWeapon(null);
		
		return ourSmurfWarrior;
	}
}
