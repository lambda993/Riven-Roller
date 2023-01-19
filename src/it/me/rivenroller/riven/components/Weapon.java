package it.me.rivenroller.riven.components;

public class Weapon {
	
	private String weaponName;
	
	private double weaponDisposition;
	
	private int weaponClass;
		
	public static final int RIFLE = 0;
		
	public static final int SHOTGUN = 1;
		
	public static final int PISTOL = 2;
		
	public static final int MELEE = 3;
		
	
	public Weapon(String name, int wclass, double disposition) {
		
		weaponName = name;
		
		weaponDisposition = disposition;
		
		weaponClass = wclass;
		
	}
	
	public String getName() {
		
		return weaponName;
		
	}
	
	public int getWClass() {
		
		return weaponClass;
		
	}
	
	public double getDisposition() {
		
		return weaponDisposition;
		
	}

}
