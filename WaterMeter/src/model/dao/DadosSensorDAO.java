package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.bean.DadosSensor;

public class DadosSensorDAO {
	public DadosSensor getDadosSensor(String vldata) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.prepareStatement("SELECT litros FROM dadossensor WHERE "
					+ "vldate = ?");
			stmt.setString(1, vldata);
			rs = stmt.executeQuery();
			
			DadosSensor dadossensor = new DadosSensor();
			rs.first();
			dadossensor.setVldate(vldata);
			dadossensor.setLitros(rs.getString("litros"));
			return dadossensor;
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e);
			return null;
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}
	/*public List<DadosSensor>read(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		List<DadosSensor> DadosSensor1 = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("SELECT litros FROM dadossensor WHERE "
					+ "vldate = ?");
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				DadosSensor dadossensor = new DadosSensor();
				dadossensor.setLitros(rs.getFloat("litros"));
				DadosSensor1.add(dadossensor);
				}
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return DadosSensor1;
	}*/
}
