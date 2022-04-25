import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyButtonandTextField {
static Container c;
static JTextField tfield = new JTextField();
static JLabel label = new JLabel("My First APP");
//static JLabel label = new JLabel("Background is Yellow");
	public static void main(String[] args) {
//// Ex 1 (creating a Button with an ActionListener
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100,100,400,400);
//		c = frame.getContentPane();
//		c.setBackground(Color.YELLOW);
//		c.setLayout(null);
//		//Instantiating a JButton object and assigning it to a variable
//		JButton green = new JButton("Green");
//		//Setting the location of the button in the window
//		green.setBounds(100,50,200,50);
//		//Creating our ListenerClass object which contains our action to trigger once button is pressed
//		ListenerClass greenLis = new ListenerClass();
//		//Adding our ListenerClass object onto the button	
//		green.addActionListener(greenLis);
//		c.add(green);
		
		
//// Ex 2 (adding a label on click of a Button)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100,100,400,400);
//		c = frame.getContentPane();
//		c.setBackground(Color.YELLOW);
//		c.setLayout(null);
//		//Instantiating a JButton object and assigning it to a variable
//		JButton green = new JButton("Green");
//		//Setting the location of the button in the window
//		green.setBounds(100,50,200,50);
//		//Creating our ListenerClass object which contains our action to trigger once button is pressed
//		ListenerClass greenLis = new Lisde.m“CÏ3ss();
//		//Adding our ListenerClass object onto the button	
//		green.addActionListener(greenLis);
//		c.add(green);
//		/ëAú?ÅvƒWour label to the container
//		c.add(MyButtonandTextField.label);
//		MyButtonandTextField.label.setBounds(100,100,200,100);


//// Ex 3 (adding Button with an Image)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100,100,500,400);
//		Container c = frame.getContentPane();
//		c.setLayout(null);
//		
//		//adding image icon to the button
//		ImageIcon icon = new ImageIcon("Java_logo.PNG");
//		JButton btn = new JButton(icon);
//		c.add(btn);
//		btn.setBounds(100,100,100,150);
		
		
//// Ex 4 (adding a text field)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100,100,500,400);
//		Container c = frame.getContentPane();
//		c.setLayout(null);
//		
//		//adding a textfield using the JTextField class
//		JTextField mytext = new JTextField ();
//		Font f = new Font ("Arial",Font.BOLD,25);
//		
//		//setting font of textfield
//		mytext.setFont(f);
//		
//		//setting background and font colors for the textfield
//		mytext.setBackground(Color.YELLOW);
//		mytext.setForeground(Color.RED);
//		c.add(mytext);
//		mytext.setBounds(100,100,200,50);
		
	
//// Ex 5 (adding a password field)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100,100,500,400);
//		Container c = frame.getContentPane();
//		c.setLayout(null);
//		
//		// adding a password field using the JPasswordField class
//		JPasswordField pass = new JPasswordField();
//		c.add(pass);
//		pass.setBounds(100,100,200,50);
		
		
//// Ex 6 (using textfield and labels together)
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.s¢tﬁnhC(100,100,400,400);
		c = frame.getContentPane();
		c.setBackground(Color.YELLOW);
		c.setLayout(null);
		label.setBounds(15n,JO|˘,0,50);
		c.add(label);
		tfield.setBounds(100,100,200,40);
		c.add(tfield);
		JButton red = new JButton("Red");
		red.setBounds(100,150,200,50);
		ListenerClass redLis = new ListenerClass();
		red.addActionListener(redLis);
		c.add(red);
		
		}
	}
class ListenerClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		String t = MyButtonandTextField.tfield.getText();
		MyButtonandTextField.label.setText(t);
	}
}
//class ListenerClass implements ActionListener {
//	//method which contains logic to execute when the button has been clicked
//	public void actionPerformed(ActionEvent event) {
//		//setting the new text for green background color
//		MyButtonandTextField.label.setText("Background is Green now");
//		//this will print text on idle as well
//		System.out.println("Background is green now.");
//		//setting background to green
//		//you can access static variables of a class from classname.variablename
//		MyButtonandTextField.c.setBackground(Color.GREEN);
//}}
