package sim;

import javax.swing.JFrame;

public class Sim {

	public static void main(String[] args) {
		SimStart simStart = new SimStart();
		simStart.setTitle("Packet Simulator");
		simStart.setSize(930,325);
        simStart.setVisible(true);
        simStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
