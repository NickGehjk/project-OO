package project.Tela1;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.TelaPlaylist;
import project.Tela2.TelaMusica;
import project.Tela3.TelaArtista;

public class TelaInicial implements ActionListener{
	private static JFrame frame;
	private static JButton botaoMusica;
	private static JButton botaoArtista;
	private static JButton botaoPlaylist;
	
	
	public TelaInicial() {
		frame = new JFrame("Tela inicial");
		frame.setSize(500, 400);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		//imageGengar();
		botaoMusica();
		botaoArtista();
		botaoPlaylist();
	}
	
	/*public void imageGengar() {
		ImageIcon gengar = new ImageIcon("/Imagem/GengarMusic.png");
		JLabel label = new JLabel();
		label.setIcon(gengar);
		frame.add(label);
		frame.pack();
	}
		*/
	public void botaoMusica() {
		botaoMusica = new JButton("musica");
		botaoMusica.setBounds(80, 200, 300, 30);
		botaoMusica.setBackground(new Color(160,75,209,255));
		botaoMusica.setActionCommand("musica");
		botaoMusica.addActionListener(this);
		frame.add(botaoMusica);
	}
		
	public void botaoArtista() {
		botaoArtista = new JButton("artista");
		botaoArtista.setBounds(80, 250, 300, 30);
		botaoArtista.setBackground(new Color(160,75,209,255));
		botaoArtista.setActionCommand("artista");
		botaoArtista.addActionListener(this);
		frame.add(botaoArtista);
	}
	
	public void botaoPlaylist() {
		botaoPlaylist = new JButton("playlist");
		botaoPlaylist.setBounds(80, 300, 300, 30);
		botaoPlaylist.setBackground(new Color(160,75,209,255));
		botaoPlaylist.setActionCommand("playlist");
		botaoPlaylist.addActionListener(this);
		frame.add(botaoPlaylist);
	}
		
	public static void main(String[] args) {
		TelaInicial exemplo = new TelaInicial();
		botaoMusica.addActionListener(exemplo);
		botaoArtista.addActionListener(exemplo);
		botaoPlaylist.addActionListener(exemplo);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("musica" == ae.getActionCommand()) {
			 new TelaMusica();
	         frame.dispose();
	}
		else if ("artista" == ae.getActionCommand()) {
			new TelaArtista();
			frame.dispose();
	}
		else if ("playlist" == ae.getActionCommand()) {
			new TelaPlaylist();
			frame.dispose();
		}	
	}
}