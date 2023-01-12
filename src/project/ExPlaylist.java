package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExPlaylist implements ListSelectionListener{
	private static JFrame frame;

	private static JLabel jlab;
	private static JLabel jlab1;
	private static JLabel jlab2;
	
	private static JList<String> jlst;
	
	String musicas[] = {"caneta azul", "eu vou deixar de ser besta", 
						"olha se vc nn me ama", "maura", "la ele"};
	
	public ExPlaylist() {
		frame = new JFrame("Top Hits");
		
		jlab = new JLabel("Top Hits");
		jlab1 = new JLabel("2023");
		jlab2 = new JLabel("Músicas:");
		
		jlst = new JList<String>(musicas);
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlst.addListSelectionListener(this);
		
		frame.setSize(500, 650);
		frame.getContentPane().setBackground(Color.BLACK);
		
		jlab.setBounds(190, 20, 300, 30);
		jlab1.setBounds(200, 60, 300, 30);
		jlab2.setBounds(80, 90, 300, 30);
		jlst.setBounds(80, 120, 300, 250);
		jlab.setForeground(new Color(255, 77, 0));
		jlab1.setForeground(new Color(255, 77, 0));
		jlab2.setForeground(new Color(255, 77, 0));
		
		frame.add(jlab);
		frame.add(jlab1);
		frame.add(jlab2);
		frame.add(jlst);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		ExPlaylist exemplo = new ExPlaylist();
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
		