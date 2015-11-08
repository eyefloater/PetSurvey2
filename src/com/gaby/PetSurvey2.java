package com.gaby;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PetSurvey2 extends JFrame {

	// boolean variables
	public boolean hasDog;
	public boolean hasCat;
	public boolean hasFish;

	private static final long serialVersionUID = 1L;

	// constructor
	public PetSurvey2() {

		// specifies layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 45, 0, 43, 45, 65, 69, 53, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 40, 23, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		// header label
		JLabel lblCheckThePets = new JLabel("Check the pets you have.");
		GridBagConstraints gbc_lblCheckThePets = new GridBagConstraints();
		gbc_lblCheckThePets.insets = new Insets(0, 0, 5, 5);
		gbc_lblCheckThePets.gridx = 0;
		gbc_lblCheckThePets.gridy = 0;
		getContentPane().add(lblCheckThePets, gbc_lblCheckThePets);
		
				// dog checkbox
				JCheckBox chckbxDog = new JCheckBox("Dog");
				chckbxDog.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						// if checked, set hasDog to true
						hasDog = true;
					}
				});
				
						// layout positions checkboxes
						GridBagConstraints gbc_chckbxDog = new GridBagConstraints();
						gbc_chckbxDog.anchor = GridBagConstraints.WEST;
						gbc_chckbxDog.insets = new Insets(0, 0, 5, 5);
						gbc_chckbxDog.gridx = 1;
						gbc_chckbxDog.gridy = 1;
						getContentPane().add(chckbxDog, gbc_chckbxDog);

		// results label
		JLabel surveyResultsLabel = new JLabel("Survey results");
		GridBagConstraints gbc_surveyResultsLabel = new GridBagConstraints();
		gbc_surveyResultsLabel.gridwidth = 2;
		gbc_surveyResultsLabel.anchor = GridBagConstraints.WEST;
		gbc_surveyResultsLabel.insets = new Insets(0, 0, 5, 5);
		gbc_surveyResultsLabel.gridx = 1;
		gbc_surveyResultsLabel.gridy = 2;
		getContentPane().add(surveyResultsLabel, gbc_surveyResultsLabel);

		// quit button
		JButton btnQuit = new JButton("Quit");
		btnQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

		// cat checkbox
		JCheckBox chckbxCat = new JCheckBox("Cat");
		chckbxCat.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// if checked, set hasCat to true
				hasCat = true;
			}
		});
		GridBagConstraints gbc_chckbxCat = new GridBagConstraints();
		gbc_chckbxCat.anchor = GridBagConstraints.WEST;
		gbc_chckbxCat.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxCat.gridx = 2;
		gbc_chckbxCat.gridy = 1;
		getContentPane().add(chckbxCat, gbc_chckbxCat);

		// fish checkbox
		JCheckBox chckbxFish = new JCheckBox("Fish");
		chckbxFish.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				// if checked, set hasFish to true
				hasFish = true;

			}
		});
		GridBagConstraints gbc_chckbxFish = new GridBagConstraints();
		gbc_chckbxFish.anchor = GridBagConstraints.WEST;
		gbc_chckbxFish.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxFish.gridx = 3;
		gbc_chckbxFish.gridy = 1;
		getContentPane().add(chckbxFish, gbc_chckbxFish);

		// submit button
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String dog = (hasDog) ? "one dog" : "no dogs";
				String cat = (hasCat) ? "one cat" : "no cats";
				String fish = (hasFish) ? "one fish" : "no fishes";

				surveyResultsLabel.setText(dog + " , " + cat + " , " + fish);

			}
		});

		// layout for submit and quit buttons
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubmit.anchor = GridBagConstraints.WEST;
		gbc_btnSubmit.gridx = 0;
		gbc_btnSubmit.gridy = 2;
		getContentPane().add(btnSubmit, gbc_btnSubmit);

		GridBagConstraints gbc_btnQuit = new GridBagConstraints();
		gbc_btnQuit.insets = new Insets(0, 0, 0, 5);
		gbc_btnQuit.anchor = GridBagConstraints.WEST;
		gbc_btnQuit.gridx = 0;
		gbc_btnQuit.gridy = 3;
		getContentPane().add(btnQuit, gbc_btnQuit);

		// sets window to size that fits buttons
		pack();
	}

}
