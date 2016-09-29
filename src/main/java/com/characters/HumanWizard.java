package com.characters;

import com.app.Weapons.Weapon;
import com.interfaces.Wizard;
import com.parents.Human;

public class HumanWizard extends Human implements Wizard {

	
	
	public HumanWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HumanWizard(int health, int magic, String name, Weapon weapon) {
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
		super.setWeapon(Weapon.WAND);
	}

}
