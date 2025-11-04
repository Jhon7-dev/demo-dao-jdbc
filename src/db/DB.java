package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB { // criar alguns métodos estáticos para **CONECTAR E DESCONECTAR COM O BANCO DE
					// DADOS
	/*
	 * 1º PASSO: CRIAR UM MÉTODO AUX PARA CARREGAR AS PROPRIEDADES DO ARQUIVO
	 * "db.properties"
	 */
	/* Método private, porque só vai ser utilizado dentro dessa classe. */
	
	private static Properties loadProperties() {
		/*
		 * A implementação desse "try", eu vou instnaciar esse objeto do tipo properties
		 * chamado props
		 */
		/* props.load(fs) -> o load faz a leitura do arquivo apontado pelo arquivo fs */
		
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	/*
	 * 2º PASSO: CRIAR UM objeto private static Connection conn, o Connection vai
	 * ser o objeto de conexão com o banco de dados do jdbc
	 */

	/* Criar um método para conectar com o banco de dados */
	/*
	 * Esse objeto ele vai retornar o meu objeto conn que está declarado,mas se
	 * estiver valendo nulo, eu vou ter que fazer um cód para conectar com o banco
	 */
	
	private static Connection conn = null;
	
	public static  Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url,props);
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}

	
/*3º PASSO: Método para fechar o banco*/
	
	
	public static void closeConnection() {
		if(conn!= null) {
			try {
				conn.close();
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	/*Adicionar métodos para fechar as classes externas*/
	public static void closeStatement(Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	public static void closeResultSet(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}	
}
