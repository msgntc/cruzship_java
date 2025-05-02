package animation;

import javax.swing.JFrame;

public class This {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Animation s = new Animation();
        f.getContentPane().add(s);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 400);
	}

}
