package project.Tela2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import enumerators.Generos;

//import project.Tela1.TelaInicial;

public class AddMusica implements ActionListener {
	private static JFrame frame;
	private static JTextField textoNome;
	private static JTextField textoArtista;
	private static JTextField textoAno;
	private static JTextField textoDuracao;

	public AddMusica() {
		frame = new JFrame("Adicionar Música");
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(true);
		construir();
		frame.getContentPane().setBackground(new java.awt.Color(33,33,33,255));
	}

	public void construir() {
		nome();
		artista();
		ano();
		duracao();
		genero();
		textoNome();
		textoArtista();
		textoAno();
		textoDuracao();
		box();
		botaoAdd();
		botaoVoltar();
	}

	public void nome() {
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(90, 20, 300, 30);
		nome.setForeground(new Color(160, 75, 209, 255));
		frame.add(nome);
	}

	public void textoNome() {
		textoNome = new JTextField("");
		textoNome.setBounds(140, 20, 200, 30);
		frame.add(textoNome);
	}

	public void artista() {
		JLabel artista = new JLabel("Artista:");
		artista.setBounds(90, 70, 300, 30);
		artista.setForeground(new Color(160, 75, 209, 255));
		frame.add(artista);
	}

	public void textoArtista() {
		textoArtista = new JTextField("");
		textoArtista.setBounds(140, 70, 200, 30);
		frame.add(textoArtista);
	}

	public void ano() {
		JLabel ano = new JLabel("Ano:");
		ano.setBounds(90, 120, 300, 30);
		ano.setForeground(new Color(160, 75, 209, 255));
		frame.add(ano);
	}

	public void textoAno() {
		textoAno = new JTextField("");
		textoAno.setBounds(140, 120, 200, 30);
		frame.add(textoAno);
	}

	public void duracao() {
		JLabel duracao = new JLabel("Duração:");
		duracao.setBounds(90, 170, 300, 30);
		duracao.setForeground(new Color(160, 75, 209, 255));
		frame.add(duracao);
	}

	public void textoDuracao() {
		textoDuracao = new JTextField("");
		textoDuracao.setBounds(140, 170, 200, 30);
		frame.add(textoDuracao);
	}

	public void genero() {
		JLabel genero = new JLabel("Gênero musical:");
		genero.setBounds(90, 220, 300, 30);
		genero.setForeground(new Color(160, 75, 209, 255));
		frame.add(genero);
	}

	public void box() {
		String generos[] = { "rock", "pop", "trap", "rap", "funk", "jazz", "MPB", "forró", "gospel" };
		JComboBox<String> box = new JComboBox<>(generos);
		box.setBounds(140, 260, 150, 30);
		frame.add(box);

	}

	public void botaoAdd() {
		JButton botaoAdd = new JButton("Adicionar");
		botaoAdd.setBounds(90, 320, 250, 30);
		botaoAdd.setBackground(new Color(160, 75, 209, 255));
		botaoAdd.setActionCommand("Adicionar");
		botaoAdd.addActionListener(this);
		frame.add(botaoAdd);
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
		new AddMusica();
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Adicionar")) {
			// salva os dados
			String valorNome = textoNome.getText();
			String valorArt = textoArtista.getText();
			String valorAno = textoAno.getText(); 
			String valorDur = textoDuracao.getText();
			if(valorNome.isEmpty() || valorArt.isEmpty()
					|| valorAno.isEmpty() || valorDur.isEmpty()) {
				//label: dados incorretos
			} else {
				//label: dados corretos, musica adicionada
				new TelaMusica();
				frame.dispose();
			}
		}
		else if ("voltar" == ae.getActionCommand()) {
			new TelaMusica();
			frame.dispose();
		}
	}
}