package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.bean.Usuario;

public class UsuarioDAO {
	public void create(Usuario u) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO usuario"
					+ "(nome, cpf, login, password, telefone, rua,"
					+ " numero, bairro, cep, cidade)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, u.getNome());
			stmt.setString(2, u.getCpf());
			stmt.setString(3, u.getLogin());
			stmt.setString(4, u.getPassword());
			stmt.setString(5, u.getTelefone());
			stmt.setString(6, u.getRua());
			stmt.setString(7, u.getNumero());
			stmt.setString(8, u.getBairro());
			stmt.setString(9, u.getCep());
			stmt.setString(10, u.getCidade());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar!" + e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
}
