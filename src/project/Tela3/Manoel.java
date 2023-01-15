package project.Tela3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Manoel implements ListSelectionListener{
	private static JFrame frame;

	private static JLabel jlab;
	private static JLabel jlab1;
	private static JLabel jlab2;
	private static JLabel jlab3;
	private static JLabel jlab4;
	
	private static JList<String> jlst;
	
	String musicas[] = {"caneta azul", "eu vou deixar de ser besta", 
	"olha se vc nn me ama", "maura", "la ele"};
	
	public Manoel() {
		frame = new JFrame("Manoel Gome");
		
		jlab = new JLabel("Joab Manoel Gomes Caneta Azul");
		jlab1 = new JLabel("53 anos");
		jlab2 = new JLabel("Brasileiro");
		jlab3 = new JLabel("forró");
		jlab4 = new JLabel("Músicas:");
		
		jlst = new JList<String>(musicas);
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlst.addListSelectionListener(this);
		
		frame.setSize(500, 650);
		frame.getContentPane().setBackground(Color.BLACK);
		
		jlab.setBounds(150, 20, 300, 30);
		jlab1.setBounds(70, 70, 300, 30);
		jlab2.setBounds(190, 70, 300, 30);
		jlab3.setBounds(340, 70, 300, 30);
		jlab4.setBounds(80, 110, 300, 30);
		jlst.setBounds(80, 140, 300, 250);
		jlab.setForeground(new Color(255, 77, 0));
		jlab1.setForeground(new Color(255, 77, 0));
		jlab2.setForeground(new Color(255, 77, 0));
		jlab3.setForeground(new Color(255, 77, 0));
		jlab4.setForeground(new Color(255, 77, 0));
		
		frame.add(jlab);
		frame.add(jlab1);
		frame.add(jlab2);
		frame.add(jlab3);
		frame.add(jlab4);
		frame.add(jlst);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Manoel exemplo = new Manoel();
		jlst.addListSelectionListener(exemplo);
		
	}
	
	public void valueChanged(ListSelectionEvent le) {  
		// Get the index of the changed item. 
		//int idx = jlst.getSelectedIndex(); 

		// Mostra o item, caso algum seja selecionada 
		/*if(idx != -1) 
			jlab4.setText("Voce selecionou o nome: " + generos[idx]); 
		// Se nenhum item é selecionado, imprime a mesma mensagem de seleção
		else
			jlab4.setText("Por favor, escolha um nome"); */
	}
	
}
		