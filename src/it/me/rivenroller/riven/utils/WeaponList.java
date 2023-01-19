package it.me.rivenroller.riven.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import it.me.rivenroller.riven.components.Weapon;

public class WeaponList {
	
	private List<Weapon> rifles;
	
	private List<Weapon> shotguns;
	
	private List<Weapon> pistols;
	
	private List<Weapon> melee;
	
	private Random rng;
	
	public WeaponList(Random rng) {
		
		this.rng = rng;
		
		rifles = new ArrayList<>();
		
		shotguns = new ArrayList<>();
		
		pistols = new ArrayList<>();
		
		melee = new ArrayList<>();
		
		fillRifleList();
		
		fillShotgunList();
		
		fillPistolsList();
		
		fillMeleeList();
		
	}
	
	public WeaponList() {
		
		this(new Random());
		
	}
	
	public Weapon getRandomWeapon() {
		
		int wclass = rng.nextInt(4);
		
		switch(wclass) {
		
		case Weapon.RIFLE:
			
			return rifles.get(rng.nextInt(rifles.size()));
			
		case Weapon.SHOTGUN:
			
			return shotguns.get(rng.nextInt(shotguns.size()));
			
		case Weapon.PISTOL:
			
			return pistols.get(rng.nextInt(pistols.size()));
			
		case Weapon.MELEE:
	
			return melee.get(rng.nextInt(melee.size()));
		
		}
		
		return null;
		
	}

