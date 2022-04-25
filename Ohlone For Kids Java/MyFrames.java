import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
public class MyFrames {

	public static void main(String[] args) {
////Warm up 
//	ArrayList<String>friends = new ArrayList<String>();
//	while (true) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Tell the name of friend or done to exit");
//		String name = input.nextLine();
//		if (name.equals("done")) {
//			System.out.println("you have friends: "+friends);
//			break;}
//		if (friends.contains(name)) {
//			System.out.println(name+"is in list");}
//		else {
//			friends.add(name);}
//		}
	
		
//// Ex 1 (creating a GUI window)
//		//creating a frame object of type JFrame
//		JFrame frame = new JFrame();
//		//Setting visibility of this frame to true
//		frame.setVisible(true);
//		//if user closes the window, stop the program
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//// Ex 2 (setting location and size of the frame)
//		JFrame frame = new JFrame ();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		//setting the size of the frame in pixels(Width,Height)
//		frame.setSize(400, 400);
//		//setting the location of the frame on screen (X pixels, Y pixels)
//		frame.setLocation(500, 200);
//		//could also set both in one call using setBounds(X pixels, Y pixels, Width, Height)
//		frame.setBounds(500,200,400,400);
		
		
		
//// Ex 3 (setting title bar icon and background color of the frame)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(500,200,400,400);
//		//setting the title of the window
//		frame.setTitle("My First Java Frame");
//		//creating an ImageIcon object using ou^ ÙuÂn2ile
//		ImageIcon icon = new ImageIcon("java_logo.PNG");
//		//Setting the icon to the frame
//		frame.setIconImage(icon.getmÍæØ»j;
//		//creating a Container object for the content of the frame
//		Container c = frame.getContentPane();
//		//Setting the Container object's background color to red
//		c.setBackground(Color.RED);
		
		
		
//// Ex 4 (creating a non-resizable frame)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(500,200,400,400);
//		frame.setTitle("My First Java Frame");
//		ImageIcon icon = new ImageIcon("java_logo.PNG");
//		frame.setIconImage(icon.getImage());
//		Container c = frame.getContentPane();
//		c.setBackground(Color.RED);
//		//disabling the resizability of the frame
//		frame.setResizable(false);
		
		

//// Ex 5 (creating a label with a default location)
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(500,200,400,400);
//		frame.setTitle("My First Java Frame");
//		Container c = frame.getContentPane();
//		//instantiating a JLabel object and assigning it to a variable
//		JLabel label = new JLabel("Hello World");
//		//placing it on the content pane
//		c.add(label);
		
		

//// Ex 6 (creating a label with a specified location)
//		JFrame frame = new JFrame ();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(500,200,400,400);
//		frame.setTitle("My First Java Frame");
//		Container c = frame.getContentPane();
//		c.setLayout(null);
//		JLabel label = new JLabel("Hello World");
//		label.setText("Hi Friends");
//		//first two are X and Y pixels while second two establish the width and height of the label
//		label.setBounds(100,50,200,30);
//		Font f = new Font("Arial",Font.BOLD,30);
//		label.setFont(f);
//		c.add(label);
//		ImageIcon icon = new ImageIcon("java_logo.PNG");
//		JLabölì'íbU(2 = new JLabel(icon);
//		//here, we are using getIconWidth() and getIconHeight() to get the dimensions of the image in pixels[
w;8ñ86add(label2);
//		label2.setBounds(100,100,icon.getIconWidth(),
//		icon.getIconHeight());
//		//creating multiple lines with <html>tag
//		String text = "<html>Hello Friends,<br>My name is Joyce<br>I am"
//				+ "in 9th grade<html>";
//		JLabel label3 = new JLabel(text);
//		c.add(label3);
//		label3.setBounds(100,300,300,50);
		
	
//// DIY
//		JFrame frame = new JFrame ();
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(500,200,400,400);
//		frame.setTitle("Progressive Kids");
//		ImageIcon icon = new ImageIcon("java_logo.PNG");
//		Container c = frame.getContentPane();
//		c.setLayout(null);		
//		String text = "<html>Progressive Kids is dedicated to<br>develop kids coding programs<html>";
//		JLabel label = new JLabel(text);
//		c.add(label);
//		label.setBounds(100,150,300,100);
//		ImageIcon icon2 = new ImageIcon("ProgressiveKidsLogo.PNG");
//		JLabel label2 = new JLabel(icon2);
//		c.add(label2);
//		label2.setBounds(125,75,icon2.getIconWidth(),icon2.getIconHeight());
//		String text1 = "<html>Email:team@progressivekids.us<br>"
//				+ "URL:www.progressivekids.us<html>";
//		JLabel label3 = new JLabel(text1);
//		c.add(label3);
//		label3.setBounds(100,225,300,50);
	}
}


