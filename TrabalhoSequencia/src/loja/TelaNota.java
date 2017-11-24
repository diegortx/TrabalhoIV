package loja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class TelaNota extends JFrame implements ActionListener {

	private JPanel panel = null;
	JTextField textField;
	JTextField textEmail;
	JTextField textCpf;
	JComboBox<String> courseComboBox;

	public TelaNota() {
		this.setTitle("Emitir Notas Fiscais");
		this.setSize(660, 200);
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
		// O componente JLabel irá apresentar um texto na tela
		JLabel labelName = new JLabel();
		labelName.setText("Cliente: ");
		panel.add(labelName);

		// O componente JTextField é usado como entrada de texto
		textField = new JTextField();
		textField.setColumns(53);
		panel.add(textField);

		JLabel labelEmail = new JLabel("Email:");
		panel.add(labelEmail);

		textEmail = new JTextField();
		textEmail.setColumns(23);
		panel.add(textEmail);

		JLabel labelCpf = new JLabel("CPF:");
		panel.add(labelCpf);

		textCpf = new JTextField();
		textCpf.setColumns(23);
		panel.add(textCpf);

		// O componente JList é usado para exibir uma

		JLabel labelCourse = new JLabel();
		labelCourse.setText("Nº da NFe: ");
		panel.add(labelCourse);

		// O componente JComboBox é usado para exibir uma lista de opções para o
		// usuário
		courseComboBox = new JComboBox<String>();
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

		// O componente JButton é responsável por criar um botão
		JButton button = new JButton();
		button.setText("Emitir nota fiscal");
		button.setPreferredSize(new Dimension(270, 30));
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Nota Fiscal emitida com sucesso !");

			}
		});

		panel.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public JTextField getTextCpf() {
		return textCpf;
	}

	public JComboBox<String> getCourseComboBox() {
		return courseComboBox;
	}
	
	
}
