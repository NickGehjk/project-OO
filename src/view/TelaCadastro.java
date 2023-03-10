package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import enumerators.Generos;

public class TelaCadastro implements ActionListener {
	private static JFrame frame;
	private static JTextField textoNome;
	private static JTextField textoIdade;
	private static JTextField textoNacionalidade;

	private static JButton add;
	private static JLabel valid;

	private static String valorNome;
	String valorIda;
	String valorNac;

	//private static JLabel ex;
	

	public TelaCadastro() {
		frame = new JFrame("Tela Cadastro");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		textoNome();
		textoIdade();
		textoNacionalidade();
		add();
		valid();
		botaoVoltar();
	}
	
	public void nome() {
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(90, 100, 300, 30);
		nome.setForeground(new Color(160, 75, 209, 255));
		frame.add(nome);
		//ex = new JLabel("test");
	}

	public void textoNome() {
		textoNome = new JTextField("");
		textoNome.setBounds(185, 100, 200, 30);
		frame.add(textoNome);
	}

	public void idade() {
		JLabel idade = new JLabel("Idade:");
		idade.setBounds(90, 150, 300, 30);
		idade.setForeground(new Color(160, 75, 209, 255));
		frame.add(idade);
	}

	public void textoIdade() {
		textoIdade = new JTextField("");
		textoIdade.setBounds(185, 150, 200, 30);
		frame.add(textoIdade);
	}

	public void nacionalidade() {
		JLabel nacionalidade = new JLabel("Nacionalidade:");
		nacionalidade.setBounds(90, 200, 300, 30);
		nacionalidade.setForeground(new Color(160, 75, 209, 255));
		frame.add(nacionalidade);
	}

	public void textoNacionalidade() {
		textoNacionalidade = new JTextField("");
		textoNacionalidade.setBounds(185, 200, 200, 30);
		frame.add(textoNacionalidade);
	}

	public void add() {
		add = new JButton("Cadastrar");
		add.setBounds(110, 360, 250, 30);
		add.setBackground(new Color(160, 75, 209, 255));
		//add.setActionCommand("Adicionar");
		add.addActionListener(this);
		frame.add(add);
	}

	public void valid() {
		valid = new JLabel("Coloque os seus dados.");
		valid.setBounds(160, 400, 300, 30);
		valid.setForeground(new Color(160,75,209,255));
		frame.add(valid);
	}

	public void botaoVoltar() {
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(390, 520, 80, 30);
		botaoVoltar.setBackground(new Color(160,75,209,255));
		botaoVoltar.setActionCommand("voltar");
		botaoVoltar.addActionListener(this);
		frame.add(botaoVoltar);
	}

	public static void main(String[] args) {
		 new TelaCadastro();
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Cadastrar")) {
			// salva os dados
			valorNome = textoNome.getText();
			valorIda = textoIdade.getText();
			valorNac = textoNacionalidade.getText();
			if(valorNome.isEmpty() || valorIda.isEmpty()
					|| valorNac.isEmpty()) {
				valid.setText("Dados incorretos.");
			} else {
				valid.setText("Cadastrado com Sucesso.");
				//valid.setText(valorNome);
				//new TelaArtista();
				//frame.dispose();
			}
		}
		else if ("voltar" == ae.getActionCommand()) {
			new TelaInicial();
			frame.dispose();
		}
	}
}
