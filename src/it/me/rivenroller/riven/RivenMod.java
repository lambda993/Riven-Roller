package it.me.rivenroller.riven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

import it.me.rivenroller.riven.components.Stat;
import it.me.rivenroller.riven.components.Weapon;
import it.me.rivenroller.riven.utils.StatList;
import it.me.rivenroller.riven.utils.WeaponList;

public class RivenMod implements Cloneable {
	
	private int modRank;
	
	private int polarityID;
	
	private int cycles;
	
	private int masteryRank;
	
	private int rivenType; // 0 = 2 stat no curse; 1 = 3 stat no curse; 2 = 2 stat /w curse; 3 = 3 stat /w curse;
	
	private int kuvaUsed;
	
	private String rivenName;
	
	private WeaponList wlist;
	
	private StatList slist;
	
	private List<Stat> rivenStats;
	
	private Stat curse;
	
	private Weapon weapon;
	
	private Random rngesus;
	
	public RivenMod() {
		
		rngesus = new Random();
		
		rivenStats = new ArrayList<>();
		
		wlist = new WeaponList(rngesus);
		
		slist = new StatList(rngesus);
		
		modRank = 0;
		
		generateMod();
		
	}
	
	public RivenMod(Weapon weap) {
		
		rngesus = new Random();
		
		rivenStats = new ArrayList<>();
		
		wlist = new WeaponList(rngesus);
		
		slist = new StatList(rngesus);
		
		modRank = 0;
		
		generateMod(weap);
		
	}
	
	public void generateMod() {
		
		slist = new StatList(rngesus);
		
		cycles = 0;
		
		polarityID = rngesus.nextInt(3);
		
		masteryRank = 8 + rngesus.nextInt(9);
		
		weapon = wlist.getRandomWeapon();
		
		rivenType = rngesus.nextInt(4);
		
		kuvaUsed = 0;
		
		generateStats();
		
		generateName();
		
	}
	
	public void generateMod(Weapon wep) {
		
		slist = new StatList(rngesus);
		
		cycles = 0;
		
		polarityID = rngesus.nextInt(3);
		
		masteryRank = 8 + rngesus.nextInt(9);
		
		weapon = wep;
		
		rivenType = rngesus.nextInt(4);
		
		kuvaUsed = 0;
		
		generateStats();
		
		generateName();
		
	}
	
	public void rollStats() {
		
		slist = new StatList(rngesus);
		
		cycles++;
		
		rivenType = rngesus.nextInt(4);
		
		increaseKuva();
		
		generateStats();
		
		generateName();
		
	}
	
	private void increaseKuva() {
		
		int[] increments = { 0, 900, 1000, 1200, 1400, 1700, 2000, 2350, 2750, 3150, 3500 };
		int total;
		
		if(cycles > 10) {
			
			total = 3500;
			
		} else {
			
			total = increments[cycles];
			
		}
		
		kuvaUsed = kuvaUsed + total;
		
	}

