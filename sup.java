public class MagischesQuadrat {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("JFrame Background Color");
	    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    jframe.getContentPane().setBackground(Color.red);

	    // set the jframe size and location, and make it visible
	    jframe.setPreferredSize(new Dimension(400, 300));
	    jframe.pack();
	    jframe.setLocationRelativeTo(null);
	    jframe.setVisible(true);
	}
	
}	

