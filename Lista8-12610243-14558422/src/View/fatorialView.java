package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Fatorial;
import Controller.InvalidNumberException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

public class fatorialView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Texto_numero;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fatorialView frame = new fatorialView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	public fatorialView(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 36, 400, 153);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Fatorial");
		lblNewLabel.setBounds(193, 11, 45, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		
		Texto_numero = new JTextField();
		Texto_numero.setBounds(144, 84, 145, 22);
		panel.add(Texto_numero);
		Texto_numero.setFont(new Font("Arial", Font.PLAIN, 13));
		Texto_numero.setColumns(10);
		
		btnNewButton = new JButton("Iniciar cálculo");
		btnNewButton.setBounds(144, 117, 145, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Coloque o número que deseja encontrar o fatorial na caixa");
		lblNewLabel_1.setBounds(32, 38, 368, 35);
		panel.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e){
		        try {
		            int number = Integer.parseInt(Texto_numero.getText());
		            JOptionPane.showMessageDialog(null, Fatorial.resultado(Texto_numero.getText()));
		        } catch (NumberFormatException e1) {
		            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
		        } catch (InvalidNumberException e1) {
		            JOptionPane.showMessageDialog(null, "Coloque números positivos");
		        }
			}
		});
	}
	public JTextField getNumberinput() {
		return Texto_numero;
	}
	public JButton getButton() {
		return btnNewButton;
	}
}

