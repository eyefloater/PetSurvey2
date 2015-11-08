package com.gaby;

import javax.swing.SwingUtilities;

public class RunSurvey {

	public static void main(String[] args) {

		//runs program
		 SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new PetSurvey2().setVisible(true);
	            }
	        });
    }

}