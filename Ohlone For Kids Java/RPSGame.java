import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RPSGame {
static Container c;
static JLabel label = new JLabel("Select one item to play Game");

	public static void main(String[] args) {
		//creating frame to get started with
		JFrame frame = new JFrame();
		frame.setVisible(true);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,550,500);
		
		//creating container to put other widgets in it
		c = frame.getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);
		
		//adding title for the game console
		JLabel title = new JLabel("Rock Paper Scissors Game");
		Font f1 = new Font("Arial",Font.BOLD,35);
		title.setFont(f1);
		title.setBounds(50,0,500,50);
		c.add(title);
		
		//setting output label
		Font f2 = new Font("Arial",Font.BOLD,25);
		label.setFont(f2);
		label.setBounds(100,250,400,100);
		c.add(label);
		
		//adding rock image button
		ImageIcon icon = new ImageIcon("rock.jpg");
		JButton rock = new JButton(icon);
		rockListenerClass rockLis = new rockListenerClass();
		rock.addActionListener (rockLis);
		c.add(rock);
		rock.setBounds(100,100,110,110);
		
		//adding paper image button
		ImageIcon icon2 = new ImageIcon("paper.jpg");
		JButton paper = new JButton(icon2);
		paperListenerClass paperLis = new paperListenerClass();
		paper.addActionListener (paperLis);
		c.add(paper);
		paper.setBounds(220,100,110,110);
		
		//adding scissor image button
		ImageIcon icon3 = new ImageIcon("scissor.jpg");
		JButton scissor = new JButton(icon3);
		scissorListenerClass scissorLis = new scissorListenerClass();
		scissor.addActionListener(scissorLis);
		c.add(scissor);
		scissor.setBounds(340,100,110,110);
		
		//adding logo
		ImageIcon icon4 = new ImageIcon("ProgressiveKidsLogo.PNG");
		JL>b™BïlÓo = new JLabel(icon4);
		c.add(logo);
		logo.setBounds(50, 380, 120, 80);
		
		//adding your name in game
		JLabel name = ‡eS‡ªŠel("<html>Delveloped by <br>Joyce</html>");
		c.add(name);
		name.setBounds(400,380,120,80);
		
	
	}

}
class rockListenerClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		//Button logic goes here
		String[] colors = {"Rock","Paper","Scissor"};
		int idx = new Random().nextInt(colors.length);
		String random = (colors[idx]);
		String txt = "";
		if (random == "Rock") {
			txt = "It is a Tie";
		}
		else if (random == "Scissor") {
			txt = "You Win";
		}
		else {
			txt = "Computer Wins";
		}
		RPSGame.label.setText("<html>You selected Rock<br>"
				+ "Computer Selected " + random +"<br>"+txt+"</html>");
	}
}
class paperListenerClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		String[] colors = {"Rock","Paper","Scissor"};
		int idx = new Random().nextInt(colors.length);
		String random = (colors[idx]);
		String txt = "";
		if (random == "Rock") {
			txt = "You Win";
		}
		else if (random == "Scissor") {
			txt = "Computer Wins";
		}
		else {
			txt = "It's a Tie";
		}
		RPSGame.label.setText("<html>You selected Paper<br>"
				+ "Computer Selected " + random +"<br>"+txt+"</html>");
		
	}
}
class scissorListenerClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		String[] colors = {"Rock","Paper","Scissor"};
		int idx = new Random().nextInt(colors.length);
		String random = (colors[idx]);
		String txt = "";
		if (random == "Scissor") {
			txt = "It is a Tie";
		}
		else if (random == "Paper") {
			txt = "You Win";
		}
		else {
			txt = "Computer Wins";
		}
		RPSGame.label.setText("<html>You selected Scissors<br>"
				+ "Computer Selected " + random +"<br>"+txt+"</html>");

		
	}
}

















×
ed
