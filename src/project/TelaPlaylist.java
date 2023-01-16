package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TelaPlaylist implements ActionListener{
	private static JFrame frame;
	private static JButton botaoProcurarPlaylist;
	private static JButton botaoAddPlaylist;
	private static JButton botaoDeletarPlaylist;
	private static JLabel jlab;
	
	public TelaPlaylist() {
		frame = new JFrame("Tela Playlist");
		frame.setSize(500, 600);
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(160,75,209,255));
		frame.add(jlab);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}	
		
	public void construir() {
		ProcurarPlaylist();
		AddPlaylist();
		DeletarPlaylist();
	}
		
	public void ProcurarPlaylist() {
		botaoProcurarPlaylist = new JButton("Procurar Playlist");
		botaoProcurarPlaylist.setBounds(80, 10, 300, 30);
		botaoProcurarPlaylist.setBackground(new Color(160,75,209,255));
		botaoProcurarPlaylist.setActionCommand("procurar playlist");
		botaoProcurarPlaylist.addActionListener(this);
		frame.add(botaoProcurarPlaylist);
	}	
	
	public void AddPlaylist() {
		botaoAddPlaylist = new JButton("Add Playlist");
		botaoAddPlaylist.setBounds(80, 60, 300, 30);
		botaoAddPlaylist.setBackground(new Color(160,75,209,255));
		botaoAddPlaylist.setActionCommand("add playlist");
		botaoAddPlaylist.addActionListener(this);
		frame.add(botaoAddPlaylist);
		
	}
	
	public void DeletarPlaylist() {
		botaoDeletarPlaylist = new JButton("Deletar Playlist");
		botaoDeletarPlaylist.setBounds(80, 110, 300, 30);
		botaoDeletarPlaylist.setBackground(new Color(160,75,209,255));
		botaoDeletarPlaylist.setActionCommand("deletar playlist");
		botaoDeletarPlaylist.addActionListener(this);
		frame.add(botaoDeletarPlaylist);
	}

	public static void main(String[] args) {
		 new TelaPlaylist();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("procurar playlist")) {
			jlab.setText("JList");
	}
		else if ("add playlist" == ae.getActionCommand()) {
			new AddPlaylist();
			frame.dispose();
	}
		else {
			jlab.setText("JList");
		}
	}
}
	
	