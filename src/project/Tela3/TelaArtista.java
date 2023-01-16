package project.Tela3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TelaArtista implements ActionListener{
	private static JFrame frame;
	private static JButton botaoProcurar;
	private static JButton botaoAdd;
	private static JButton botaoDeletar;
	private static JLabel jlab;
	
	public TelaArtista() {
		frame = new JFrame("Tela Artista");
		frame.setSize(500, 400);
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(160,75,209,255));
		frame.add(jlab);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		botaoProcurar();
		botaoAdd();
		botaoDeletar();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void botaoProcurar() {
		botaoProcurar = new JButton("Procurar Artista");
		botaoProcurar.setBounds(80, 10, 300, 30);
		botaoProcurar.setBackground(new Color(160,75,209,255));
		botaoProcurar.setActionCommand("procurar artista");
		botaoProcurar.addActionListener(this);
		frame.add(botaoProcurar);
	}
	
	public void botaoAdd() {
		botaoAdd = new JButton("Add Artista");
		botaoAdd.setBounds(80, 60, 300, 30);
		botaoAdd.setBackground(new Color(160,75,209,255));
		botaoAdd.setActionCommand("add artista");
		botaoAdd.addActionListener(this);
		frame.add(botaoAdd);
	}
		
	public void botaoDeletar() {
		botaoDeletar = new JButton("Deletar Artista");
		botaoDeletar.setBounds(80, 110, 300, 30);
		botaoDeletar.setBackground(new Color(160,75,209,255));
		botaoDeletar.setActionCommand("deletar artista");
		botaoDeletar.addActionListener(this);
		frame.add(botaoDeletar);
	}
		
	public static void main(String[] args) {
		 new TelaArtista();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("procurar artista")) {
			jlab.setText("JList");
	}
		else if ("add artista" == ae.getActionCommand()) {
			new AddArtista();
			frame.dispose();
	}
		else {
			jlab.setText("JList");
		}
	}
}	