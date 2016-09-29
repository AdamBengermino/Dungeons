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
		super.setHealth(health + 0);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 200);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.WAND);
	}
	
	public HumanWizard makeHumanWizard(){
		
		HumanWizard ourHumanWizard = new HumanWizard(); 
		
		ourHumanWizard.changeHealth();
		ourHumanWizard.changeMagic();
		ourHumanWizard.setName(null);
		ourHumanWizard.setWeapon(null);
		
		return ourHumanWizard; 
		
	}
}
