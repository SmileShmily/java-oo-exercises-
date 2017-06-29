package RobotPrep;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RobotMenu2 {

	private JFrame frmRobotMenu;
	private JList list;
	private DefaultListModel<Robot> listModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RobotMenu2 window = new RobotMenu2();
					window.frmRobotMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RobotMenu2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRobotMenu = new JFrame();
		frmRobotMenu.setTitle("Robot Menu");
		frmRobotMenu.setBounds(100, 100, 668, 300);
		frmRobotMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRobotMenu.getContentPane().setLayout(null);
		
		listModel = new DefaultListModel<Robot>();
		JList list = new JList(listModel);
		list.setBounds(209, 13, 429, 227);
		frmRobotMenu.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Create Robot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = getInput("What is the robot's name?", "Name Dialog");
				int x = Integer.parseInt(getInput("What is the robot's x position?", "XPOS Dialog"));
				int y = Integer.parseInt(getInput("What is the robot's y position?", "YPOS Dialog"));
				int speed = Integer.parseInt(getInput("What is the robot's speed?", "Speed Dialog"));
				String direction = getInput("What is the robot's starting direction?", "Direction Dialog");
				Robot r = new Robot(name, x, y, speed, direction);
				listModel.add(listModel.size(), r);
			}
		});
		btnNewButton.setBounds(29, 13, 155, 43);
		frmRobotMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rotate Robot");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selection = list.getSelectedIndex();
				String rotate = getInput("What direction do you want to rotate(Right or left)?", "Rotate Dialog");
				listModel.get(selection).Rotate(rotate);
			}
		});
		btnNewButton_1.setBounds(29, 69, 155, 43);
		frmRobotMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Move Robot");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selection = list.getSelectedIndex();
				listModel.get(selection).Move();
			}
		});
		btnNewButton_2.setBounds(29, 125, 155, 43);
		frmRobotMenu.getContentPane().add(btnNewButton_2);
	}
	
	public String getInput(String prompt, String title){
		String s = (String)JOptionPane.showInputDialog(
				frmRobotMenu, 
				prompt, 
				title, JOptionPane.PLAIN_MESSAGE, 
				null, 
				null, 
				"");
		return s;
	}
}
