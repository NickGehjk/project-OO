package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlaylist implements ActionListener{
	private static JFrame frame;
	private static JLabel jlabNome;
	private static JTextField texto1;
	private static JLabel jlabAno;
	private static JTextField texto2;
	
	private static JButton cri;
	
	public AddPlaylist() {
		frame = new JFrame("Adicionar Playlist");
		
		jlabNome = new JLabel("Nome:");
		texto1 = new JTextField("");
		jlabAno = new JLabel("Ano:");
		texto2 = new JTextField("");
		
		cri = new JButton("Adicionar");
		
		frame.setSize(500, 650);
		frame.getContentPane().setBackground(Color.BLACK);
		
		jlabNome.setBounds(50, 20, 300, 30);
		texto1.setBounds(100, 20, 200, 30);
		jlabNome.setForeground(new Color(255, 77, 0));

		jlabAno.setBounds(50, 70, 300, 30);
		texto2.setBounds(100, 70, 200, 30);
		jlabAno.setForeground(new Color(255, 77, 0));
		
		cri.setBounds(75, 120, 250, 30);
		cri.setBackground(new Color(255, 77, 0));
		
		frame.add(jlabNome);
		frame.add(texto1);
		frame.add(jlabAno);
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
		