package cl.fuentes.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MysqlConn {

	
	 	private Connection connect = null;
	    private Statement statement = null;
	    private PreparedStatement preparedStatement = null;
	    private ResultSet resultSet = null;

	    public MysqlConn() throws Exception{
	    	open();
	    }
	    
	    
	    public void open() throws Exception{
	    	try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connect = DriverManager.getConnection("jdbc:mysql://localhost/archivos?user=usuarchivo&password=passarchivo");
			} catch (Exception e) {
				throw e;
			}
	    }

	    public void guardarArchivo(Archivo archivo) throws Exception{
	    	try {
	    			preparedStatement = connect.prepareStatement("insert into archivo(rutaAbsoluta, nombreExtension, nombre, extension, contenido) values (?, ?, ?, ?, ?)");
		            preparedStatement.setString(1, archivo.getRutaAbsoluta());
		            preparedStatement.setString(2, archivo.getNombreExtension());
		            preparedStatement.setString(3, archivo.getNombre());
		            preparedStatement.setString(4, archivo.getExtension());
		            preparedStatement.setBytes(5, archivo.getContenido());
		            preparedStatement.executeUpdate();
			} catch (SQLException e) {
				throw e;
			}finally{
				
			}
	    }
	    
	    private void close() {
	        try {
	            if (resultSet != null) {
	                resultSet.close();
	            }
	            if (statement != null) {
	                statement.close();
	            }
	            if (connect != null) {
	                connect.close();
	            }
	        } catch (Exception e) {
	        }
	    }
	
}
