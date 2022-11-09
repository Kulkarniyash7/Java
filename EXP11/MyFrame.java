

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(132, 30, 128, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Number1");
		lblNewLabel.setBounds(46, 30, 76, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number2");
		lblNewLabel_1.setBounds(393, 29, 76, 36);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(479, 30, 128, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				textField_2.setText(Integer.toString(a+b));
				
			}
		});
		btnNewButton_1.setBounds(258, 129, 85, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				textField_2.setText(Integer.toString(a-b));
			}
		});
		btnNewButton_2.setBounds(347, 129, 85, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				textField_2.setText(Integer.toString(a*b));
			}
		});
		btnNewButton_3.setBounds(258, 174, 85, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(textField.getText());
				float b = Float.parseFloat(textField_1.getText());
				textField_2.setText(Float.toString(a/b));
			}
		});
		btnNewButton_4.setBounds(347, 175, 85, 35);
		contentPane.add(btnNewButton_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(280, 79, 128, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(192, 79, 76, 36);
		contentPane.add(lblNewLabel_2);
	}
}
