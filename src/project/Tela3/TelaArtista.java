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
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(255, 77, 0));
		frame.add(jlab);
		frame.setLayout(null);
		frame.setVisible(true);
		botaoProcurar();
		botaoAdd();
		botaoDeletar();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void botaoProcurar() {
		botaoProcurar = new JButton("procurar artista");
		botaoProcurar.setBounds(80, 10, 300, 30);
		botaoProcurar.setBackground(new Color(255, 77, 0));
		frame.add(botaoProcurar);
	}
	
	public void botaoAdd() {
		botaoAdd = new JButton("add artista");
		botaoAdd.setBounds(80, 60, 300, 30);
		botaoAdd.setBackground(new Color(255, 77, 0));
		frame.add(botaoAdd);
	}
		
	public void botaoDeletar() {
		botaoDeletar = new JButton("deletar artista");
		botaoDeletar.setBounds(80, 110, 300, 30);
		botaoDeletar.setBackground(new Color(255, 77, 0));
		frame.add(botaoDeletar);
	}
		
		

	public static void main(String[] args) {
		TelaArtista exemplo = new TelaArtista();
		botaoProcurar.addActionListener(exemplo);
		botaoAdd.addActionListener(exemplo);
		botaoDeletar.addActionListener(exemplo);

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