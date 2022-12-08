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
	public List<DadosSensor>read(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		List<DadosSensor> DadosSensor1 = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("SELECT * FROM dadossensor"); //WHERE vldata = '2022-11-27'
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				DadosSensor dadossensor = new DadosSensor();
				/*dadossensor.setId_sensor(rs.getInt("id_sensor"));
				dadossensor.setVldate(rs.getString("vldata"));
				dadossensor.setHora(rs.getString("hora"));*/
				dadossensor.setLitros(rs.getFloat("litros"));
				DadosSensor1.add(dadossensor);
				}
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return DadosSensor1;
	}
}