	private void generateStats() {
		
		List<Stat> availableStats;
		List<Stat> availableCurses;
		rivenStats.clear();
		curse = null;
		
		double curseStatBuff = 1.2437;
		double tripleDebuff = 0.7563;
		double curseTripleBuff = 0.9475;
		double curseBuff = 1.5254;
		
		switch(weapon.getWClass()) {
		
		case Weapon.RIFLE:
			
			availableStats = new ArrayList<>(slist.getRifleBuffs());
			availableCurses = new ArrayList<>(slist.getRifleCurses());
			
			break;
			
		case Weapon.SHOTGUN:
			
			availableStats = new ArrayList<>(slist.getShotgunBuffs());
			availableCurses = new ArrayList<>(slist.getShotgunCurses());
		
			break;
			
		case Weapon.PISTOL:
			
			availableStats = new ArrayList<>(slist.getPistolBuffs());
			availableCurses = new ArrayList<>(slist.getPistolCurses());
			
			break;
			
		case Weapon.MELEE:
			
			availableStats = new ArrayList<>(slist.getMeleeBuffs());
			availableCurses = new ArrayList<>(slist.getMeleeCurses());
			
			break;
			
		default:
				
			availableStats = null;
			availableCurses = null;
		
		}
		
		if(rivenType == 0 || rivenType == 1) {
			
			if(rivenType == 0) {
				
				for(int i = 0; i < 2; i++) {
					
					int x = rngesus.nextInt(availableStats.size());
					Stat extracted = availableStats.get(x);
					extracted.setMinMax(extracted.getMin() * weapon.getDisposition(), extracted.getMax() * weapon.getDisposition());
					extracted.generateValue();
					rivenStats.add(extracted);
					availableStats.remove(x);
					
				}
				
			} else {
				
				for(int i = 0; i < 3; i++) {
					
					int x = rngesus.nextInt(availableStats.size());
					Stat extracted = availableStats.get(x);
					extracted.setMinMax(extracted.getMin() * weapon.getDisposition() * tripleDebuff, extracted.getMax() * weapon.getDisposition() * tripleDebuff);
					extracted.generateValue();
					rivenStats.add(extracted);
					availableStats.remove(x);
					
				}
				
			}
			
		} else {
			
			if(rivenType == 2) {
				
				for(int i = 0; i < 2; i++) {
					
					int x = rngesus.nextInt(availableStats.size());
					Stat extracted = availableStats.get(x);
					extracted.setMinMax(extracted.getMin() * weapon.getDisposition() * curseStatBuff, extracted.getMax() * weapon.getDisposition() * curseStatBuff);
					extracted.generateValue();
					rivenStats.add(extracted);
					availableStats.remove(x);
					
				}
				
				Stat curse = null;
				
				do {
					
					int x = rngesus.nextInt(availableCurses.size());
					curse = availableCurses.get(x);
					curse.setMinMax(curse.getMin() * weapon.getDisposition(), curse.getMax() * weapon.getDisposition());
					curse.generateValue();
					
				} while(rivenStats.contains(curse));
				
				this.curse = curse;
				
			} else {
				
				for(int i = 0; i < 3; i++) {
					
					int x = rngesus.nextInt(availableStats.size());
					Stat extracted = availableStats.get(x);
					extracted.setMinMax(extracted.getMin() * weapon.getDisposition() * curseTripleBuff, extracted.getMax() * weapon.getDisposition() * curseTripleBuff);
					extracted.generateValue();
					rivenStats.add(extracted);
					availableStats.remove(x);
					
				}
				
				Stat curse = null;
				
				do {
					
					int x = rngesus.nextInt(availableCurses.size());
					curse = availableCurses.get(x);
					curse.setMinMax(curse.getMin() * weapon.getDisposition() * curseBuff, curse.getMax() * weapon.getDisposition() * curseBuff);
					curse.generateValue();
					
				} while(rivenStats.contains(curse));
				
				this.curse = curse;
				
			}
			
		}
		
	}

	private void generateName() {
		
		List<Stat> temp = new ArrayList<>(rivenStats);
		
		if(rivenType == 0 || rivenType == 2) {
			
			int x = rngesus.nextInt(temp.size());
			
			String pref = temp.get(x).getPrefix();
			temp.remove(x);
			
			rivenName = String.format("<html><p>%s %s%s</p></html>", weapon.getName(), pref, temp.get(0).getSuffix());
			
		} else {
			
			int x = rngesus.nextInt(temp.size());
			
			String pref1 = temp.get(x).getPrefix();
			temp.remove(x);
			
			x = rngesus.nextInt(temp.size());
			String pref2 = temp.get(x).getPrefix();
			temp.remove(x);
			
			rivenName = String.format("<html><p>%s %s-%s%s</p></html>", weapon.getName(), pref1, pref2, temp.get(0).getSuffix());
			
		}
		
	}

