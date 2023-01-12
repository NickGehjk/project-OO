package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Level implements ActionListener{
	private static JFrame frame;
	private static JButton but1;
	private static JButton but2;
	private static JButton but3;
	private static JLabel jlab;
	private static JLabel jlab1;
	private static JLabel jlab2;
	private static JLabel jlab3;
	private static JLabel jlab4;
	
	private static JTextarea letra;
	
	public Level() {
		frame = new JFrame("Level of Concern");
		
		frame.setSize(500, 600);
		
		jlab = new JLabel("Level of Concern");
		jlab1 = new JLabel("Twenty one Pilots");
		jlab2 = new JLabel("2020");
		jlab3 = new JLabel("3:52");
		jlab4 = new JLabel("rock");
		
		/*Cause I told you my level of concern\r\n"
		+ "But you walked by like you never heard\r\n"
		+ "and you could bring down my level of concern\r\n"
		+ "Just need you to tell me we're alright\r\n"
		+ "Tell me we're okay, yeah*/
		
		letra = new JTextarea("");
		
		letra.setLineWrap(true);
		letra.setEditable(false);

		but1 = new JButton("editar letra");
		but2 = new JButton("deletar letra");
		but3 = new JButton("salvar");
		
		jlab.setBounds(180, 10, 300, 30);
		jlab1.setBounds(50, 50, 300, 30);
		jlab2.setBounds(200, 50, 300, 30);
		jlab3.setBounds(300, 50, 300, 30);
		jlab4.setBounds(400, 50, 300, 30);
		jlab.setForeground(Color.orange);
		jlab1.setForeground(Color.orange);
		jlab2.setForeground(Color.orange);
		jlab3.setForeground(Color.orange);
		jlab4.setForeground(Color.orange);
		
		letra.setBounds(50, 90, 400, 300);
		
		but1.setBounds(80, 400, 300, 30);
		but2.setBounds(80, 450, 300, 30);
		but3.setBounds(80, 500, 300, 30);
		but1.setBackground(Color.orange);
		but2.setBackground(Color.orange);
		but3.setBackground(Color.orange);
		
		frame.add(jlab);
		frame.add(jlab1);
		frame.add(jlab2);
		frame.add(jlab3);
		frame.add(jlab4);
		
		frame.add(letra);
		
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Level exemplo = new Level();
		but1.addActionListener(exemplo);
		but2.addActionListener(exemplo);
		but3.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("editar letra")) {
			letra.setEditable(true);
	}
		else if (ae.getActionCommand().equals("deletar letra")) {
			letra.setText("");
	}
		else {
			letra.setEditable(false);
		}
	}
}	