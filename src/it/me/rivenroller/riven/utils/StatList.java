package it.me.rivenroller.riven.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import it.me.rivenroller.riven.components.Stat;

public class StatList {
	
	private List<Stat> rifleBuffs;
	
	private List<Stat> rifleCurses;
	
	private List<Stat> shotgunBuffs;
	
	private List<Stat> shotgunCurses;
	
	private List<Stat> pistolBuffs;
	
	private List<Stat> pistolCurses;
	
	private List<Stat> meleeBuffs;
	
	private List<Stat> meleeCurses;
	
	private Random rng;
	
	public StatList(Random rng) {
		
		rifleBuffs = new ArrayList<>();
		
		rifleCurses = new ArrayList<>();
		
		shotgunBuffs = new ArrayList<>();
		
		shotgunCurses = new ArrayList<>();
		
		pistolBuffs = new ArrayList<>();
		
		pistolCurses = new ArrayList<>();
		
		meleeBuffs = new ArrayList<>();
		
		meleeCurses = new ArrayList<>();
		
		this.rng = rng;
		
		fillRifleStats();
		
		fillShotgunStats();
		
		fillPistolStats();
		
		fillMeleeStats();
		
	}
	
	public StatList() {
		
		this(new Random());
		
	}

	private void fillMeleeStats() {
		
		meleeBuffs.add(new Stat("Melee Damage", "+", "Visi", "ata", 16.3, 19.9, "img/stats/melee/Damage.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "+", "Sci", "sus", 11.9, 14.5, "img/stats/melee/Slash.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "+", "Magna", "ton", 11.9, 14.5, "img/stats/melee/Impact.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "+", "Insi", "cak", 11.9, 14.5, "img/stats/melee/Puncture.png", rng));
		meleeBuffs.add(new Stat("Critical Chance", "+", "Crita", "cron", 8.9, 10.9, "img/stats/melee/Critical Chance.png", rng));
		meleeBuffs.add(new Stat("Critical Damage", "+", "Acri", "tis", 8.9, 10.9, "img/stats/melee/Critical Damage.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/elements/Cold.png\"> Cold", "+", "Geli", "do", 8.9, 10.9, "img/stats/melee/Cold.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/elements/Electricity.png\"> Electricity", "+", "Vexi", "tio", 8.9, 10.9, "img/stats/melee/Electricity.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/elements/Heat.png\"> Heat", "+", "Igni", "pha", 8.9, 10.9, "img/stats/melee/Heat.png", rng));
		meleeBuffs.add(new Stat("<img src=\"file:img/elements/Toxin.png\"> Toxin", "+", "Toxi", "tox", 8.9, 10.9, "img/stats/melee/Toxin.png", rng));
		meleeBuffs.add(new Stat("Status Chance", "+", "Hexa", "dex", 8.9, 10.9, "img/stats/melee/Status Chance.png", rng));
		meleeBuffs.add(new Stat("Status Duration", "+", "Deci", "des", 9.9, 12.1, "img/stats/melee/Status Duration.png", rng));
		meleeBuffs.add(new Stat("Damage to Corpus", "+", "Manti", "tron", 4.5, 5.4, "img/stats/melee/Damage to Corpus.png", rng));
		meleeBuffs.add(new Stat("Damage to Grineer", "+", "Argi", "con", 4.5, 5.4, "img/stats/melee/Damage to Grineer.png", rng));
		meleeBuffs.add(new Stat("Damage to Infested", "+", "Pura", "ada", 4.5, 5.4, "img/stats/melee/Damage to Infested.png", rng));
		meleeBuffs.add(new Stat("Attack Speed", "+", "Croni", "dra", 5.4, 6.6, "img/stats/melee/Attack Speed.png", rng));
		meleeBuffs.add(new Stat("Channeling Efficiency", "+", "Uti", "tia", 8.9, 10.9, "img/stats/melee/Channeling Efficiency.png", rng));
		meleeBuffs.add(new Stat("Channeling Damage", "+", "Tori", "bo", 14.9, 18.2, "img/stats/melee/Channeling Damage.png", rng));
		meleeBuffs.add(new Stat("Finisher Damage", "+", "Exi", "cta", 11.9, 14.5, "img/stats/melee/Finisher Damage.png", rng));
		meleeBuffs.add(new Stat("Range", "+", "Locti", "tor", 11.9, 14.5, "img/stats/melee/Range.png", rng));
		meleeBuffs.add(new Stat("Critical Chance on Slide Attack", "+", "Pleci", "nent", 8.9, 10.9, "img/stats/melee/Slide Attack Critical Chance.png", rng));
		meleeBuffs.add(new Stat("Combo Duration", "+", "Tempi", "nem", 0.8, 1.0, "img/stats/melee/Combo Duration.png", rng));
		
		meleeCurses.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "-", "Sci", "sus", 5.9, 7.2, null, rng));
		meleeCurses.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "-", "Magna", "ton", 5.9, 7.2, null, rng));
		meleeCurses.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "-", "Insi", "cak", 5.9, 7.2, null, rng));
		meleeCurses.add(new Stat("Critical Chance", "-", "Crita", "cron", 4.5, 5.4, null, rng));
		meleeCurses.add(new Stat("Critical Damage", "-", "Acri", "tis", 4.5, 5.4, null, rng));
		meleeCurses.add(new Stat("Status Chance", "-", "Hexa", "dex", 4.5, 5.4, null, rng));
		meleeCurses.add(new Stat("Status Duration", "-", "Deci", "des", 4.9, 6.0, null, rng));
		meleeCurses.add(new Stat("Damage to Corpus", "-", "Manti", "tron", 2.2, 2.7, null, rng));
		meleeCurses.add(new Stat("Damage to Grineer", "-", "Argi", "con", 2.2, 2.7, null, rng));
		meleeCurses.add(new Stat("Damage to Infested", "-", "Pura", "ada", 2.2, 2.7, null, rng));
		meleeCurses.add(new Stat("Attack Speed", "-", "Croni", "dra", 2.7, 3.3, null, rng));
		meleeCurses.add(new Stat("Finisher Damage", "-", "Exi", "cta", 5.9, 7.2, null, rng));
		meleeCurses.add(new Stat("Range", "-", "Locti", "tor", 5.9, 7.2, null, rng));
		meleeCurses.add(new Stat("Critical Chance on Slide Attack", "-", "Pleci", "nent", 4.5, 5.4, null, rng));
		meleeCurses.add(new Stat("Combo Duration", "-", "Tempi", "nem", 0.4, 0.5, null, rng));
		
	}

	private void fillPistolStats() {
		
		pistolBuffs.add(new Stat("Multishot", "+", "Sati", "can", 11.9, 14.5, "img/stats/pistols/Multishot.png", rng));
		pistolBuffs.add(new Stat("Damage", "+", "Visi", "ata", 21.7, 26.6, "img/stats/pistols/Damage.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "+", "Sci", "sus", 11.9, 14.5, "img/stats/pistols/Slash.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "+", "Magna", "ton", 11.9, 14.5, "img/stats/pistols/Impact.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "+", "Insi", "cak", 11.9, 14.5, "img/stats/pistols/Puncture.png", rng));
		pistolBuffs.add(new Stat("Critical Chance", "+", "Crita", "cron", 14.8, 18.1, "img/stats/pistols/Critical Chance.png", rng));
		pistolBuffs.add(new Stat("Critical Damage", "+", "Acri", "tis", 8.9, 10.9, "img/stats/pistols/Critical Damage.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/elements/Cold.png\"> Cold", "+", "Geli", "do", 8.9, 10.9, "img/stats/pistols/Cold.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/elements/Electricity.png\"> Electricity", "+", "Vexi", "tio", 8.9, 10.9, "img/stats/pistols/Electricity.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/elements/Heat.png\"> Heat", "+", "Igni", "pha", 8.9, 10.9, "img/stats/pistols/Heat.png", rng));
		pistolBuffs.add(new Stat("<img src=\"file:img/elements/Toxin.png\"> Toxin", "+", "Toxi", "tox", 8.9, 10.9, "img/stats/pistols/Toxin.png", rng));
		pistolBuffs.add(new Stat("Status Chance", "+", "Hexa", "dex", 8.9, 10.9, "img/stats/pistols/Status Chance.png", rng));
		pistolBuffs.add(new Stat("Status Duration", "+", "Deci", "des", 9.9, 12.1, "img/stats/pistols/Status Duration.png", rng));
		pistolBuffs.add(new Stat("Damage to Corpus", "+", "Manti", "tron", 4.5, 5.4, "img/stats/pistols/Damage to Corpus.png", rng));
		pistolBuffs.add(new Stat("Damage to Grineer", "+", "Argi", "con", 4.5, 5.4, "img/stats/pistols/Damage to Grineer.png", rng));
		pistolBuffs.add(new Stat("Damage to Infested", "+", "Pura", "ada", 4.5, 5.4, "img/stats/pistols/Damage to Infested.png", rng));
		pistolBuffs.add(new Stat("Fire Rate", "+", "Croni", "dra", 7.4, 9.0, "img/stats/pistols/Fire Rate.png", rng));
		pistolBuffs.add(new Stat("Magazine Capacity", "+", "Arma", "tin", 5.0, 6.1, "img/stats/pistols/Magazine Capacity.png", rng));
		pistolBuffs.add(new Stat("Ammo Maximum", "+", "Ampi", "bin", 8.9, 10.9, "img/stats/pistols/Ammo Maximum.png", rng));
		pistolBuffs.add(new Stat("Projectile Flight Speed", "+", "Conci", "nak", 8.9, 10.9, "img/stats/pistols/Flight Speed.png", rng));
		pistolBuffs.add(new Stat("Reload Speed", "+", "Feva", "tak", 5.0, 6.1, "img/stats/pistols/Reload Speed.png", rng));
		pistolBuffs.add(new Stat("Weapon Recoil", "-", "Zeti", "mag", 8.9, 10.9, "img/stats/pistols/Weapon Recoil.png", rng));
		pistolBuffs.add(new Stat("Zoom", "+", "Hera", "lis", 7.9, 9.7, "img/stats/pistols/Zoom.png", rng));
		pistolBuffs.add(new Stat("Punch Through", "+", "Lexi", "nok", 0.3, 0.3333, "img/stats/pistols/Punch Through.png", rng));
		
		pistolCurses.add(new Stat("Multishot", "-", "Sati", "can", 5.9, 7.2, null, rng));
		pistolCurses.add(new Stat("Damage", "-", "Visi", "ata", 10.9, 13.3, null, rng));
		pistolCurses.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "-", "Sci", "sus", 5.9, 7.3, null, rng));
		pistolCurses.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "-", "Magna", "ton", 5.9, 7.3, null, rng));
		pistolCurses.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "-", "Insi", "cak", 5.9, 7.3, null, rng));
		pistolCurses.add(new Stat("Critical Chance", "-", "Crita", "cron", 7.4, 9.1, null, rng));
		pistolCurses.add(new Stat("Critical Damage", "-", "Acri", "tis", 4.5, 5.4, null, rng));
		pistolCurses.add(new Stat("Status Chance", "-", "Hexa", "dex", 4.5, 5.4, null, rng));
		pistolCurses.add(new Stat("Status Duration", "-", "Deci", "des", 4.9, 6.0, null, rng));
		pistolCurses.add(new Stat("Damage to Corpus", "-", "Manti", "tron", 2.2, 2.7, null, rng));
		pistolCurses.add(new Stat("Damage to Grineer", "-", "Argi", "con", 2.2, 2.7, null, rng));
		pistolCurses.add(new Stat("Damage to Infested", "-", "Pura", "ada", 2.2, 2.7, null, rng));
		pistolCurses.add(new Stat("Fire Rate", "-", "Croni", "dra", 3.7, 4.5, null, rng));
		pistolCurses.add(new Stat("Magazine Capacity", "-", "Arma", "tin", 2.5, 3.0, null, rng));
		pistolCurses.add(new Stat("Ammo Maximum", "-", "Ampi", "bin", 4.5, 5.4, null, rng));
		pistolCurses.add(new Stat("Projectile Flight Speed", "-", "Conci", "nak", 4.5, 5.4, null, rng));
		pistolCurses.add(new Stat("Reload Speed", "-", "Feva", "tak", 2.5, 3.0, null, rng));
		pistolCurses.add(new Stat("Weapon Recoil", "+", "Zeti", "mag", 4.5, 5.4, null, rng));
		pistolCurses.add(new Stat("Zoom", "-", "Hera", "lis", 4.0, 4.8, null, rng));
		
	}

	private void fillShotgunStats() {
		
		shotgunBuffs.add(new Stat("Multishot", "+", "Sati", "can", 11.9, 14.5, "img/stats/shotguns/Multishot.png", rng));
		shotgunBuffs.add(new Stat("Damage", "+", "Visi", "ata", 16.3, 19.9, "img/stats/shotguns/Damage.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "+", "Sci", "sus", 11.9, 14.5, "img/stats/shotguns/Slash.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "+", "Magna", "ton", 11.9, 14.5, "img/stats/shotguns/Impact.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "+", "Insi", "cak", 11.9, 14.5, "img/stats/shotguns/Puncture.png", rng));
		shotgunBuffs.add(new Stat("Critical Chance", "+", "Crita", "cron", 8.9, 10.9, "img/stats/shotguns/Critical Chance.png", rng));
		shotgunBuffs.add(new Stat("Critical Damage", "+", "Acri", "tis", 8.9, 10.9, "img/stats/shotguns/Critical Damage.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/elements/Cold.png\"> Cold", "+", "Geli", "do", 8.9, 10.9, "img/stats/shotguns/Cold.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/elements/Electricity.png\"> Electricity", "+", "Vexi", "tio", 8.9, 10.9, "img/stats/shotguns/Electricity.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/elements/Heat.png\"> Heat", "+", "Igni", "pha", 8.9, 10.9, "img/stats/shotguns/Heat.png", rng));
		shotgunBuffs.add(new Stat("<img src=\"file:img/elements/Toxin.png\"> Toxin", "+", "Toxi", "tox", 8.9, 10.9, "img/stats/shotguns/Toxin.png", rng));
		shotgunBuffs.add(new Stat("Status Chance", "+", "Hexa", "dex", 8.9, 10.9, "img/stats/shotguns/Status Chance.png", rng));
		shotgunBuffs.add(new Stat("Status Duration", "+", "Deci", "des", 9.9, 12.1, "img/stats/shotguns/Status Duration.png", rng));
		shotgunBuffs.add(new Stat("Damage to Corpus", "+", "Manti", "tron", 4.5, 5.4, "img/stats/shotguns/Damage to Corpus.png", rng));
		shotgunBuffs.add(new Stat("Damage to Grineer", "+", "Argi", "con", 4.5, 5.4, "img/stats/shotguns/Damage to Grineer.png", rng));
		shotgunBuffs.add(new Stat("Damage to Infested", "+", "Pura", "ada", 4.5, 5.4, "img/stats/shotguns/Damage to Infested.png", rng));
		shotgunBuffs.add(new Stat("Fire Rate (x2 for Bows)", "+", "Croni", "dra", 8.9, 10.9, "img/stats/shotguns/Fire Rate.png", rng));
		shotgunBuffs.add(new Stat("Magazine Capacity", "+", "Arma", "tin", 5.0, 6.1, "img/stats/shotguns/Magazine Capacity.png", rng));
		shotgunBuffs.add(new Stat("Ammo Maximum", "+", "Ampi", "bin", 8.9, 10.9, "img/stats/shotguns/Ammo Maximum.png", rng));
		shotgunBuffs.add(new Stat("Projectile Flight Speed", "+", "Conci", "nak", 8.9, 10.9, "img/stats/shotguns/Flight Speed.png", rng));
		shotgunBuffs.add(new Stat("Reload Speed", "+", "Feva", "tak", 5.0, 6.1, "img/stats/shotguns/Reload Speed.png", rng));
		shotgunBuffs.add(new Stat("Weapon Recoil", "-", "Zeti", "mag", 8.9, 10.9, "img/stats/shotguns/Weapon Recoil.png", rng));
		shotgunBuffs.add(new Stat("Punch Through", "+", "Lexi", "nok", 0.3, 0.3333, "img/stats/shotguns/Punch Through.png", rng));
		
		shotgunCurses.add(new Stat("Multishot", "-", "Sati", "can", 5.9, 7.1, null, rng));
		shotgunCurses.add(new Stat("Damage", "-", "Visi", "ata", 8.2, 10.0, null, rng));
		shotgunCurses.add(new Stat("Critical Chance", "-", "Crita", "cron", 4.5, 5.4, null, rng));
		shotgunCurses.add(new Stat("Critical Damage", "-", "Acri", "tis", 4.5, 5.4, null, rng));
		shotgunCurses.add(new Stat("Status Chance", "-", "Hexa", "dex", 4.5, 5.4, null, rng));
		shotgunCurses.add(new Stat("Status Duration", "-", "Deci", "des", 4.9, 6.0, null, rng));
		shotgunCurses.add(new Stat("Damage to Corpus", "-", "Manti", "tron", 2.2, 2.7, null, rng));
		shotgunCurses.add(new Stat("Damage to Grineer", "-", "Argi", "con", 2.2, 2.7, null, rng));
		shotgunCurses.add(new Stat("Damage to Infested", "-", "Pura", "ada", 2.2, 2.7, null, rng));
		shotgunCurses.add(new Stat("Fire Rate (x2 for Bows)", "-", "Croni", "dra", 4.5, 5.4, null, rng));
		shotgunCurses.add(new Stat("Magazine Capacity", "-", "Arma", "tin", 2.5, 3.0, null, rng));
		shotgunCurses.add(new Stat("Ammo Maximum", "-", "Ampi", "bin", 4.5, 5.4, null, rng));
		shotgunCurses.add(new Stat("Projectile Flight Speed", "-", "Conci", "nak", 4.5, 5.4, null, rng));
		shotgunCurses.add(new Stat("Reload Speed", "-", "Feva", "tak", 2.5, 3.0, null, rng));
		shotgunCurses.add(new Stat("Weapon Recoil", "+", "Zeti", "mag", 4.5, 5.4, null, rng));
		
	}

	private void fillRifleStats() {
		
		rifleBuffs.add(new Stat("Multishot", "+", "Sati", "can", 8.9, 10.9, "img/stats/rifles/Multishot.png", rng));
		rifleBuffs.add(new Stat("Damage", "+", "Visi", "ata", 16.3, 20.0, "img/stats/rifles/Damage.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "+", "Sci", "sus", 11.9, 14.5, "img/stats/rifles/Slash.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "+", "Magna", "ton", 11.9, 14.5, "img/stats/rifles/Impact.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "+", "Insi", "cak", 11.9, 14.5, "img/stats/rifles/Puncture.png", rng));
		rifleBuffs.add(new Stat("Critical Chance", "+", "Crita", "cron", 14.8, 18.1, "img/stats/rifles/Critical Chance.png", rng));
		rifleBuffs.add(new Stat("Critical Damage", "+", "Acri", "tis", 11.9, 14.5, "img/stats/rifles/Critical Damage.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/elements/Cold.png\"> Cold", "+", "Geli", "do", 8.9, 10.9, "img/stats/rifles/Cold.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/elements/Electricity.png\"> Electricity", "+", "Vexi", "tio", 8.9, 10.9, "img/stats/rifles/Electricity.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/elements/Heat.png\"> Heat", "+", "Igni", "pha", 8.9, 10.9, "img/stats/rifles/Heat.png", rng));
		rifleBuffs.add(new Stat("<img src=\"file:img/elements/Toxin.png\"> Toxin", "+", "Toxi", "tox", 8.9, 10.9, "img/stats/rifles/Toxin.png", rng));
		rifleBuffs.add(new Stat("Status Chance", "+", "Hexa", "dex", 8.9, 10.9, "img/stats/rifles/Status Chance.png", rng));
		rifleBuffs.add(new Stat("Status Duration", "+", "Deci", "des", 9.9, 12.1, "img/stats/rifles/Status Duration.png", rng));
		rifleBuffs.add(new Stat("Damage to Corpus", "+", "Manti", "tron", 4.5, 5.4, "img/stats/rifles/Damage to Corpus.png", rng));
		rifleBuffs.add(new Stat("Damage to Grineer", "+", "Argi", "con", 4.5, 5.4, "img/stats/rifles/Damage to Grineer.png", rng));
		rifleBuffs.add(new Stat("Damage to Infested", "+", "Pura", "ada", 4.5, 5.4, "img/stats/rifles/Damage to Infested.png", rng));
		rifleBuffs.add(new Stat("Fire Rate (x2 for Bows)", "+", "Croni", "dra", 5.9, 7.3, "img/stats/rifles/Fire Rate.png", rng));
		rifleBuffs.add(new Stat("Magazine Capacity", "+", "Arma", "tin", 5.0, 6.1, "img/stats/rifles/Magazine Capacity.png", rng));
		rifleBuffs.add(new Stat("Ammo Maximum", "+", "Ampi", "bin", 4.9, 6.0, "img/stats/rifles/Ammo Maximum.png", rng));
		rifleBuffs.add(new Stat("Projectile Flight Speed", "+", "Conci", "nak", 8.9, 10.9, "img/stats/rifles/Flight Speed.png", rng));
		rifleBuffs.add(new Stat("Reload Speed", "+", "Feva", "tak", 5.0, 6.1, "img/stats/rifles/Reload Speed.png", rng));
		rifleBuffs.add(new Stat("Weapon Recoil", "-", "Zeti", "mag", 8.9, 10.9, "img/stats/rifles/Weapon Recoil.png", rng));
		rifleBuffs.add(new Stat("Zoom", "+", "Hera", "lis", 5.9, 7.3, "img/stats/rifles/Zoom.png", rng));
		rifleBuffs.add(new Stat("Punch Through", "+", "Lexi", "nok", 0.3, 0.3333, "img/stats/rifles/Punch Through.png", rng));
		
		rifleCurses.add(new Stat("Multishot", "-", "Sati", "can", 4.5, 5.4, null, rng));
		rifleCurses.add(new Stat("Damage", "-", "Visi", "ata", 8.2, 10.0, null, rng));
		rifleCurses.add(new Stat("<img src=\"file:img/physical/Slash.png\"> Slash", "-", "Sci", "sus", 5.9, 7.3, null, rng));
		rifleCurses.add(new Stat("<img src=\"file:img/physical/Impact.png\"> Impact", "-", "Magna", "ton", 5.9, 7.3, null, rng));
		rifleCurses.add(new Stat("<img src=\"file:img/physical/Puncture.png\"> Puncture", "-", "Insi", "cak", 5.9, 7.3, null, rng));
		rifleCurses.add(new Stat("Critical Chance", "-", "Crita", "cron", 7.4, 9.1, null, rng));
		rifleCurses.add(new Stat("Critical Damage", "-", "Acri", "tis", 5.9, 7.3, null, rng));
		rifleCurses.add(new Stat("Status Chance", "-", "Hexa", "dex", 4.5, 5.4, null, rng));
		rifleCurses.add(new Stat("Status Duration", "-", "Deci", "des", 4.9, 6.0, null, rng));
		rifleCurses.add(new Stat("Damage to Corpus", "-", "Manti", "tron", 2.2, 2.7, null, rng));
		rifleCurses.add(new Stat("Damage to Grineer", "-", "Argi", "con", 2.2, 2.7, null, rng));
		rifleCurses.add(new Stat("Damage to Infested", "-", "Pura", "ada", 2.2, 2.7, null, rng));
		rifleCurses.add(new Stat("Fire Rate (x2 for Bows)", "-", "Croni", "dra", 3.0, 3.6, null, rng));
		rifleCurses.add(new Stat("Magazine Capacity", "-", "Arma", "tin", 2.5, 3.0, null, rng));
		rifleCurses.add(new Stat("Ammo Maximum", "-", "Ampi", "bin", 2.5, 3.0, null, rng));
		rifleCurses.add(new Stat("Projectile Flight Speed", "-", "Conci", "nak", 4.5, 5.4, null, rng));
		rifleCurses.add(new Stat("Reload Speed", "-", "Feva", "tak", 2.5, 3.0, null, rng));
		rifleCurses.add(new Stat("Weapon Recoil", "+", "Zeti", "mag", 4.5, 5.4, null, rng));
		rifleCurses.add(new Stat("Zoom", "-", "Hera", "lis", 3.0, 3.6, null, rng));
		
	}
	
	public List<Stat> getRifleBuffs() {
		
		return rifleBuffs;
		
	}
	
	public List<Stat> getRifleCurses() {
		
		return rifleCurses;
		
	}
	
	public List<Stat> getShotgunBuffs() {
		
		return shotgunBuffs;
		
	}
	
	public List<Stat> getShotgunCurses() {
		
		return shotgunCurses;
		
	}
	
	public List<Stat> getPistolBuffs() {
		
		return pistolBuffs;
		
	}
	
	public List<Stat> getPistolCurses() {
		
		return pistolCurses;
		
	}
	
	public List<Stat> getMeleeBuffs() {
		
		return meleeBuffs;
		
	}
	
	public List<Stat> getMeleeCurses() {
		
		return meleeCurses;
		
	}

}
