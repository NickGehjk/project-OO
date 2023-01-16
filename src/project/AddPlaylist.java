package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlaylist implements ActionListener{
	private static JFrame frame;
	private static JLabel nome;
	private static JTextField textoNome;
	private static JLabel ano;
	private static JTextField textoAno;
	
	private static JButton add;
	
	public AddPlaylist() {
		frame = new JFrame("Adicionar Playlist");
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}
	
	public void construir() {
		nome();
		textoNome();
		ano();
		textoAno();
		add();
	}
	
	public void nome() {
		nome = new JLabel("Nome:");
		nome.setBounds(50, 20, 300, 30);
		nome.setForeground(new Color(160,75,209,255));
		frame.add(nome);
	}
	
	public void textoNome() {
		textoNome = new JTextField("");
		textoNome.setBounds(100, 20, 200, 30);
		frame.add(textoNome);
	}
	
	public void ano() {
		ano = new JLabel("Ano:");
		ano.setBounds(50, 70, 300, 30);
		ano.setForeground(new Color(160,75,209,255));
		frame.add(ano);
	}
	
	public void textoAno() {
		textoAno = new JTextField("");
		textoAno.setBounds(100, 70, 200, 30);
		frame.add(textoAno);
	}
	
	public void add() {
		add = new JButton("Adicionar");
		add.setBounds(75, 120, 250, 30);
		add.setBackground(new Color(160,75,209,255));
		frame.add(add);
	}

	public static void main(String[] args) {
		AddPlaylist exemplo = new AddPlaylist();
		add.addActionListener(exemplo);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			//salva os dados
		}
	}
	
}
		