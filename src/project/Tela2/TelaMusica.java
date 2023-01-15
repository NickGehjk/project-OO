package project.Tela2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TelaMusica implements ActionListener{
	private static JFrame frame;
	private static JButton botaoProcurar;
	private static JButton botaoAdd;
	private static JButton botaoDeletar;
	private static JLabel jlab;
	
	public TelaMusica() {
		frame = new JFrame("Tela Musica");
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(255, 77, 0));
		frame.add(jlab);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botaoProcurar();
		botaoAdd();
		botaoDeletar();
	}
		
	public void botaoProcurar() {
		botaoProcurar = new JButton("procurar musica");
		botaoProcurar.setBounds(80, 10, 300, 30);
		botaoProcurar.setBackground(new Color(255, 77, 0));
		frame.add(botaoProcurar);
	}
	 
	public void botaoAdd() {
		botaoAdd = new JButton("add musica");
		botaoAdd.setBounds(80, 60, 300, 30);
		botaoAdd.setBackground(new Color(255, 77, 0));
		frame.add(botaoAdd);
	}
	
	public void botaoDeletar() {
		botaoDeletar = new JButton("deletar musica");
		botaoDeletar.setBounds(80, 110, 300, 30);
		botaoDeletar.setBounds(80, 110, 300, 30);
		botaoDeletar.setBackground(new Color(255, 77, 0));
		frame.add(botaoDeletar);
	}
		
		
	public static void main(String[] args) {
		TelaMusica exemplo = new TelaMusica();
		botaoProcurar.addActionListener(exemplo);
		botaoAdd.addActionListener(exemplo);
		botaoDeletar.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("procurar musica" == ae.getActionCommand()) {
			jlab.setText("JList");
	}
		else if ("add musica" == ae.getActionCommand()) {
			new AddMusica();
			frame.dispose();
	}
		else if ("deletar musica" == ae.getActionCommand()) {
			jlab.setText("JList");
		}
	}
}
	