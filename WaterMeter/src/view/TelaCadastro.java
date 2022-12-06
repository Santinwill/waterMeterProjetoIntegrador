package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.bean.Usuario;
import model.dao.UsuarioDAO;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textRua;
	private JTextField textBairro;
	private JTextField textNumero;
	private JTextField textCep;
	private JTextField textTelefone;
	private JTextField textCidade;
	private JTextField textUf;
	private JTextField textSenhaCadastro;
	private JTextField textUsuarioCadastro;
	private JTextField textCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setResizable(false);
		setTitle("Cadastro Usuario");
		setBounds(100, 100, 450, 553);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Completo:");
		lblNewLabel.setBounds(10, 11, 213, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(10, 31, 414, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 62, 213, 14);
		contentPane.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(10, 82, 196, 20);
		contentPane.add(textCpf);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 138, 79, 14);
		contentPane.add(lblRua);
		
		textRua = new JTextField();
		textRua.setColumns(10);
		textRua.setBounds(10, 158, 322, 20);
		contentPane.add(textRua);
				
		JLabel lblEndreo = new JLabel("Endreço");
		lblEndreo.setBounds(10, 113, 79, 14);
		contentPane.add(lblEndreo);
		
		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(10, 209, 242, 20);
		contentPane.add(textBairro);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 189, 79, 14);
		contentPane.add(lblBairro);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(342, 158, 82, 20);
		contentPane.add(textNumero);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(342, 138, 82, 14);
		contentPane.add(lblNumero);
		
		textCep = new JTextField();
		textCep.setColumns(10);
		textCep.setBounds(262, 209, 162, 20);
		contentPane.add(textCep);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(262, 189, 162, 14);
		contentPane.add(lblCep);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(228, 82, 196, 20);
		contentPane.add(textTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(228, 62, 196, 14);
		contentPane.add(lblTelefone);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(10, 260, 242, 20);
		contentPane.add(textCidade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 240, 79, 14);
		contentPane.add(lblCidade);
		
		textUf = new JTextField();
		textUf.setColumns(10);
		textUf.setBounds(262, 260, 162, 20);
		contentPane.add(textUf);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(262, 240, 162, 14);
		contentPane.add(lblUf);
		
		textSenhaCadastro = new JTextField();
		textSenhaCadastro.setColumns(10);
		textSenhaCadastro.setBounds(10, 391, 213, 20);
		contentPane.add(textSenhaCadastro);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 371, 79, 14);
		contentPane.add(lblSenha);
		
		textUsuarioCadastro = new JTextField();
		textUsuarioCadastro.setColumns(10);
		textUsuarioCadastro.setBounds(10, 340, 213, 20);
		contentPane.add(textUsuarioCadastro);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 320, 79, 14);
		contentPane.add(lblUsuario);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Li e concordo com todos os Termos de Uso e Políticas de Privacidade");
		chckbxNewCheckBox.setBounds(10, 430, 562, 49);
		contentPane.add(chckbxNewCheckBox);
	
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				UsuarioDAO dao = new UsuarioDAO();
				u.setNome(textNome.getText());
				u.setCpf(textCpf.getText());
				u.setTelefone(textTelefone.getText());
				u.setRua(textRua.getText());
				u.setNumero(textNumero.getText());
				u.setBairro(textBairro.getText());
				u.setCep(textCep.getText());
				u.setCidade(textCidade.getText());
				u.setLogin(textUsuarioCadastro.getText());
				u.setPassword(textSenhaCadastro.getText());
				dao.create(u);
			}
		});
		btnNewButton.setBounds(179, 480, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblInformaesDeLogin = new JLabel("Informações de Login:");
		lblInformaesDeLogin.setBounds(10, 295, 242, 14);
		contentPane.add(lblInformaesDeLogin);
				
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagem/watermeter_img_logo.png")));
		lblNewLabel_1.setBounds(-26, -49, 572, 631);
		contentPane.add(lblNewLabel_1);
	}
}
