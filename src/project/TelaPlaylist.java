package project;
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaPlaylist implements ActionListener{
	private static JFrame f;
	private static JButton a;
	private static JButton b;
	private static JButton c;
	private static JLabel jlab;
	
	public TelaPlaylist() {
		f = new JFrame("Tela Playlist");
		a = new JButton("procurar playlist");
		b = new JButton("add playlist");
		c = new JButton("deletar playlist");
		
		f.setSize(500, 300);
		a.setBounds(80, 10, 300, 30);
		b.setBounds(80, 60, 300, 30);
		c.setBounds(80, 110, 300, 30);
		
		f.add(a);
		f.add(b);
		f.add(c);
		
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		
		f.add(jlab);
		
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		TelaPlaylist exemplo = new TelaPlaylist();
		a.addActionListener(exemplo);
		b.addActionListener(exemplo);
		c.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("procurar playlist")) {
			jlab.setText("JList");
	}
		else if (ae.getActionCommand().equals("add playlist")) {
			jlab.setText("vai pra pagina add playlist");
	}
		else {
			jlab.setText("JList");
		}
	}
}	