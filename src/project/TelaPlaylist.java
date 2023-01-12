package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class TelaPlaylist implements ActionListener{
	private static JFrame frame;
	private static JButton but1;
	private static JButton but2;
	private static JButton but3;
	private static JLabel jlab;
	
	public TelaPlaylist() {
		frame = new JFrame("Tela Playlist");
		but1 = new JButton("procurar playlist");
		but2 = new JButton("add playlist");
		but3 = new JButton("deletar playlist");
		
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		//frame.getContentPane().setBackground(new Color(255, 77, 0));

		but1.setBounds(80, 10, 300, 30);
		but2.setBounds(80, 60, 300, 30);
		but3.setBounds(80, 110, 300, 30);
		but1.setBackground(new Color(255, 77, 0));
		but2.setBackground(new Color(255, 77, 0));
		but3.setBackground(new Color(255, 77, 0));
		//but1.setBackground(Color.black);
		//but2.setBackground(Color.black);
		//but3.setBackground(Color.black);
		//but1.setForeground(new Color(255, 77, 0));
		//but2.setForeground(new Color(255, 77, 0));
		//but3.setForeground(new Color(255, 77, 0));
		
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		
		jlab = new JLabel("Pressione um botão.");
		jlab.setSize(300, 375);
		jlab.setForeground(new Color(255, 77, 0));
		
		frame.add(jlab);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		TelaPlaylist exemplo = new TelaPlaylist();
		but1.addActionListener(exemplo);
		but2.addActionListener(exemplo);
		but3.addActionListener(exemplo);

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("procurar playlist")) {
			jlab.setText("JList");
	}
		else if (ae.getActionCommand().equals("add playlist")) {
			jlab.setText("vai pra pagina add playlist");
	}
		else {
			jlab.setText("JList");
		}
	}
}	