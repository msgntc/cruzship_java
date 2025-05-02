package animation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


import javax.swing.JFrame;

public class Animation extends JFrame implements ActionListener {
  private Timer animator;
  private ImageIcon imageArray[] ;
  private int delay = 50, totalframes = 15, currentFrame =0;
      
  public Animation() {
	  imageArray = new ImageIcon[totalframes];
	  for (int i = 0; i < imageArray.length; i++) {
		  imageArray [i] = new ImageIcon("download-" + i + ".jpg" );
	  }
	  animator = new Timer(delay, this);
	  animator.start();
  }
  public void paintComponent(Graphics g) {
	  super.paintComponents(g);
	  if (currentFrame >= imageArray.length) {
		  currentFrame = 0;
	  }
	  currentFrame ++;
	  imageArray[currentFrame].paintIcon(this, g, 0, 0);
  }
  public void actionPerformed(ActionEvent e) {
	  repaint();
  }
}
