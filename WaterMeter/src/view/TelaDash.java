package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaDash extends JFrame {

	private JPanel contentPane;
	private JTextField textData1;
	private JTextField textData2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDash frame = new TelaDash();
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
	public TelaDash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 480);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data:");
		lblNewLabel.setBounds(69, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data:");
		lblNewLabel_1.setBounds(353, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textData1 = new JTextField();
		textData1.setBounds(101, 37, 158, 20);
		contentPane.add(textData1);
		textData1.setColumns(10);
		
		textData2 = new JTextField();
		textData2.setColumns(10);
		textData2.setBounds(384, 37, 158, 20);
		contentPane.add(textData2);
	}
}
