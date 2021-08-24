package sinyal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class kayansinyal extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kayansinyal frame = new kayansinyal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public kayansinyal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel farone = new JLabel("New label");
		farone.setIcon(new ImageIcon(kayansinyal.class.getResource("/sinyal/far1.jpg")));
		farone.setBounds(-226, 0, 810, 363);
		contentPane.add(farone);
		
		JLabel fartwo = new JLabel("New label");
		fartwo.setIcon(new ImageIcon(kayansinyal.class.getResource("/sinyal/far2.jpg")));
		fartwo.setBounds(-226, 0, 810, 363);
		contentPane.add(fartwo);
		
		JLabel farthree = new JLabel("New label");
		farthree.setIcon(new ImageIcon(kayansinyal.class.getResource("/sinyal/far3.jpg")));
		farthree.setBounds(-226, 0, 810, 363);
		contentPane.add(farthree);
		
		JLabel farfour = new JLabel("New label");
		farfour.setIcon(new ImageIcon(kayansinyal.class.getResource("/sinyal/far4.jpg")));
		farfour.setBounds(-226, 0, 810, 363);
		contentPane.add(farfour);
		
		
		farone.setVisible(true);
		fartwo.setVisible(false);
		farthree.setVisible(false);
		farfour.setVisible(false);
		
		JButton sinyal = new JButton("Signal");
		sinyal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TimerTask task = new TimerTask() {
					public void run() {
						for(int i=0; i<60; i++) {
							try {
								Thread.sleep(100);
								
							
								
								if(farone.isVisible()) {
									farone.setVisible(false);
									fartwo.setVisible(true);
									
								}
								else if (fartwo.isVisible()) {
									fartwo.setVisible(false);
									farthree.setVisible(true);
									
									
									
								}
								else if (farthree.isVisible()) {
									farthree.setVisible(false);
									farfour.setVisible(true);
								
									
								}
								
								else {
									farone.setVisible(true);
								}
								
							
							}
							
							catch (InterruptedException e) {
								e.printStackTrace();
								
							}
							
						}
					}
				};
				Timer timer = new Timer("Timer");
				
				long delay = 50L;
				timer.schedule(task,delay);
				
				
			}
		});
		sinyal.setBounds(450, 309, 89, 23);
		contentPane.add(sinyal);
		
	}
}
