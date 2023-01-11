package project;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExPlaylist implements ListSelectionListener{
	private static JFrame f;

	private static JLabel jlab;
	private static JLabel jlab1;
	
	private static JList<String> jlst;
	
	String generos[] = {"caneta azul", "eu vou deixar de ser besta", 
						"olha se vc nn me ama", "maura", "Level of Concern",
						"ela é muito uma vagabunda", "la ele", "girl in red"};
	
	public ExPlaylist() {
		f = new JFrame("Top Hits");
		
		jlab = new JLabel("Top Hits");
		jlab1 = new JLabel("2023");
		
		jlst = new JList<String>(generos);
		
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jlst.addListSelectionListener(this);
		
		f.setSize(500, 650);
		
		jlab.setBounds(150, 20, 300, 30);
		jlab1.setBounds(170, 60, 300, 30);
		jlst.setBounds(100, 135, 300, 250);
		
		f.add(jlab);
		f.add(jlab1);
		f.add(jlst);
		
		f.setLayout(null);
		f.setVisible(true);
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
		