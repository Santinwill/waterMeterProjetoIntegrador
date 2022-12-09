package view;

import java.awt.EventQueue;

import javax.management.modelmbean.ModelMBeanOperationInfo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.bean.DadosSensor;
import model.dao.DadosSensorDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaDash extends JFrame {
	private JTable table;

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
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"data", "hora", "vaz\u00E3o"
			}
		));
		table.setBounds(23, 38, 608, 381);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("DATA");
		lblNewLabel.setBounds(23, 13, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblHora = new JLabel("HORA");
		lblHora.setBounds(230, 13, 46, 14);
		getContentPane().add(lblHora);
		
		JLabel lblLitrosHora = new JLabel("LITROS / HORA");
		lblLitrosHora.setBounds(429, 13, 84, 14);
		getContentPane().add(lblLitrosHora);
		
		readJtable();
	}
	
	public void readJtable() {
		// 8:45 https://www.youtube.com/watch?v=IWcV-9Lcu64&list=PLWd_VnthxxLcuMX7LluyGXGYNfWNAFvz2&index=4
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		DadosSensorDAO ddao = new DadosSensorDAO();
		
		for(DadosSensor d : ddao.read()) {
			modelo.addRow(new Object[] {
					d.getVldata(),
					d.getHora(),
					d.getLitros(),
			});
		}
		
		
	}
}
