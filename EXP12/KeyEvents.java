import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.JFrame;
 class keyBoardEvents extends JFrame implements KeyListener{
	TextArea area;
	Label l;
	 keyBoardEvents(){
		 area = new TextArea();
		 l = new Label();
		 l.setBounds (20, 50, 100, 20);
		 add(l); 
		 area.setBounds(20, 80, 300, 300);
		 add(area); 
		 setSize(400, 400);    
	     setLayout(null);    
	     setVisible(true);  
	     area.addKeyListener(this);
	 }
	public void keyTyped(KeyEvent ke) {
		l.setText("Key Typed");
	}

	public void keyPressed(KeyEvent ke) {
		l.setText("Key Pressed");
	}

	public void keyReleased(KeyEvent ke) {
		l.setText("Key Released");
		
	} 
 }
 class MouseEvents extends JFrame implements MouseListener,MouseMotionListener{
	 TextArea a;
	 MouseEvents(){
		 addMouseListener(this);  
         
	        a=new TextArea();  
	        a.setBounds(20,50,150,20);  
	        add(a);  
	        setSize(500,500);  
	        setLayout(null);  
	        setVisible(true);  
	        a.addMouseListener(this);
	        a.addMouseMotionListener(this);
	 }
	public void mouseDragged(MouseEvent e) {
		a.setText("Mouse Dragged");
		
	}
	public void mouseMoved(MouseEvent e) {
		a.setText("Mouse Moved");
		
	}
	public void mouseClicked(MouseEvent e) {
		a.setText("Mouse Clicked");
		
	}
	public void mousePressed(MouseEvent e) {
		a.setText("Mouse Pressed");
		
	}
	public void mouseReleased(MouseEvent e) {
		a.setText("Mouse Released");
		
	}
	public void mouseEntered(MouseEvent e) {
		a.setText("Mouse Entered");
		
	}
	public void mouseExited(MouseEvent e) {
		a.setText("Mouse Exited");
	}
	 
 }
 public class KeyEvents {
	 public static void main(String args[]) {
		 int cho;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1.Key Board Events\n2.Mouse Events\n");
		 cho = sc.nextInt();
		 if(cho == 1) {
			 new keyBoardEvents();
		 }
		 else if(cho == 2) {
			 new MouseEvents();
		 }
		 else {
			 System.out.println("Invalid Input!");
		 }
	 }
 }
