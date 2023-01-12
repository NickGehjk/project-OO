package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TelaArtista implements ActionListener{
	private static JFrame frame;
	private static JButton but1;
	private static JButton but2;
	private static JButton but3;
	private static JLabel jlab;
	
	public TelaArtista() {
		frame = new JFrame("Tela Artista");
		but1 = new JButton("procurar artista");
		but2 = new JButton("add artista");
		but3 = new JButton("deletar artista");
		
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		//frame.getContentPane().setBackground(Color.orange);

		but1.setBounds(80, 10, 300, 30);
		but2.setBounds(80, 60, 300, 30);
		but3.setBounds(80, 110, 300, 30);
		but1.setBackground(Color.orange);
		but2.setBackground(Color.ORANGE);
		but3.setBackground(Color.orange);
		//but1.setBackground(Color.black);
		//but2.setBackground(Color.black);
		//but3.setBackground(Color.black);
		//but1.setForeground(Color.orange);
		//but2.setForeground(Color.orange);
		//but3.setForeground(Color.orange);
		
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(Color.orange);
		
		frame.add(jlab);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		TelaArtista exemplo = new TelaArtista();
		but1.addActionListener(exemplo);
		but2.addActionListener(exemplo);
		but3.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("procurar artista")) {
			jlab.setText("JList");
	}
		else if (ae.getActionCommand().equals("add artista")) {
			jlab.setText("vai pra pagina add artista");
	}
		else {
			jlab.setText("JList");
		}
	}
}	