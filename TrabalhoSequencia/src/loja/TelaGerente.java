package loja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


import javax.swing.JTextField;


public class TelaGerente extends JFrame implements ActionListener{
	
	static final long serialVersionUID = -1204293411061180422L;
	
	private JPanel panel = null;

	JButton buttonOk = new JButton("Ok");
	JButton buttonCancel = new JButton("Cancelar");
	
	public TelaGerente() {
		this.setTitle("Acesso Gerência");
		this.setSize(280,180);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane();
		addComponents();
	}

	private void setContentPane() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		setContentPane(panel);
		
	}
	private void addComponents() {
		Dimension dim = new Dimension(90, 30);
		
		
		JLabel userLabel = new JLabel("Usuario: ");
		panel.add(userLabel);
		
		JTextField userField = new JTextField();
		userField.setColumns(20);
		panel.add(userField);
		
		JLabel senhaLabel = new JLabel("Senha: ");
		panel.add(senhaLabel);
		
		JPasswordField senhaField = new JPasswordField();
		senhaField.setColumns(20);
		panel.add(senhaField);
		
		
		
		
		buttonOk.setPreferredSize(dim);
		buttonOk.addActionListener(this);
		panel.add(buttonOk);
		
		buttonCancel.setPreferredSize(dim);
		buttonCancel.addActionListener(this);
		panel.add(buttonCancel);
		
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonOk){
			JOptionPane.showMessageDialog(null, "Logado com sucesso!");
			TelaGerente2 telaGerente2 = new TelaGerente2();
			telaGerente2.setVisible(true);
			
		}
		if(e.getSource() == buttonCancel){
		
		
		}
			
			
		
		
		
	}

	
}
