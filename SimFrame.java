package sim;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimFrame extends JFrame implements ActionListener{
	Simulator simulator;
	JComboBox<String> arrival,transmission;
	JLabel emissionRate,transmissionRate,msec,dropped;
	int speed;
	Thread gameT;
	long timeElapsed;
	SimFrame(){
		simulator = new Simulator();
		
	  	this.add(simulator);
	  	this.setResizable(false);
	  	this.setBackground(Color.white);
	  	this.setTitle("Packet Simulator");
	  	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	this.pack();
	  	this.setVisible(true);
	  	//this.setLocationRelativeTo(null);
	  	Color lightGray = new Color(189, 189, 189);
	  	
	  	String[] arrivalRate = {"100 packet/s","300 packet/s","500 packet/s"};
	    String[] relayRate = {"300 packet/s","500 packet/s","800 packet/s"};
	  		
	  	   emissionRate = new JLabel("Emmission rate");
	       simulator.add(emissionRate);
	       emissionRate.setBounds(80, 190, 100, 20);
	       
	       arrival = new JComboBox<>(arrivalRate);
		   simulator.add(arrival);
		   arrival.setBounds(125,92,120,20);
		   arrival.setBackground(lightGray);
		   arrival.setOpaque(true);
		   arrival.setVisible(true);
	       
		   
	       transmissionRate = new JLabel("Transmission rate");
	       simulator.add(transmissionRate);
	       transmissionRate.setBounds(140, 190, 100, 20);
	      
	       transmission = new JComboBox<>(relayRate);
	       simulator.add(transmission);
	       transmission.setBounds(150,92,120,20);
	       transmission.setBackground(lightGray);
	       transmission.setOpaque(true);
	       transmission.setVisible(true);
	       
	       JButton startButton = new JButton("Start");
		   simulator.add(startButton);
		   startButton.setBounds(185, 100, 100, 20);
		   Color startColor = new Color(76, 228, 53);
		   startButton.setBackground(startColor);
		   startButton.setOpaque(true);
		   startButton.addActionListener(this);
		      
		   JButton resetButton = new JButton("Reset");
		   simulator.add(resetButton);
		   resetButton.setBounds(250, 400, 100, 20);
		   Color resetColor = new Color(199, 56, 56);
		   resetButton.setBackground(resetColor);
		   resetButton.setOpaque(true);
		   resetButton.addActionListener(this);
		   
		   
		   
		   Color purple = new Color(191,111,238);
		   msec = new JLabel(timeElapsed + "msec");
	       simulator.add(msec);
	       emissionRate.setBounds(30, 295, 100, 20);
	       
	       dropped = new JLabel("0 packets dropped out of 0");
	       simulator.add(dropped);
	       Color droppedColor = new Color(226,226,226);
	       dropped.setForeground(purple);
	       dropped.setBackground(droppedColor);
	       dropped.setOpaque(true);
	       dropped.setBounds(30, 400, 100, 20);
	}

	


	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getActionCommand().equals("Reset")) {
			dispose();
			SimStart simStart = new SimStart();
			simStart.setTitle("Packet Simulator");
			simStart.setSize(930,325);
	        simStart.setVisible(true);
	        simStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}

}