	private void fillMeleeList() {
		
		melee.add(new Weapon("Amphis", Weapon.MELEE, 1.5));
		melee.add(new Weapon("Ether Daggers", Weapon.MELEE, 1.49));
		melee.add(new Weapon("Cronus", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Dark Sword", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Dual Keres", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Dual Skana", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Heat Sword", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Plasma Sword", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Twin Krohkur", Weapon.MELEE, 1.48));
		melee.add(new Weapon("Jaw Sword", Weapon.MELEE, 1.47));
		melee.add(new Weapon("Kama", Weapon.MELEE, 1.47));
		melee.add(new Weapon("Pangolin Sword", Weapon.MELEE, 1.47));
		melee.add(new Weapon("Anku", Weapon.MELEE, 1.46));
		melee.add(new Weapon("Kogake", Weapon.MELEE, 1.46));
		melee.add(new Weapon("Ankyros", Weapon.MELEE, 1.45));
		melee.add(new Weapon("Dual Ether", Weapon.MELEE, 1.45));
		melee.add(new Weapon("Ether Reaper", Weapon.MELEE, 1.45));
		melee.add(new Weapon("Kestrel", Weapon.MELEE, 1.45));
		melee.add(new Weapon("Machete", Weapon.MELEE, 1.45));
		melee.add(new Weapon("Dual Heat Swords", Weapon.MELEE, 1.44));
		melee.add(new Weapon("Dual Zoren", Weapon.MELEE, 1.44));
		melee.add(new Weapon("Ether Sword", Weapon.MELEE, 1.44));
		melee.add(new Weapon("Gram", Weapon.MELEE, 1.44));
		melee.add(new Weapon("Halikar", Weapon.MELEE, 1.44));
		melee.add(new Weapon("Heat Dagger", Weapon.MELEE, 1.44));
		melee.add(new Weapon("Ceramic Dagger", Weapon.MELEE, 1.43));
		melee.add(new Weapon("Kronen", Weapon.MELEE, 1.43));
		melee.add(new Weapon("Mire", Weapon.MELEE, 1.43));
		melee.add(new Weapon("Nami Solo", Weapon.MELEE, 1.43));
		melee.add(new Weapon("Ninkondi", Weapon.MELEE, 1.41));
		melee.add(new Weapon("Dual Raza", Weapon.MELEE, 1.4));
		melee.add(new Weapon("Tekko", Weapon.MELEE, 1.4));
		melee.add(new Weapon("Furax", Weapon.MELEE, 1.38));
		melee.add(new Weapon("Ripkas", Weapon.MELEE, 1.38));
		melee.add(new Weapon("Serro", Weapon.MELEE, 1.38));
		melee.add(new Weapon("Tonbo", Weapon.MELEE, 1.38));
		melee.add(new Weapon("Cerata", Weapon.MELEE, 1.36));
		melee.add(new Weapon("Fang", Weapon.MELEE, 1.36));
		melee.add(new Weapon("Hate", Weapon.MELEE, 1.36));
		melee.add(new Weapon("Dragon Nikana", Weapon.MELEE, 1.35));
		melee.add(new Weapon("Gazal Machete", Weapon.MELEE, 1.35));
		melee.add(new Weapon("Shaku", Weapon.MELEE, 1.35));
		melee.add(new Weapon("Sibear", Weapon.MELEE, 1.35));
		melee.add(new Weapon("Lacera", Weapon.MELEE, 1.31));
		melee.add(new Weapon("Okina", Weapon.MELEE, 1.31));
		melee.add(new Weapon("Tipedo", Weapon.MELEE, 1.31));
		melee.add(new Weapon("Caustacyst", Weapon.MELEE, 1.3));
		melee.add(new Weapon("Scoliac", Weapon.MELEE, 1.3));
		melee.add(new Weapon("Bo", Weapon.MELEE, 1.29));
		melee.add(new Weapon("Cadus", Weapon.MELEE, 1.29));
		melee.add(new Weapon("Karyst", Weapon.MELEE, 1.29));
		melee.add(new Weapon("Prova", Weapon.MELEE, 1.29));
		melee.add(new Weapon("Reaper Prime", Weapon.MELEE, 1.29));
		melee.add(new Weapon("Deconstructor", Weapon.MELEE, 1.25));
		melee.add(new Weapon("Sheev", Weapon.MELEE, 1.25));
		melee.add(new Weapon("Kesheg", Weapon.MELEE, 1.24));
		melee.add(new Weapon("Sarpa", Weapon.MELEE, 1.24));
		melee.add(new Weapon("Glaive", Weapon.MELEE, 1.22));
		melee.add(new Weapon("Krohkur", Weapon.MELEE, 1.22));
		melee.add(new Weapon("Skana", Weapon.MELEE, 1.22));
		melee.add(new Weapon("Dark Split-Sword", Weapon.MELEE, 1.21));
		melee.add(new Weapon("Volnus", Weapon.MELEE, 1.2));
		melee.add(new Weapon("Broken Scepter", Weapon.MELEE, 1.19));
		melee.add(new Weapon("Twin Basolk", Weapon.MELEE, 1.18));
		melee.add(new Weapon("Nami Skyla", Weapon.MELEE, 1.175));
		melee.add(new Weapon("Redeemer", Weapon.MELEE, 1.17));
		melee.add(new Weapon("Dual Ichor", Weapon.MELEE, 1.16));
		melee.add(new Weapon("Dakra Prime", Weapon.MELEE, 1.15));
		melee.add(new Weapon("Dex Dakra", Weapon.MELEE, 1.15));
		melee.add(new Weapon("Orvius", Weapon.MELEE, 1.15));
		melee.add(new Weapon("Destreza", Weapon.MELEE, 1.14));
		melee.add(new Weapon("Obex", Weapon.MELEE, 1.1));
		melee.add(new Weapon("Magistar", Weapon.MELEE, 1.09));
		melee.add(new Weapon("Arca Titron", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Balla", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Boltace", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Cassowar", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Cyath", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Dehtat", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Dual Cleavers", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Endura", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Falcor", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Guandao", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Gunsen", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Kronsh", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Mewan", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Ohma", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Ooltha", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Paracesis", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Pupacyst", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Plague Keewar", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Plague Kripath", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Scindo", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Sigma & Octantis", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Silva & Aegis", Weapon.MELEE, 1.0));
		melee.add(new Weapon("Fragor", Weapon.MELEE, 0.96));
		melee.add(new Weapon("Mios", Weapon.MELEE, 0.95));
		melee.add(new Weapon("Heliocor", Weapon.MELEE, 0.94));
		melee.add(new Weapon("Ack & Brunt", Weapon.MELEE, 0.9));
		melee.add(new Weapon("Sydon", Weapon.MELEE, 0.84));
		melee.add(new Weapon("Dual Kamas", Weapon.MELEE, 0.81));
		melee.add(new Weapon("Jat Kusar", Weapon.MELEE, 0.81));
		melee.add(new Weapon("Broken War", Weapon.MELEE, 0.79));
		melee.add(new Weapon("Jat Kittag", Weapon.MELEE, 0.75));
		melee.add(new Weapon("Atterax", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Dark Dagger", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Galatine", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Hirudo", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Lecta", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Lesion", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Nikana", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Orthos", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Venka", Weapon.MELEE, 0.5));
		melee.add(new Weapon("War", Weapon.MELEE, 0.5));
		melee.add(new Weapon("Zenistar", Weapon.MELEE, 0.5));
		
	}

	private void fillPistolsList() {
		
		pistols.add(new Weapon("Kraken", Weapon.PISTOL, 1.53));
		pistols.add(new Weapon("Magnus", Weapon.PISTOL, 1.53));
		pistols.add(new Weapon("Vasto", Weapon.PISTOL, 1.53));
		pistols.add(new Weapon("Viper", Weapon.PISTOL, 1.53));
		pistols.add(new Weapon("Aklato", Weapon.PISTOL, 1.52));
		pistols.add(new Weapon("Akzani", Weapon.PISTOL, 1.52));
		pistols.add(new Weapon("Cestra", Weapon.PISTOL, 1.52));
		pistols.add(new Weapon("Bolto", Weapon.PISTOL, 1.51));
		pistols.add(new Weapon("Kunai", Weapon.PISTOL, 1.51));
		pistols.add(new Weapon("Lato", Weapon.PISTOL, 1.51));
		pistols.add(new Weapon("Tysis", Weapon.PISTOL, 1.51));
		pistols.add(new Weapon("Seer", Weapon.PISTOL, 1.5));
		pistols.add(new Weapon("Sicarus", Weapon.PISTOL, 1.5));
		pistols.add(new Weapon("Twin Gremlins", Weapon.PISTOL, 1.5));
		pistols.add(new Weapon("Spectra", Weapon.PISTOL, 1.49));
		pistols.add(new Weapon("Stug", Weapon.PISTOL, 1.49));
		pistols.add(new Weapon("Burst Laser", Weapon.PISTOL, 1.45));
		pistols.add(new Weapon("Embolist", Weapon.PISTOL, 1.45));
		pistols.add(new Weapon("Nukor", Weapon.PISTOL, 1.45));
		pistols.add(new Weapon("Talons", Weapon.PISTOL, 1.44));
		pistols.add(new Weapon("Akjagara", Weapon.PISTOL, 1.43));
		pistols.add(new Weapon("Castanas", Weapon.PISTOL, 1.42));
		pistols.add(new Weapon("Twin Vipers", Weapon.PISTOL, 1.41));
		pistols.add(new Weapon("Angstrum", Weapon.PISTOL, 1.4));
		pistols.add(new Weapon("Afuris", Weapon.PISTOL, 1.39));
		pistols.add(new Weapon("Dex Furis", Weapon.PISTOL, 1.39));
		pistols.add(new Weapon("Azima", Weapon.PISTOL, 1.35));
		pistols.add(new Weapon("Dual Cestra", Weapon.PISTOL, 1.35));
		pistols.add(new Weapon("Furis", Weapon.PISTOL, 1.35));
		pistols.add(new Weapon("Acrid", Weapon.PISTOL, 1.33));
		pistols.add(new Weapon("Akmagnus", Weapon.PISTOL, 1.28));
		pistols.add(new Weapon("Aksomati", Weapon.PISTOL, 1.26));
		pistols.add(new Weapon("Stubba", Weapon.PISTOL, 1.25));
		pistols.add(new Weapon("Akvasto", Weapon.PISTOL, 1.24));
		pistols.add(new Weapon("Despair", Weapon.PISTOL, 1.24));
		pistols.add(new Weapon("Akbronco", Weapon.PISTOL, 1.2));
		pistols.add(new Weapon("Bronco", Weapon.PISTOL, 1.2));
		pistols.add(new Weapon("Fusilai", Weapon.PISTOL, 1.2));
		pistols.add(new Weapon("Kohmak", Weapon.PISTOL, 1.2));
		pistols.add(new Weapon("Pyrana", Weapon.PISTOL, 1.2));
		pistols.add(new Weapon("Dual Toxocyst", Weapon.PISTOL, 1.19));
		pistols.add(new Weapon("Kulstar", Weapon.PISTOL, 1.1));
		pistols.add(new Weapon("Twin Kohmak", Weapon.PISTOL, 1.1));
		pistols.add(new Weapon("Aklex", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Arca Scisco", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Cycron", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Detron", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Hystrix", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Knell", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Pandero", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Twin Rogga", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Zakti", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Zylok", Weapon.PISTOL, 1.0));
		pistols.add(new Weapon("Atomos", Weapon.PISTOL, 0.87));
		pistols.add(new Weapon("Akbolto", Weapon.PISTOL, 0.85));
		pistols.add(new Weapon("Ballistica", Weapon.PISTOL, 0.85));
		pistols.add(new Weapon("Pox", Weapon.PISTOL, 0.83));
		pistols.add(new Weapon("Twin Grakatas", Weapon.PISTOL, 0.76));
		pistols.add(new Weapon("Brakk", Weapon.PISTOL, 0.75));
		pistols.add(new Weapon("Euphona Prime", Weapon.PISTOL, 0.75));
		pistols.add(new Weapon("Hikou", Weapon.PISTOL, 0.69));
		pistols.add(new Weapon("Spira", Weapon.PISTOL, 0.66));
		pistols.add(new Weapon("Gammacor", Weapon.PISTOL, 0.53));
		pistols.add(new Weapon("Staticor", Weapon.PISTOL, 0.53));
		pistols.add(new Weapon("Akstiletto", Weapon.PISTOL, 0.5));
		pistols.add(new Weapon("Lex", Weapon.PISTOL, 0.5));
		pistols.add(new Weapon("Marelok", Weapon.PISTOL, 0.5));
		pistols.add(new Weapon("Sonicor", Weapon.PISTOL, 0.5));
		
	}

	private void fillShotgunList() {
		
		shotguns.add(new Weapon("Drakgoon", Weapon.SHOTGUN, 1.48));
		shotguns.add(new Weapon("Convectrix", Weapon.SHOTGUN, 1.46));
		shotguns.add(new Weapon("Phage", Weapon.SHOTGUN, 1.46));
		shotguns.add(new Weapon("Strun", Weapon.SHOTGUN, 1.42));
		shotguns.add(new Weapon("Kohm", Weapon.SHOTGUN, 1.4));
		shotguns.add(new Weapon("Boar", Weapon.SHOTGUN, 1.34));
		shotguns.add(new Weapon("Sobek", Weapon.SHOTGUN, 1.33));
		shotguns.add(new Weapon("Astilla", Weapon.SHOTGUN, 1.2));
		shotguns.add(new Weapon("Corinth", Weapon.SHOTGUN, 1.0));
		shotguns.add(new Weapon("Phantasma", Weapon.SHOTGUN, 1.0));
		shotguns.add(new Weapon("Sweeper", Weapon.SHOTGUN, 1.0));
		shotguns.add(new Weapon("Arca Plasmor", Weapon.SHOTGUN, 0.9));
		shotguns.add(new Weapon("Hek", Weapon.SHOTGUN, 0.55));
		shotguns.add(new Weapon("Tigris", Weapon.SHOTGUN, 0.5));
		
	}

	private void fillRifleList() {
		
		rifles.add(new Weapon("Miter", Weapon.RIFLE, 1.6));
		rifles.add(new Weapon("Buzlok", Weapon.RIFLE, 1.55));
		rifles.add(new Weapon("Flux Rifle", Weapon.RIFLE, 1.55));
		rifles.add(new Weapon("Harpak", Weapon.RIFLE, 1.55));
		rifles.add(new Weapon("Mutualist Quanta", Weapon.RIFLE, 1.55));
		rifles.add(new Weapon("Panthera", Weapon.RIFLE, 1.55));
		rifles.add(new Weapon("Tetra", Weapon.RIFLE, 1.5));
		rifles.add(new Weapon("Tiberon", Weapon.RIFLE, 1.5));
		rifles.add(new Weapon("Deth Machine Rifle", Weapon.RIFLE, 1.455));
		rifles.add(new Weapon("Vulkar", Weapon.RIFLE, 1.45));
		rifles.add(new Weapon("Hind", Weapon.RIFLE, 1.42));
		rifles.add(new Weapon("Attica", Weapon.RIFLE, 1.415));
		rifles.add(new Weapon("Glaxion", Weapon.RIFLE, 1.35));
		rifles.add(new Weapon("Paracyst", Weapon.RIFLE, 1.315));
		rifles.add(new Weapon("Stinger", Weapon.RIFLE, 1.315));
		rifles.add(new Weapon("Synapse", Weapon.RIFLE, 1.315));
		rifles.add(new Weapon("Karak", Weapon.RIFLE, 1.28));
		rifles.add(new Weapon("Dera", Weapon.RIFLE, 1.245));
		rifles.add(new Weapon("Grinlok", Weapon.RIFLE, 1.245));
		rifles.add(new Weapon("Ogris", Weapon.RIFLE, 1.245));
		rifles.add(new Weapon("Vulklok", Weapon.RIFLE, 1.245));
		rifles.add(new Weapon("Daikyu", Weapon.RIFLE, 1.21));
		rifles.add(new Weapon("Laser Rifle", Weapon.RIFLE, 1.21));
		rifles.add(new Weapon("Mutualist Cernos", Weapon.RIFLE, 1.21));
		rifles.add(new Weapon("Opticor", Weapon.RIFLE, 1.21));
		rifles.add(new Weapon("Quartakk", Weapon.RIFLE, 1.2));
		rifles.add(new Weapon("Burston", Weapon.RIFLE, 1.175));
		rifles.add(new Weapon("Penta", Weapon.RIFLE, 1.175));
		rifles.add(new Weapon("Gorgon", Weapon.RIFLE, 1.175));
		rifles.add(new Weapon("Stradavar", Weapon.RIFLE, 1.175));
		rifles.add(new Weapon("Snipertron", Weapon.RIFLE, 1.165));
		rifles.add(new Weapon("Supra", Weapon.RIFLE, 1.14));
		rifles.add(new Weapon("Torid", Weapon.RIFLE, 1.14));
		rifles.add(new Weapon("Grakata", Weapon.RIFLE, 1.105));
		rifles.add(new Weapon("Lanka", Weapon.RIFLE, 1.105));
		rifles.add(new Weapon("Rubico", Weapon.RIFLE, 1.105));
		rifles.add(new Weapon("Zhuge", Weapon.RIFLE, 1.105));
		rifles.add(new Weapon("Baza", Weapon.RIFLE, 1.1));
		rifles.add(new Weapon("Latron", Weapon.RIFLE, 1.07));
		rifles.add(new Weapon("Argonak", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Ferrox", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Hema", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Javlok", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Scourge", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Tenora", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Vectis", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Veldt", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Zarr", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Zenith", Weapon.RIFLE, 1.0));
		rifles.add(new Weapon("Amprex", Weapon.RIFLE, 0.965));
		rifles.add(new Weapon("Braton", Weapon.RIFLE, 0.965));
		rifles.add(new Weapon("Paris", Weapon.RIFLE, 0.965));
		rifles.add(new Weapon("Lenz", Weapon.RIFLE, 0.9));
		rifles.add(new Weapon("Dex Sybaris", Weapon.RIFLE, 0.895));
		rifles.add(new Weapon("Quanta", Weapon.RIFLE, 0.895));
		rifles.add(new Weapon("Sybaris", Weapon.RIFLE, 0.895));
		rifles.add(new Weapon("Cernos", Weapon.RIFLE, 0.86));
		rifles.add(new Weapon("Dread", Weapon.RIFLE, 0.825));
		rifles.add(new Weapon("Boltor", Weapon.RIFLE, 0.79));
		rifles.add(new Weapon("Ignis", Weapon.RIFLE, 0.79));
		rifles.add(new Weapon("Tonkor", Weapon.RIFLE, 0.55));
		rifles.add(new Weapon("Simulor", Weapon.RIFLE, 0.5));
		rifles.add(new Weapon("Soma", Weapon.RIFLE, 0.5));
		
	}
	
	public List<Weapon> getRifles() {
		
		return rifles;
		
	}
	
	public List<Weapon> getShotguns() {
		
		return shotguns;
		
	}
	
	public List<Weapon> getPistols() {
		
		return pistols;
		
	}
	
	public List<Weapon> getMelee() {
		
		return melee;
		
	}
	
	public List<Weapon> getFullList() {
		
		List<Weapon> full = new ArrayList<>();
		
		for(Weapon w : rifles) {
			
			full.add(w);
			
		}
		
		for(Weapon w : shotguns) {
			
			full.add(w);
			
		}

		for(Weapon w : pistols) {
	
			full.add(w);
	
		}

		for(Weapon w : melee) {
	
			full.add(w);
	
		}
		
		return full;
		
	}

}
