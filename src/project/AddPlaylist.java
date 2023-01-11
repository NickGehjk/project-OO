package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddPlaylist implements ActionListener{
	private static JFrame f;

	private static JLabel jlab;
	private static JTextField c;
	private static JLabel jlab1;
	private static JTextField d;
	
	private static JButton cri;
	
	public AddPlaylist() {
		f = new JFrame("Adicionar Playlist");
		
		jlab = new JLabel("Nome:");
		c = new JTextField("");
		jlab1 = new JLabel("Ano:");
		d = new JTextField("");
		
		cri = new JButton("Adicionar");
		
		f.setSize(500, 650);
		
		jlab.setBounds(50, 20, 300, 30);
		c.setBounds(100, 20, 200, 30);
		jlab1.setBounds(50, 70, 300, 30);
		d.setBounds(100, 70, 200, 30);
		
		cri.setBounds(75, 120, 250, 30);
		
		f.add(jlab);
		f.add(c);
		f.add(jlab1);
		f.add(d);
		f.add(cri);
		
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AddPlaylist exemplo = new AddPlaylist();
		cri.addActionListener(exemplo);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		/*if (ae.getActionCommand().equals("Adicionar")) {
			jlab.setText("JList");
	}
		else {
			jlab.setText("JList");
		}*/
	}
	
}
		