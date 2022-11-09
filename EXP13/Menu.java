import java.awt.Dialog;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuBar implements ActionListener{
	JMenu file,edit;
	JMenuItem cut,copy,paste,Save;
	JMenuBar b;
	JFrame f;
	JTextArea ta;
	static Dialog d;
	MenuBar(){
		f = new JFrame();
		d = new Dialog(f , "Dialog Example", true);  
		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");
		Save = new JMenuItem("Save");
		Save.addActionListener(this);
		cut.addActionListener(this);    
		copy.addActionListener(this);    
		paste.addActionListener(this); 
		b=new JMenuBar();    
		file=new JMenu("File");    
		edit=new JMenu("Edit");
		file.add(Save);
		edit.add(cut);
		edit.add(paste);
		edit.add(copy);
		b.add(file);
		b.add(edit);
		ta = new JTextArea();
		ta.setBounds(5,5,360,320);    
		f.add(b);
		f.add(ta);    
		f.setJMenuBar(b);  
		d.setLayout(null);    
		f.setSize(400,400);    
		f.setVisible(true); 
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)    
			ta.cut();    
		if(e.getSource()==paste)    
			ta.paste();    
		if(e.getSource()==copy)    
			ta.copy();   

	}

}
public class Menu{
	public static void main(String args[]) {
		new MenuBar();
	}
}
