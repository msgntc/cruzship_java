package madlibs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;



import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Madlibs extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public Madlibs() {
		getContentPane().setBackground(Color.CYAN);
		setTitle("josiah madlib");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sires Madlib");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 37));
		lblNewLabel.setBounds(110, 31, 228, 42);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(34, 98, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 98, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(34, 159, 130, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(262, 159, 130, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(6, 238, 438, 85);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("put an adjective");
		lblNewLabel_1.setBounds(44, 85, 120, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("put a noun");
		lblNewLabel_2.setBounds(292, 85, 78, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("put a verb");
		lblNewLabel_3.setBounds(44, 144, 94, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("put anything");
		lblNewLabel_4.setBounds(272, 144, 96, 16);
		getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Create Madlib");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String	message = "The " +  textField.getText() + " " + textField_1.getText() + " " + textField_2.getText() + " to the bakery saying " +
			textField_3.getText() + "!";
			textField_4.setText(message);
			
			
			}
		});
		btnNewButton.setBounds(165, 197, 117, 29);
		getContentPane().add(btnNewButton);
		
	
		
		
	}

	public static void main(String[] args) {
		 Madlibs theGame = new  Madlibs();
		theGame.setSize(new Dimension(450, 400));
		theGame.setVisible(true);
	}
}
