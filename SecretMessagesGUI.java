package secretMessagesGUI;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SecretMessagesGUI extends JFrame {
	private JTextField txtKey;
	private JTextArea txtIn;
	private JTextArea txtOut;
	private JSlider slider;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnMoveUp;
	
	public String encode( String message, int keyVal ) {
		String output  ="";
		char key = (char) keyVal;
        
		
	   
	    	
	   
		for( int i = 0; i < message.length(); i++ )  {
        char input = message.charAt(i);
        if (input >= 'A' && input <= 'Z')
        {
       	 input += key;
       	 if (input > 'Z')
       		 input -= 26;
       	 if (input < 'A')
       		 input += 26;
    	 
        }
        else if (input >= 'a' && input <= 'z')
        {
       	 input += key;
       	 if (input > 'z')
       		 input -= 26;
       	 if (input < 'a')
       		 input += 26;
        }
        else if (input > '0' && input <= '9')
        {
       	 input += (keyVal % 10);
       	 if (input > '9')
       		 input -= 10;
       	 if (input < '0')
       		 input += 10;
        }
        output += input;
		}
		return output;
	}
	public SecretMessagesGUI() {
		getContentPane().setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sire's Secret Message App");
		getContentPane().setLayout(null);
	    
	    scrollPane = new JScrollPane();
	    scrollPane.setBounds(19, 19, 562, 140);
	    getContentPane().add(scrollPane);
		
	    txtIn = new JTextArea();
	    scrollPane.setViewportView(txtIn);
		txtIn.setWrapStyleWord(true);
		txtIn.setLineWrap(true);
		txtIn.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(19, 216, 562, 140);
		getContentPane().add(scrollPane_1);
		
		txtOut = new JTextArea();
		scrollPane_1.setViewportView(txtOut);
		txtOut.setWrapStyleWord(true);
		txtOut.setLineWrap(true);
		txtOut.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
		
		txtKey = new JTextField();
		txtKey.setBackground(new Color(255, 255, 255));
		txtKey.setForeground(new Color(0, 0, 0));
		txtKey.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		txtKey.setBounds(241, 188, 67, 16);
		getContentPane().add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Key:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(208, 188, 31, 16);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Encode/Decode");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {	
				String message = txtIn.getText();
				int key = Integer.parseInt( txtKey.getText() );
				String output = encode( message, key );
				txtOut.setText(output);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(null,
				"Please enter a whole number value for the encription key.");
				txtKey.requestFocus();
				txtKey.selectAll();
				
				
			}
			}
		});
		btnNewButton.setBounds(320, 183, 154, 29);
		getContentPane().add(btnNewButton);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txtKey.setText("" + slider.getValue());
				String message = txtIn.getText();
				int key = slider.getValue();
				String output = encode(message, key);
				txtOut.setText( output);
			}
		});
		slider.setValue(5);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(13);
		slider.setMinimum(-25);
		slider.setMaximum(25);
		slider.setPaintLabels(true);
		slider.setForeground(new Color(255, 255, 0));
		slider.setBounds(29, 175, 190, 37);
		getContentPane().add(slider);
		
		btnMoveUp = new JButton("move up");
		btnMoveUp.setBackground(new Color(0, 0, 0));
		btnMoveUp.setForeground(new Color(0, 0, 128));
		btnMoveUp.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		});
		btnMoveUp.setBounds(466, 183, 117, 29);
		getContentPane().add(btnMoveUp);
	}

	public static void main(String[] args) {
		SecretMessagesGUI theApp = new SecretMessagesGUI();
		theApp.setSize(new java.awt.Dimension(600,400));
		theApp.setVisible(true);

	}
}
