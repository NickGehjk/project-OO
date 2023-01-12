package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class AddArtista implements ActionListener{
	private static JFrame frame;

	private static JLabel jlab;
	private static JTextField texto1;
	private static JLabel jlab2;
	private static JTextField texto2;
	private static JLabel jlab3;
	private static JTextField texto3;
	private static JLabel jlabb;
	private static JComboBox box;
	
	private static JButton cri;
	
	String generos[] = {"rock", "pop", "trap", "rap", "funk",
						"jazz", "MPB", "forró", "gospel"};
	
	public AddArtista() {
		frame = new JFrame("Adicionar Artista");
		
		jlab = new JLabel("Nome:");
		texto1 = new JTextField("");
		jlab2 = new JLabel("Idade:");
		texto2 = new JTextField("");
		jlab3 = new JLabel("Nacionalidade:");
		texto3 = new JTextField("");
		jlabb = new JLabel("Gênero musical:");
		box = new JComboBox(generos);
		
		cri = new JButton("Adicionar");
		
		frame.setSize(500, 650);
		frame.getContentPane().setBackground(Color.BLACK);
		
		jlab.setBounds(50, 20, 300, 30);
		texto1.setBounds(100, 20, 200, 30);
		jlab.setForeground(new Color(255, 77, 0));

		jlab2.setBounds(50, 70, 300, 30);
		texto2.setBounds(100, 70, 200, 30);
		jlab2.setForeground(new Color(255, 77, 0));

		jlab3.setBounds(50, 120, 300, 30);
		texto3.setBounds(150, 120, 200, 30);
		jlab3.setForeground(new Color(255, 77, 0));

		jlabb.setBounds(50, 170, 300, 30);
		box.setBounds(90, 220,150,30);
		jlabb.setForeground(new Color(255, 77, 0));
		
		cri.setBounds(75, 270, 250, 30);
		cri.setBackground(new Color(255, 77, 0));
		
		frame.add(jlab);
		frame.add(texto1);
		frame.add(jlab2);
		frame.add(texto2);
		frame.add(jlab3);
		frame.add(texto3);
		frame.add(jlabb);
		frame.add(box);
		frame.add(cri);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AddArtista exemplo = new AddArtista();
		cri.addActionListener(exemplo);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			//salva os dados
		}
	}

}