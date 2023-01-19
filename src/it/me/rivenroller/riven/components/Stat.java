package it.me.rivenroller.riven.components;

import java.util.Objects;
import java.util.Random;

import javax.swing.ImageIcon;

public class Stat {
	
	private String textOut;
	
	private String buffSign;
	
	private String prefix;
	
	private String suffix;
	
	private String img;
	
	private double minValue;
	
	private double maxValue;
	
	private double genValue;
	
	private int statRank;
	
	private Random rng;
	
	public Stat(String textOut, String buffSign, String prefix, String suffix, double minValue, double maxValue, String img, Random rng) {
		
		this.textOut = textOut;
		
		this.prefix = prefix;
		
		this.suffix = suffix;
		
		this.minValue = minValue;
		
		this.maxValue = maxValue;
		
		this.buffSign = buffSign;
		
		this.img = img;
		
		this.statRank = 0;
		
		this.rng = rng;
		
	}

	public void generateValue() {
		
		double delta = maxValue - minValue;
		
		genValue = minValue + (delta * rng.nextDouble());
		
	}
	
	public String toString() {
		
		return String.format("%s%.1f%s %s", buffSign, genValue * (1 + statRank), textOut.equals("Combo Duration") ? "s" : textOut.equals("Punch Through") ? "m" : "%" , textOut);
		
	}
	
	public boolean equals(Object s) {
		
		Objects.requireNonNull(s);
		
		if(!Stat.class.isAssignableFrom(s.getClass())) {
			
			return false;
			
		}
		
		final Stat stat = (Stat) s;
		
		if(prefix.equals(stat.getPrefix()) && suffix.equals(stat.getSuffix())) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public String getPrefix() {
		
		return prefix;
		
	}
	
	public String getSuffix() {
		
		return suffix;
		
	}
	
	public ImageIcon getImage() {
		
		return new ImageIcon(img);
		
	}
	
	public void setMinMax(double min, double max) {
		
		minValue = min;
		
		maxValue = max;
		
	}
	
	public double getMin() {
		
		return minValue;
		
	}
	
	public double getMax() {
		
		return maxValue;
		
	}
	
	public double getValue() {
		
		return genValue * (1 + statRank);
		
	}
	
	public void rankValue(int rank) {
		
		statRank = rank;
		
	}

}
