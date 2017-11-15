package loja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;


public class TelaPrincipal extends JFrame implements ActionListener {
	
	
	private static final long serialVersionUID = 8681608019602886086L;
	
	private JPanel panel = null;
	
	JButton buttonGerente = new JButton("Gerente");	
	
	JButton buttonAtendente = new JButton("Atendente");	
	JButton buttonEntrega = new JButton("Entrega");
	
	public TelaPrincipal() {
		this.setTitle("Tela Principal");
		this.setSize(400, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); //tira o botao de maximizar
		setContentPane();
		addComponents();
		
		
		
		
	}
	private void setContentPane() {
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		setContentPane(panel);
		
	}
	private void addComponents() {
		
		Dimension dim = new Dimension(120, 50);
		
		buttonGerente.setBounds(50, 50, 100, 60);
		buttonGerente.setPreferredSize(dim);
		buttonGerente.addActionListener(this);
		add(buttonGerente);
		
		buttonAtendente.setBounds(160, 50, 100, 60);
		buttonAtendente.setPreferredSize(dim);
		buttonAtendente.addActionListener(this);
		add(buttonAtendente);
		
		buttonEntrega.setBounds(270, 50, 100, 60);
		buttonEntrega.setPreferredSize(dim);
		buttonEntrega.addActionListener(this);
		add(buttonEntrega);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonGerente){
			
			TelaGerente telaGerente = new TelaGerente();
			telaGerente.setVisible(true);						
		}
		if(e.getSource() == buttonEntrega){
			TelaEntrega telaEntrega = new TelaEntrega();
			telaEntrega.setVisible(true);
		}
		if(e.getSource() == buttonAtendente){
			TelaPedido2 telaAtendente = new TelaPedido2();
			telaAtendente.setVisible(true);
		}
		
	}

}
