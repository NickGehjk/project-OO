package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlaylist implements ActionListener{
	private static JFrame frame;

	private static JLabel jlab;
	private static JTextField texto1;
	private static JLabel jlab2;
	private static JTextField texto2;
	
	private static JButton cri;
	
	public AddPlaylist() {
		frame = new JFrame("Adicionar Playlist");
		
		jlab = new JLabel("Nome:");
		texto1 = new JTextField("");
		jlab2 = new JLabel("Ano:");
		texto2 = new JTextField("");
		
		cri = new JButton("Adicionar");
		
		frame.setSize(500, 650);
		frame.getContentPane().setBackground(Color.BLACK);
		
		jlab.setBounds(50, 20, 300, 30);
		texto1.setBounds(100, 20, 200, 30);
		jlab.setForeground(Color.orange);

		jlab2.setBounds(50, 70, 300, 30);
		texto2.setBounds(100, 70, 200, 30);
		jlab2.setForeground(Color.orange);
		
		cri.setBounds(75, 120, 250, 30);
		cri.setBackground(Color.orange);
		
		frame.add(jlab);
		frame.add(texto1);
		frame.add(jlab2);
		frame.add(texto2);
		frame.add(cri);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AddPlaylist exemplo = new AddPlaylist();
		cri.addActionListener(exemplo);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			//salva os dados
		}
	}
	
}
		