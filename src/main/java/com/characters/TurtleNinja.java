package com.characters;

import com.app.Weapons.Weapon;
import com.interfaces.Ninja;
import com.parents.Turtle;

public class TurtleNinja extends Turtle implements Ninja {

	
	
	public TurtleNinja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TurtleNinja(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 20);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic - 5);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.NUNCHUCK);
	}

	public TurtleNinja makeTurtleNinja(){
		
		TurtleNinja ourTurtleNinja = new TurtleNinja(); 
		
		ourTurtleNinja.changeHealth();
		ourTurtleNinja.changeMagic();
		ourTurtleNinja.setName(null);
		ourTurtleNinja.setWeapon(null);
		
		return ourTurtleNinja;
	}
	
}
