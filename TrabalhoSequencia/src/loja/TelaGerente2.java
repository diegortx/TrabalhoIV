package loja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class TelaGerente2 extends JFrame {
	

	private static final long serialVersionUID = 8463364876518097040L;

	private JPanel panel = null;
	JComboBox<String> courseComboBox;
	
	
	public TelaGerente2() {
		this.setTitle("Regitro de pedidos");
		this.setSize(320, 150);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane();
		addComponents();
	}

	private void setContentPane() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		this.setContentPane(panel);
	}

	private void addComponents() {
  				
		JLabel labelCourse = new JLabel();
		labelCourse.setText("Nº da NFe: ");
		panel.add(labelCourse);
		
		//O componente JComboBox é usado para exibir uma lista de opções para o usuário
		JComboBox<String> courseComboBox = new JComboBox<String>();
		courseComboBox.addItem("001");
		courseComboBox.addItem("002");
		courseComboBox.addItem("003");
		courseComboBox.addItem("004");
		courseComboBox.addItem("005");
		courseComboBox.addItem("006");
		courseComboBox.addItem("007");
		courseComboBox.addItem("008");
		courseComboBox.addItem("009");
		courseComboBox.addItem("010");
		courseComboBox.addItem("011");
		
		
		courseComboBox.setPreferredSize(new Dimension(200, 30));
		panel.add(courseComboBox);
		
		JButton button2 = new JButton();
		button2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");
				
			}
		});
  		button2.setText("Emitir Relatório !");
  		button2.setPreferredSize(new Dimension(150, 30));
  		panel.add(button2);
}

	public JComboBox<String> getCourseComboBox() {
		return courseComboBox;
	}
	
}
