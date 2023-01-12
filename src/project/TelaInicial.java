package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TelaInicial implements ActionListener{
	private static JFrame frame;
	private static JButton but1;
	private static JButton but2;
	private static JButton but3;
	private static JLabel jlab;
	
	public TelaInicial() {
		frame = new JFrame("Tela inicial");
		but1 = new JButton("musica");
		but2 = new JButton("artista");
		but3 = new JButton("playlists");
		
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		//frame.getContentPane().setBackground(new Color(255, 77, 0));

		but1.setBounds(80, 10, 300, 30);
		but2.setBounds(80, 60, 300, 30);
		but3.setBounds(80, 110, 300, 30);
		but1.setBackground(new Color(255, 77, 0));
		but2.setBackground(new Color(255, 77, 0));
		but3.setBackground(new Color(255, 77, 0));
		//but1.setBackground(Color.black);
		//but2.setBackground(Color.black);
		//but3.setBackground(Color.black);
		//but1.setForeground(new Color(255, 77, 0));
		//but2.setForeground(new Color(255, 77, 0));
		//but3.setForeground(new Color(255, 77, 0));
		
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(255, 77, 0));
		
		frame.add(jlab);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		TelaInicial exemplo = new TelaInicial();
		but1.addActionListener(exemplo);
		but2.addActionListener(exemplo);
		but3.addActionListener(exemplo);

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