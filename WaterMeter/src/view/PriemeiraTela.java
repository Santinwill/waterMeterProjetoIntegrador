package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.dao.TestUsuarioDAO;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;

public class PriemeiraTela {

	private JFrame frmAcesso;
	private JTextField textLogin;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PriemeiraTela window = new PriemeiraTela();
					window.frmAcesso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PriemeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAcesso = new JFrame();
		frmAcesso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcesso.setResizable(false);
		frmAcesso.setTitle("Acesso");
		frmAcesso.setBounds(100, 100, 450, 300);
		frmAcesso.setLocationRelativeTo(null);
		frmAcesso.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro().setVisible(true);					
			}
		});
		btnNewButton_1.setBounds(115, 206, 89, 23);
		frmAcesso.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(115, 54, 46, 14);
		frmAcesso.getContentPane().add(lblNewLabel);
		
		textLogin = new JTextField();
		textLogin.setBounds(115, 79, 211, 20);
		frmAcesso.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(115, 118, 46, 14);
		frmAcesso.getContentPane().add(lblSenha);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(115, 143, 211, 20);
		frmAcesso.getContentPane().add(textPassword);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestUsuarioDAO dao = new TestUsuarioDAO();
				
				if(dao.checkLogin(textLogin.getText(), textPassword.getText())) {
					new TelaDash().setVisible(true);
					//this.dispose(); olhar como fecha tela
				}else {
					JOptionPane.showMessageDialog(null, "Acesso Negado!", "Erro", JOptionPane.ERROR_MESSAGE);	
				}
				
				
				/*if(textLogin.getText().equals("usuario") && textPassword.getText().equals("1234")) {
					JOptionPane.showMessageDialog(null, "Bem vindo!","", JOptionPane.NO_OPTION);
				}else {
					JOptionPane.showMessageDialog(null, "Acesso Negado!", "Erro", JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		btnNewButton.setBounds(237, 206, 89, 23);
		frmAcesso.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(PriemeiraTela.class.getResource("/imagem/watermeter_img_logo.png")));
		lblNewLabel_1.setBounds(-42, -100, 587, 450);
		frmAcesso.getContentPane().add(lblNewLabel_1);
	}
}

