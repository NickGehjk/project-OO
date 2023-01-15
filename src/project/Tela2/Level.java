package project.Tela2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Level implements ActionListener{
	private static JFrame frame;
	private static JButton botaoEditar;
	private static JButton botaoDeletar;
	private static JButton botaoSalvar;
	private static JLabel Nome;
	private static JLabel NomeMusica;
	private static JLabel Ano;
	private static JLabel Duracao;
	private static JLabel Genero;
	
	private static JTextArea letra;
	
	public Level() {
		frame = new JFrame("Level of Concern");
		frame.setSize(500, 600);
		frame.getContentPane().setBackground(Color.BLACK);
		Nome = new JLabel("Level of Concern");
		NomeMusica = new JLabel("Twenty one Pilots");
		Ano = new JLabel("2020");
		Duracao = new JLabel("3:52");
		Genero = new JLabel("rock");
		
		/*Cause I told you my level of concern\r\n"
		+ "But you walked by like you never heard\r\n"
		+ "and you could bring down my level of concern\r\n"
		+ "Just need you to tell me we're alright\r\n"
		+ "Tell me we're okay, yeah*/
		
		letra = new JTextArea("");
		
		letra.setLineWrap(true);
		letra.setEditable(false);

		botaoEditar = new JButton("editar letra");
		botaoDeletar = new JButton("deletar letra");
		botaoSalvar = new JButton("salvar");
		
		Nome.setBounds(180, 10, 300, 30);
		NomeMusica.setBounds(50, 50, 300, 30);
		Ano.setBounds(200, 50, 300, 30);
		Duracao.setBounds(300, 50, 300, 30);
		Genero.setBounds(400, 50, 300, 30);
		Nome.setForeground(new Color(255, 77, 0));
		NomeMusica.setForeground(new Color(255, 77, 0));
		Ano.setForeground(new Color(255, 77, 0));
		Duracao.setForeground(new Color(255, 77, 0));
		Genero.setForeground(new Color(255, 77, 0));
		
		letra.setBounds(50, 90, 400, 300);
		
		botaoEditar.setBounds(90, 400, 300, 30);
		botaoDeletar.setBounds(90, 450, 300, 30);
		botaoSalvar.setBounds(90, 500, 300, 30);
		botaoEditar.setBackground(new Color(255, 77, 0));
		botaoDeletar.setBackground(new Color(255, 77, 0));
		botaoSalvar.setBackground(new Color(255, 77, 0));
		
		frame.add(Nome);
		frame.add(NomeMusica);
		frame.add(Ano);
		frame.add(Duracao);
		frame.add(Genero);
		
		frame.add(letra);
		
		frame.add(botaoEditar);
		frame.add(botaoDeletar);
		frame.add(botaoSalvar);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Level exemplo = new Level();
		botaoEditar.addActionListener(exemplo);
		botaoDeletar.addActionListener(exemplo);
		botaoSalvar.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("editar letra")) {
			letra.setEditable(true);
	}
		else if (ae.getActionCommand().equals("deletar letra")) {
			letra.setText("");
	}
		else {
			letra.setEditable(false);
		}
	}
}	