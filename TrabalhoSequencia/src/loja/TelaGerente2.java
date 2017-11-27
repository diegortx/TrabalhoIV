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
		courseComboBox = new JComboBox<String>();
		courseComboBox.addItem("1");
		courseComboBox.addItem("2");
		courseComboBox.addItem("3");
		courseComboBox.addItem("4");
		courseComboBox.addItem("5");
		courseComboBox.addItem("6");
		courseComboBox.addItem("7");
		courseComboBox.addItem("8");
		courseComboBox.addItem("9");
		courseComboBox.addItem("10");
		courseComboBox.addItem("11");
		
		
		courseComboBox.setPreferredSize(new Dimension(200, 30));
		panel.add(courseComboBox);
		
		
		
		
		JButton button2 = new JButton();
		button2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso NUMERO :  " + (getCourseComboBox().getSelectedIndex()+1) );
				
				
				
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
