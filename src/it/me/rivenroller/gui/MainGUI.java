package it.me.rivenroller.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import it.me.rivenroller.riven.RivenMod;
import it.me.rivenroller.riven.components.Weapon;
import it.me.rivenroller.riven.utils.WeaponList;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;

public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6673517704938643285L;
	
	private boolean imageCycle;
	
	private JPanel contentPane;
	
	private JLabel rivenCanvas;
	private JButton newRiven;
	private JButton roll;
	private JLabel polarity;
	private JLabel rivenName;
	private JLabel rivenStats;
	private JLabel masteryRank;
	private JLabel rollCounter;
	private JLabel rivenImage;
	private JButton decrRank;
	private JButton incrRank;
	private JButton backButton;
	private JLabel kuvaUsed;
	private JComboBox<String> weaponSelector;
	
	private RivenMod mod;
	
	private Stack<RivenMod> history = new Stack<>();

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		
		mod = new RivenMod();
		imageCycle = true;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		setResizable(false);
		setIconImage(new ImageIcon("img/misc/Riven Icon.png").getImage());
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rivenName = new JLabel();
		rivenName.setHorizontalAlignment(SwingConstants.CENTER);
		rivenName.setForeground(new Color(163, 118, 210));
		rivenName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		rivenName.setBounds(118, 38, 720, 79);
		contentPane.add(rivenName);
		
		polarity = new JLabel();
		polarity.setHorizontalAlignment(SwingConstants.CENTER);
		polarity.setForeground(new Color(163, 118, 210));
		polarity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		polarity.setBounds(579, 219, 54, 28);
		contentPane.add(polarity);
		
		rivenStats = new JLabel();
		rivenStats.setForeground(new Color(163, 118, 210));
		rivenStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rivenStats.setVerticalAlignment(SwingConstants.TOP);
		rivenStats.setHorizontalAlignment(SwingConstants.LEFT);
		rivenStats.setBounds(374, 450, 258, 117);
		contentPane.add(rivenStats);
		
		masteryRank = new JLabel();
		masteryRank.setFont(new Font("Tahoma", Font.PLAIN, 20));
		masteryRank.setForeground(new Color(163, 118, 210));
		masteryRank.setHorizontalAlignment(SwingConstants.LEFT);
		masteryRank.setBounds(381, 569, 81, 28);
		contentPane.add(masteryRank);
		
		rollCounter = new JLabel();
		rollCounter.setHorizontalAlignment(SwingConstants.RIGHT);
		rollCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rollCounter.setForeground(new Color(163, 118, 210));
		rollCounter.setBounds(532, 569, 70, 28);
		contentPane.add(rollCounter);
		
		decrRank = new JButton("-");
		decrRank.setToolTipText("Decrease the mod's rank.");
		decrRank.setFont(new Font("Tahoma", Font.PLAIN, 30));
		decrRank.setBounds(300, 129, 100, 39);
		contentPane.add(decrRank);
		decrRankComands();
		
		incrRank = new JButton("+");
		incrRank.setToolTipText("Increase the mod's rank.");
		incrRank.setFont(new Font("Tahoma", Font.PLAIN, 30));
		incrRank.setBounds(579, 129, 100, 39);
		contentPane.add(incrRank);
		incrRankComands();
		
		rivenCanvas = new JLabel();
		rivenCanvas.setIcon(new ImageIcon("img/misc/Empty Riven.png"));
		rivenCanvas.setBounds(300, 149, 430, 535);
		contentPane.add(rivenCanvas);
		
		newRiven = new JButton("New Riven");
		newRiven.setBounds(300, 695, 100, 30);
		newRivenComands();
		
		rivenImage = new JLabel();
		rivenImage.setHorizontalAlignment(SwingConstants.CENTER);
		rivenImage.setBounds(347, 208, 296, 241);
		contentPane.add(rivenImage);
		contentPane.add(newRiven);
		cycleImages();
		
		roll = new JButton("Roll");
		roll.setBounds(579, 695, 100, 30);
		rollComands();
		contentPane.add(roll);
		
		weaponSelector = new JComboBox<>();
		weaponSelector.setBounds(755, 128, 232, 28);
		setLabels();
		contentPane.add(weaponSelector);
		
		kuvaUsed = new JLabel();
		kuvaUsed.setHorizontalAlignment(SwingConstants.CENTER);
		kuvaUsed.setFont(new Font("Tahoma", Font.PLAIN, 25));
		kuvaUsed.setForeground(Color.RED);
		kuvaUsed.setBounds(765, 477, 222, 52);
		contentPane.add(kuvaUsed);
		
		backButton = new JButton("Go Back!");
		backButton.setToolTipText("Roll and mod history (same as ctrl + z).");
		backButton.setBounds(56, 695, 100, 30);
		backCommands();
		contentPane.add(backButton);
		
		updateUI();
		
	}

	private void backCommands() {
		
		backButton.addActionListener((ActionEvent e) -> {
			
			if(!history.isEmpty()) {
				
				mod = history.pop();
				
			}
			
			updateUI();
			
		});
		
	}

	private void setLabels() {
		
		WeaponList wepLst = new WeaponList();
		List<Weapon> weps = wepLst.getFullList();
		
		weps.sort(new Comparator<Weapon>() {

			@Override
			public int compare(Weapon w1, Weapon w2) {
				
				return w1.getName().compareTo(w2.getName());
				
			}
			
		});
		
		for(int i = 0; i < weps.size(); i++) {
			
			weaponSelector.addItem(String.format("%s (%.3f)", weps.get(i).getName(), weps.get(i).getDisposition()));
			
		}
		
		weaponSelector.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				history.push(mod.clone());
				
				@SuppressWarnings("unchecked")
				JComboBox<String> items = (JComboBox<String>) e.getSource();
				String selectedItem = (String) items.getSelectedItem();
				
				int x = 0;
				boolean found = false;
				
				StringBuilder sb = new StringBuilder();
				
				while(selectedItem.charAt(x) != '(') {
					
					sb.append(selectedItem.charAt(x));
					x++;
					
				}
				
				x = 0;
				
				selectedItem = sb.toString();
				selectedItem = selectedItem.substring(0, selectedItem.length() - 1);
				
				while(x < weps.size() && !found) {
					
					if(weps.get(x).getName().equals(selectedItem)) {
						
						mod.generateMod(weps.get(x));
						found = true;
						
					}
					
					x++;
					
				}
				
				updateUI();
				
			}
			
		});
		
	}

	private void incrRankComands() {
		
		incrRank.addActionListener((ActionEvent e) -> {
			
			mod.increaseRank();
			
			updateUI();
			
		});
		
	}

	private void decrRankComands() {
		
		decrRank.addActionListener((ActionEvent e) -> {
			
			mod.decreaseRank();
			
			updateUI();
			
		});
		
	}

	private void updateUI() {
		
		polarity.setText(mod.getPolarity());
		
		rollCounter.setText("<html><img src=\"file:img/misc/Cycle.png\">" + mod.getCycles() + "</html>");
		
		masteryRank.setText(mod.getMasteryRank());
		
		rivenName.setText(mod.getRivenName());
		
		rivenStats.setText(mod.getStats());
		
		kuvaUsed.setText(mod.getKuvaUsed());
		
	}

	private void cycleImages() {
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				
				int image = 0;
				List<ImageIcon> images;
				
				while(imageCycle) {
					
					images =  mod.getStatImages();
					
					if(image >= images.size()) {
						
						image = 0;
						
					}
					
					rivenImage.setIcon(images.get(image));
					image++;
					
					try {
						
						Thread.sleep(2000);
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
						
					}
					
				}
				
			}
			
		});
		
		t.start();
		
	}

	private void rollComands() {
		
		roll.addActionListener((ActionEvent e) -> {
			
			history.push(mod.clone());
			
			mod.rollStats();
			
			updateUI();
			
		});
		
	}

	private void newRivenComands() {
		
		newRiven.addActionListener((ActionEvent e) -> {
			
			history.push(mod.clone());
			
			mod.generateMod();
			
			updateUI();
			
		});
		
	}
}
