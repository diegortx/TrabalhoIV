package loja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class TelaPedido extends JFrame{


	private static final long serialVersionUID = 6544211398750849328L;
	
	private JPanel panel = null;
	public TelaPedido() {
		this.setTitle("Regitro de pedidos");
		this.setSize(660, 400);
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
		//O componente JLabel ir� apresentar um texto na tela
		JLabel labelName = new JLabel();
		labelName.setText("Cliente: ");
		panel.add(labelName);
		
		//O componente JTextField � usado como entrada de texto
		JTextField textField = new JTextField();
		textField.setColumns(53);
		panel.add(textField);
		
		JLabel labelEmail = new JLabel("Email:");
		panel.add(labelEmail);
		
		JTextField textEmail = new JTextField();
		textEmail.setColumns(23);
		panel.add(textEmail);
		
		JLabel labelCpf = new JLabel("CPF:");
		panel.add(labelCpf);
		
		JTextField textCpf = new JTextField();
		textCpf.setColumns(23);
		panel.add(textCpf);
		
		// O componente JFormattedTextField � usado como entrada de texto mas com ele podemos definir um formato especifico
		JLabel labelDescription = new JLabel();
		labelDescription.setText("Produtos: ");
		panel.add(labelDescription);
		
		//O componente JTextArea � usado para entrada de texto onde o usu�rio pode informar mais de uma linha de texto
		JTextArea textArea = new JTextArea();
		textArea.setColumns(47);
		textArea.setRows(5);
		textArea.setLineWrap(true);
		
		//O componente JScrollPane ir� ser respons�vel por permitir ou n�o o scroll (na vertical e/ou na horizontal)
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane);		
		
		JLabel labelMonth = new JLabel();
		labelMonth.setText("Selecione o m�s: ");
		panel.add(labelMonth);
		
		//O componente JList � usado para exibir uma lista
		JList<String> list = new JList<String>();
		DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
		defaultListModel.addElement("Janeiro");
		defaultListModel.addElement("Fevereiro");
		defaultListModel.addElement("Mar�o");
		defaultListModel.addElement("Abril");
		defaultListModel.addElement("Maio");
		defaultListModel.addElement("Junho");
		defaultListModel.addElement("Julho");
		defaultListModel.addElement("Agosto");
		defaultListModel.addElement("Setembro");
		defaultListModel.addElement("Outubro");
		defaultListModel.addElement("Novembro");
		defaultListModel.addElement("Dezembro");
		
		
		list.setModel(defaultListModel);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.setVisibleRowCount(4);
        list.setPreferredSize(new Dimension(490, 111));
        
        JScrollPane scrollPane2 = new JScrollPane(list);
		scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane2);
		
		JLabel labelCourse = new JLabel();
		labelCourse.setText("N� da NFe: ");
		panel.add(labelCourse);
		
		//O componente JComboBox � usado para exibir uma lista de op��es para o usu�rio
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
		
		
		courseComboBox.setPreferredSize(new Dimension(490, 30));
		panel.add(courseComboBox);
		
			    
	    //O componente JButton � respons�vel por criar um bot�o
  		JButton button = new JButton();
  		button.setText("Registrar");
  		button.setPreferredSize(new Dimension(270, 30));
  		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
				TelaNota telaNota = new TelaNota();
				telaNota.setVisible(true);
			
				
			}
		});
  		
  		panel.add(button);
  		
	}
}
