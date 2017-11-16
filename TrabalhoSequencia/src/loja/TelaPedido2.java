package loja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPedido2 extends JFrame implements ActionListener{
	
	private JPanel panel = null;
	
//	JButton gerarNota = new JButton("Nota Fiscal");
	JButton registrarPedido = new JButton("Pedido");
	
	public TelaPedido2() {
		this.setTitle("Acesso Atendente");
		this.setSize(280,100);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane();
		addComponents();
	}
	
	private void setContentPane() {
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		setContentPane(panel);
	}
	
	private void addComponents() {
		Dimension dim = new Dimension(100, 50);
		
		registrarPedido.setPreferredSize(dim);
		
		registrarPedido.addActionListener(this);
		panel.add(registrarPedido);
		
		/*gerarNota.setPreferredSize(dim);
		gerarNota.addActionListener(this);
		panel.add(gerarNota);
		*/
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == registrarPedido){
		
			TelaPedido telaPedido = new TelaPedido();
			telaPedido.setVisible(true);
		
		}
			
			
	}
}


