package project;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import enumerators.Generos;

public class AddMusica implements ListSelectionListener{
	private static JFrame f;

	private static JLabel jlab;
	private static JTextField c;
	private static JLabel jlab1;
	private static JTextField d;
	private static JLabel jlab2;
	private static JTextField e;
	private static JLabel jlab4;
	private static JTextField g;
	
	private static JButton cri;
	
	private static JLabel jlab3;
	private static JList<String> jlst;
	
	String generos[] = {"rock", "pop", "trap", "rap", "funk",
						"jazz", "MPB", "forró", "gospel"};
	
	public AddMusica() {
		f = new JFrame("Adicionar Música");
		
		jlab = new JLabel("Nome:");
		c = new JTextField("");
		jlab1 = new JLabel("Artista:");
		d = new JTextField("");
		jlab2 = new JLabel("Ano:");
		e = new JTextField("");
		jlab4 = new JLabel("Duração:");
		g = new JTextField("");
		
		
		jlab3 = new JLabel("Gênero musical:");
		
		jlst = new JList<String>(generos);
	
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jlst.addListSelectionListener(this);
		
		cri = new JButton("Adicionar");
		
		f.setSize(500, 650);
		
		jlab.setBounds(50, 20, 300, 30);
		c.setBounds(100, 20, 200, 30);
		
		jlab1.setBounds(50, 70, 300, 30);
		d.setBounds(100, 70, 200, 30);
		
		jlab2.setBounds(50, 120, 300, 30);
		e.setBounds(100, 120, 200, 30);
		
		jlab4.setBounds(50, 170, 300, 30);
		g.setBounds(110, 170, 200, 30);
		
		jlab3.setBounds(50, 220, 300, 30);
		jlst.setBounds(120, 270, 130, 169);
		
		cri.setBounds(75, 500, 250, 30);
		
		f.add(jlab);
		f.add(c);
		f.add(jlab1);
		f.add(d);
		f.add(jlab2);
		f.add(e);
		f.add(jlab4);
		f.add(g);
		f.add(jlab3);
		f.add(jlst);
		f.add(cri);
		
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AddMusica exemplo = new AddMusica();
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
		