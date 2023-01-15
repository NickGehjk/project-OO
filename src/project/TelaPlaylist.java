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
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(255, 77, 0));
		frame.add(jlab);
		frame.setLayout(null);
		frame.setVisible(true);
		ProcurarPlaylist();
		AddPlaylist();
		DeletarPlaylist();
	}	
		
		
	public void ProcurarPlaylist() {
		botaoProcurarPlaylist = new JButton("procurar playlist");
		botaoProcurarPlaylist.setBounds(80, 10, 300, 30);
		botaoProcurarPlaylist.setBackground(new Color(255, 77, 0));
		frame.add(botaoProcurarPlaylist);
	}	
	
	public void AddPlaylist() {
		botaoAddPlaylist = new JButton("add playlist");
		botaoAddPlaylist.setBounds(80, 60, 300, 30);
		botaoAddPlaylist.setBackground(new Color(255, 77, 0));
		frame.add(botaoAddPlaylist);
		
	}
	
	public void DeletarPlaylist() {
		botaoDeletarPlaylist = new JButton("deletar playlist");
		botaoDeletarPlaylist.setBounds(80, 110, 300, 30);
		botaoDeletarPlaylist.setBackground(new Color(255, 77, 0));
		frame.add(botaoDeletarPlaylist);
	}

	public static void main(String[] args) {
		TelaPlaylist exemplo = new TelaPlaylist();
		botaoProcurarPlaylist.addActionListener(exemplo);
		botaoAddPlaylist.addActionListener(exemplo);
		botaoDeletarPlaylist.addActionListener(exemplo);
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
	
	