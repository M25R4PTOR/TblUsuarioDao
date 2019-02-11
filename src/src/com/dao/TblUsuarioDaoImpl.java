package src.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import src.com.idao.ITblUsuarioDao;
import src.com.model.TblUsuario;

public class TblUsuarioDaoImpl implements ITblUsuarioDao {

	List<TblUsuario> usuarios;

	public TblUsuarioDaoImpl() {
		usuarios = new ArrayList<>();
		TblUsuario usuario1 = new TblUsuario();
		TblUsuario usuario2 = new TblUsuario();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
	}

	@Override
	public Connection conectarBaseDatos() {
		try {
			try {
				// Se registra el Driver de MySQL
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException ex) {
				System.out.println("Error al registrar el driver de MySQL: " + ex);
			}
			Connection connection = null;

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");

			boolean valid = connection.isValid(5000);
			System.out.println(valid ? "TEST OK" : "TEST FAIL");

			return connection;

		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
		return null;// Estara bien¿?
	}

	// Ejercicios01
	@Override
	public void listarNombresUsuario(Connection conn) throws SQLException {
		String sql = "Select nombre FROM tblusuarios";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String nombre = result.getString("nombre");
			count++;
			System.out.println(count + " " + nombre);
		}
	}

	@Override
	public void saldoMaximoMujer(Connection conn) throws SQLException {
		String sql = "Select MAX(saldo) FROM tblusuarios WHERE sexo = 'M'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String saldo = result.getString("max(saldo)");
			System.out.println("Saldo máximo de una mujer = " + saldo);
		}

	}

	@Override
	public void nombreYTelefonoUsuariosNokiaBlackberryOSony(Connection conn) throws SQLException {
		String sql = "Select nombre, telefono FROM tblusuarios WHERE marca = 'NOKIA' or marca = 'BLACKBERRY' or marca = 'SONY'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String nombre = result.getString("nombre");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + nombre + " " + telefono);
		}
	}

	@Override
	public void usuarioSinSaldoOInactivos(Connection conn) throws SQLException {
		String sql = "Select COUNT(idx) FROM tblusuarios WHERE saldo = 0 or activo = 0";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String saldo = result.getString("count(idx)");
			System.out.println("Numero de usuarios sin saldo o inactivos = " + saldo);
		}
	}

	@Override
	public void listarLoginNivel123(Connection conn) throws SQLException {
		String sql = "Select * FROM tblusuarios WHERE nivel = 1 or nivel = 2 or nivel = 3";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String idx = result.getString("idx");
			String nombre = result.getString("nombre");
			System.out.println("Numero de usuarios de nivel 1, 2 o 3 = " + idx + " " + nombre);
		}

	}

	@Override
	public void listarNumerosSaldoMenorIgual300(Connection conn) throws SQLException {
		String sql = "Select telefono FROM tblusuarios WHERE saldo <= 300";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String telefono = result.getString("telefono");
			count++;
			System.out.println("Numeros con saldo menor o igual a 300 = " + count + " " + telefono);
		}
	}

	@Override
	public void sumaSaldoCompaniaNextel(Connection conn) throws SQLException {
		String sql = "Select SUM(saldo) FROM tblusuarios WHERE compañia = 'NEXTEL'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String saldo = result.getString("sum(saldo)");
			System.out.println("Saldo total de la compañía NEXTEL = " + saldo);
		}
	}

	@Override
	public void usuariosPorCompaniaTelefonica(Connection conn) throws SQLException {
		String sql = "Select COUNT(idx), compañia FROM tblusuarios GROUP BY compañia";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String num = result.getString("count(idx)");
			String compania = result.getString("compañia");
			System.out.println("La compañía " + compania + " tiene " + num + " usuarios");
		}
	}

	@Override
	public void usuariosPorNivel(Connection conn) throws SQLException {
		String sql = "Select COUNT(idx), nivel FROM tblusuarios GROUP BY nivel";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String num = result.getString("count(idx)");
			String nivel = result.getString("nivel");
			System.out.println("El nivel " + nivel + " tiene " + num + " usuarios");
		}
	}

	@Override
	public void listarLoginUsuariosNivel2(Connection conn) throws SQLException {
		String sql = "Select usuario FROM tblusuarios WHERE nivel = 2";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			count++;
			System.out.println(count + " " + usuario);
		}
	}

	@Override
	public void emailUsuariosConGmail(Connection conn) throws SQLException {
		String sql = "Select usuario, email FROM tblusuarios WHERE email LIKE '%gmail%'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			String email = result.getString("email");
			count++;
			System.out.println(count + " " + usuario + " " + email);
		}
	}

	@Override
	public void listarNombreYTelefonoConLgSamsungOMotorola(Connection conn) throws SQLException {
		String sql = "Select nombre, telefono FROM tblusuarios WHERE marca = 'LG' or marca = 'SAMSUNG' or marca = 'MOTOROLA'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String nombre = result.getString("nombre");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + nombre + " " + telefono);
		}
	}

	// Ejercicios02
	@Override
	public void listarNombreYTelefonoMarcaNoLgSamsung(Connection conn) throws SQLException {
		String sql = "Select nombre, telefono FROM tblusuarios WHERE marca <> 'SAMSUNG'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String nombre = result.getString("nombre");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + nombre + " " + telefono);
		}
	}

	@Override
	public void listarLoginYTelefonoCompaniaIusacell(Connection conn) throws SQLException {
		String sql = "Select usuario, telefono FROM tblusuarios WHERE compañia = 'IUSACELL'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + usuario + " " + telefono);
		}
	}

	@Override
	public void listarLoginYTelefonoCompaniaNoTelcel(Connection conn) throws SQLException {
		String sql = "Select usuario, telefono FROM tblusuarios WHERE compañia <> 'TELCEL'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + usuario + " " + telefono);
		}
	}

	@Override
	public void saldoPromedioUsuariosMarcaNokia(Connection conn) throws SQLException {
		String sql = "Select AVG(saldo) FROM tblusuarios WHERE marca = 'NOKIA'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String saldo = result.getString("avg(saldo)");
			System.out.println("El saldo promedio de los usuarios de NOKIA = " + saldo);
		}

	}

	@Override
	public void listarLoginYTelefonoCompaniaIusacellOAxel(Connection conn) throws SQLException {
		String sql = "Select usuario, telefono FROM tblusuarios WHERE compañia = 'IUSACELL' or compañia = 'AXEL'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + usuario + " " + telefono);
		}
	}

	@Override
	public void mostrarEmailNoYahoo(Connection conn) throws SQLException {
		String sql = "Select email FROM tblusuarios WHERE email NOT LIKE '%yahoo%'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String email = result.getString("email");
			count++;
			System.out.println(count + " " + email);
		}
	}

	@Override
	public void listarLoginYTelefonoCompaniaNoTelcelOIusacell(Connection conn) throws SQLException {
		String sql = "Select usuario, telefono FROM tblusuarios WHERE compañia <> 'TELCEL' AND compañia <> 'IUSACELL'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + usuario + " " + telefono);
		}

	}

	@Override
	public void listarLoginYTelefonoCompaniaUnefon(Connection conn) throws SQLException {
		String sql = "Select usuario, telefono FROM tblusuarios WHERE compañia = 'UNEFON'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			String telefono = result.getString("telefono");
			count++;
			System.out.println(count + " " + usuario + " " + telefono);
		}
	}

	@Override
	public void listarMarcasOrdenAlfabeticoDescendente(Connection conn) throws SQLException {
		String sql = "Select DISTINCT marca FROM tblusuarios ORDER BY marca DESC";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String marca = result.getString("marca");
			count++;
			System.out.println(count + " " + marca);
		}

	}

	@Override
	public void listarCompaniasOrdenAlfabeticoAleatorio(Connection conn) throws SQLException {
		String sql = "Select DISTINCT compañia FROM tblusuarios ORDER BY rand()";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String marca = result.getString("compañia");
			count++;
			System.out.println(count + " " + marca);
		}

	}

	@Override
	public void listarLoginNivel0O2(Connection conn) throws SQLException {
		String sql = "Select usuario FROM tblusuarios WHERE nivel = 0 or nivel = 2";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int count = 0;

		while (result.next()) {
			String usuario = result.getString("usuario");
			count++;
			System.out.println(count + " " + usuario);
		}
	}

	@Override
	public void saldoPromedioMarcaLg(Connection conn) throws SQLException {
		String sql = "Select AVG(saldo) FROM tblusuarios WHERE marca = 'LG'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			String saldo = result.getString("avg(saldo)");
			System.out.println("El saldo promedio de los usuarios de LG = " + saldo);
		}
	}

}
