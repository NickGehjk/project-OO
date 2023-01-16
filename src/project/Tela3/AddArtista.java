package project.Tela3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddArtista implements ActionListener {
	private static JFrame frame;

	String generos[] = { "rock", "pop", "trap", "rap", "funk", "jazz", "MPB", "forró", "gospel" };

	public AddArtista() {
		frame = new JFrame("Adicionar Artista");
		frame.setSize(500, 400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}

	public void construir() {
		nome();
		idade();
		nacionalidade();
		genero();
		box();
		textoNome();
		textoIdade();
		textoNacionalidade();
		add();
	}
	
	public void nome() {
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(50, 20, 300, 30);
		nome.setForeground(new Color(160, 75, 209, 255));
		frame.add(nome);
	}

	public void textoNome() {
		JTextField textoNome = new JTextField("");
		textoNome.setBounds(100, 20, 200, 30);
		frame.add(textoNome);
	}

	public void idade() {
		JLabel idade = new JLabel("Idade:");
		idade.setBounds(50, 70, 300, 30);
		idade.setForeground(new Color(160, 75, 209, 255));
		frame.add(idade);
	}

	public void textoIdade() {
		JTextField textoIdade = new JTextField("");
		textoIdade.setBounds(100, 70, 200, 30);
		frame.add(textoIdade);
	}

	public void nacionalidade() {
		JLabel nacionalidade = new JLabel("Nacionalidade:");
		nacionalidade.setBounds(50, 120, 300, 30);
		nacionalidade.setForeground(new Color(160, 75, 209, 255));
		frame.add(nacionalidade);
	}

	public void textoNacionalidade() {
		JTextField textoNacionalidade = new JTextField("");
		textoNacionalidade.setBounds(150, 120, 200, 30);
		frame.add(textoNacionalidade);
	}

	public void genero() {
		JLabel genero = new JLabel("Gênero musical:");
		genero.setBounds(50, 170, 300, 30);
		genero.setForeground(new Color(160, 75, 209, 255));
		frame.add(genero);
	}

	public void box() {
		JComboBox<String> box = new JComboBox<>(generos);
		box.setBounds(90, 220, 150, 30);
		frame.add(box);
	}

	public void add() {
		JButton add = new JButton("Adicionar");
		add.setBounds(75, 270, 250, 30);
		add.setBackground(new Color(160, 75, 209, 255));
		frame.add(add);
	}

	public static void main(String[] args) {
		 new AddArtista();
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			// salva os dados
		}
	}

}