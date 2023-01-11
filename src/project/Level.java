package project;
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Level implements ActionListener{
	private static JFrame f;
	private static JButton a;
	private static JButton b;
	private static JButton c;
	private static JLabel jlab;
	private static JLabel jlab1;
	private static JLabel jlab2;
	private static JLabel jlab3;
	private static JLabel jlab4;
	
	private static JTextArea nog;
	
	public Level() {
		f = new JFrame("Level of Concern");
		
		f.setSize(500, 600);
		
		jlab = new JLabel("Level of Concern");
		jlab1 = new JLabel("Manoel Gomes");
		jlab2 = new JLabel("2020");
		jlab3 = new JLabel("3:52");
		jlab4 = new JLabel("Gospel");
		
		
		/*jlab = new JLabel("eu quis dar pra vc(la ele)
                todo meu amor mas ela só me quis como amante
                ainda mete por tras desse pobre rapaz que garante (la nele)
				e esse corpo gostoso é só dele e de mais ninguem 
				la ele mil vezes(la ele mil vezes)
				se eu fico");*/
		
		/*Cause I told you my level of concern\r\n"
		+ "But you walked by like you never heard\r\n"
		+ "And you could bring down my level of concern\r\n"
		+ "Just need you to tell me we're alright\r\n"
		+ "Tell me we're okay, yeah*/
		
		nog = new JTextArea("");
		
		nog.setLineWrap(true);
		nog.setEditable(false);
		

		a = new JButton("editar letra");
		b = new JButton("deletar letra");
		c = new JButton("salvar");
		
		jlab.setBounds(180, 10, 300, 30);
		jlab1.setBounds(50, 50, 300, 30);
		jlab2.setBounds(200, 50, 300, 30);
		jlab3.setBounds(300, 50, 300, 30);
		jlab4.setBounds(400, 50, 300, 30);
		
		nog.setBounds(50, 90, 400, 300);
		
		a.setBounds(80, 400, 300, 30);
		b.setBounds(80, 450, 300, 30);
		c.setBounds(80, 500, 300, 30);
		
		f.add(jlab);
		f.add(jlab1);
		f.add(jlab2);
		f.add(jlab3);
		f.add(jlab4);
		
		f.add(nog);
		
		f.add(a);
		f.add(b);
		f.add(c);
		
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Level exemplo = new Level();
		a.addActionListener(exemplo);
		b.addActionListener(exemplo);
		c.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("editar letra")) {
			nog.setEditable(true);
	}
		else if (ae.getActionCommand().equals("deletar letra")) {
			nog.setText("");
	}
		else {
			nog.setEditable(false);
		}
	}
}	