	public String getMasteryRank() {
		
		return "MR " + masteryRank;
		
	}
	
	public int getCycles() {
		
		return cycles;
		
	}

	public String getRivenName() {
		
		return rivenName;
		
	}
	
	public String getStats() {
		
		switch(rivenType) {
		
		case 0:
			
			Stat s1 = rivenStats.get(0);
			s1.rankValue(modRank);
			
			Stat s2 = rivenStats.get(1);
			s2.rankValue(modRank);
			
			return String.format("<html>%s<br/>%s</html>", s1.toString(), s2.toString());
			
		case 1:
			
			Stat s3 = rivenStats.get(0);
			s3.rankValue(modRank);
			
			Stat s4 = rivenStats.get(1);
			s4.rankValue(modRank);
			
			Stat s5 = rivenStats.get(2);
			s5.rankValue(modRank);
			
			return String.format("<html>%s<br/>%s<br/>%s</html>", s3.toString(), s4.toString(), s5.toString());
			
		case 2:
			
			Stat s6 = rivenStats.get(0);
			s6.rankValue(modRank);
			
			Stat s7 = rivenStats.get(1);
			s7.rankValue(modRank);
			
			Stat c1 = curse;
			c1.rankValue(modRank);
			
			return String.format("<html>%s<br/>%s<br/>%s</html>", s6.toString(), s7.toString(), c1.toString());
			
		case 3:
			
			Stat s8 = rivenStats.get(0);
			s8.rankValue(modRank);
			
			Stat s9 = rivenStats.get(1);
			s9.rankValue(modRank);
			
			Stat s10 = rivenStats.get(2);
			s10.rankValue(modRank);
			
			Stat c2 = curse;
			c2.rankValue(modRank);
			
			return String.format("<html>%s<br/>%s<br/>%s<br/>%s</html>", s8.toString(), s9.toString(), s10.toString(), c2.toString());
		
		}
		
		return "";
		
	}

	public synchronized List<ImageIcon> getStatImages() {
		
		List<ImageIcon> imgs = new ArrayList<>();
		
		for(int i = 0; i < rivenStats.size(); i++) {
			
			imgs.add(rivenStats.get(i).getImage());
			
		}
		
		return imgs;
	}
	
	public List<Stat> getStatsList(){
		
		return rivenStats;
		
	}
	
	protected void setRank(int rank) {
		
		modRank = rank;
		
	}
	
	public void increaseRank() {
		
		if(modRank < 8) {
			
			modRank++;
			
		}
		
	}
	
	public void decreaseRank() {
		
		if(modRank > 0) {
			
			modRank--;
			
		}
		
	}
	
	public void setPolarity(int polarityID) {
		
		this.polarityID = polarityID;
		
	}
	
	public String getPolarity() {
		
		return "<html>" + (10 + modRank) + " " + (polarityID == 0 ? "<img src=\"file:img/polarities/Madurai.png\">" : polarityID == 1 ? "<img src=\"file:img/polarities/Vazarin.png\">" : "<img src=\"file:img/polarities/Naramon.png\">") + "</html>";
		
	}
	
	public String getKuvaUsed() {
		
		return String.format("Kuva used: %d", kuvaUsed);
		
	}
	
	public RivenMod clone() {
		
		RivenMod mod = new RivenMod();
		
		mod.modRank = modRank;
		mod.polarityID = polarityID;
		mod.cycles = cycles;
		mod.masteryRank = masteryRank;
		mod.rivenType = rivenType;
		mod.kuvaUsed = kuvaUsed;
		mod.rivenName = rivenName;
		mod.wlist = wlist;
		mod.slist = slist;
		mod.rivenStats = new ArrayList<>(rivenStats);
		mod.curse = curse;
		mod.weapon = weapon;
		mod.rngesus = rngesus;
		
		return mod;
		
	}

}
