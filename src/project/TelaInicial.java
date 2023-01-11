package project;
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaInicial implements ActionListener{
	private static JFrame f;
	private static JButton a;
	private static JButton b;
	private static JButton c;
	private static JLabel jlab;
	
	public TelaInicial() {
		f = new JFrame("Tela inicial");
		a = new JButton("musica");
		b = new JButton("artista");
		c = new JButton("playlists");
		
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
		TelaInicial exemplo = new TelaInicial();
		a.addActionListener(exemplo);
		b.addActionListener(exemplo);
		c.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("musica")) {
			jlab.setText("pagina de musica");
	}
		else if (ae.getActionCommand().equals("artista")) {
			jlab.setText("pagina de artistas");
	}
		else {
			jlab.setText("pagina de playlists");
		}
	}
}	