package gussingGame;


	

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;

	import java.awt.Dimension;
	import java.awt.Font;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.Color;

	public class GuessingGame extends JFrame {
		
		private JTextField txtGuess;
		private JLabel lblOutput;
		private JButton btnGuessButton;
		private JButton btnPlayAgain;
		private int theNumber;
		
		
				public GuessingGame() {
			getContentPane().setBackground(Color.RED);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("sire Hi-Lo Guessing Game");
			getContentPane().setLayout(null);
			
			JLabel HeadingLabel = new JLabel("sires Hi-Lo Guessing Game");
			HeadingLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			HeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
			HeadingLabel.setBounds(10, 34, 416, 28);
			getContentPane().add(HeadingLabel);
			
			JLabel lblGuessNumberLabel = new JLabel("Guess a number between 1 and 100");
			lblGuessNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblGuessNumberLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
			lblGuessNumberLabel.setBounds(51, 96, 236, 28);
			getContentPane().add(lblGuessNumberLabel);
			
			txtGuess = new JTextField();
			txtGuess.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkGuess();
				}
			});
			txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
			txtGuess.setBounds(298, 98, 45, 26);
			getContentPane().add(txtGuess);
			txtGuess.setColumns(10);
			
			btnGuessButton = new JButton("Guess!");
			btnGuessButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkGuess();
				}
			});
			btnGuessButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnGuessButton.setBounds(175, 151, 85, 21);
			getContentPane().add(btnGuessButton);
			
			lblOutput = new JLabel("Enter a number above and click Guess!");
			lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
			lblOutput.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
			lblOutput.setBounds(10, 213, 416, 28);
			getContentPane().add(lblOutput);
			
			btnPlayAgain = new JButton("Play Again!");
			btnPlayAgain.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					newGame();
				}
			});
			btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnPlayAgain.setBounds(158, 151, 120, 21);
			getContentPane().add(btnPlayAgain);
			
			btnPlayAgain.setVisible(false);
		}

		
		public void checkGuess() {
			
			String guessText = txtGuess.getText();
			String message = "";
			
			try {
				int guess = Integer.parseInt(guessText);
				
					if(guess < theNumber) {
					
						
					} else if(guess > theNumber) {
						
						message = guess + " is too high.";
					} else {
						message = guess + " is correct. You win!";
						btnPlayAgain.setVisible(true);
						btnGuessButton.setVisible(false);
					}	
				  
					
				
				
			}catch (Exception e) {
				
				message = "Enter a whole number between 1 and 100.";
			}finally {
			
				
				lblOutput.setText(message);
				
				txtGuess.setText("");
				txtGuess.requestFocus();
				txtGuess.selectAll();
			}
		}
		
		
		public void newGame() {
			theNumber = (int) (Math.random() * 100 + 1);
			btnGuessButton.setVisible(true);
			btnPlayAgain.setVisible(false);
			lblOutput.setText("");
		}
		public static void main(String[] args) {
			GuessingGame theGame = new GuessingGame();
			theGame.newGame();
			theGame.setSize(new Dimension(450, 300));
			theGame.setVisible(true);
		}
	}

