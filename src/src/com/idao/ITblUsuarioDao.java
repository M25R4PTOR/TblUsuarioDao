package src.com.idao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ITblUsuarioDao {

	public Connection conectarBaseDatos();

	// Ejercicio01
	public void listarNombresUsuario(Connection conn) throws SQLException;

	public void saldoMaximoMujer(Connection conn) throws SQLException;

	public void nombreYTelefonoUsuariosNokiaBlackberryOSony(Connection conn) throws SQLException;

	public void usuarioSinSaldoOInactivos(Connection conn) throws SQLException;

	public void listarLoginNivel123(Connection conn) throws SQLException;

	public void listarNumerosSaldoMenorIgual300(Connection conn) throws SQLException;

	public void sumaSaldoCompaniaNextel(Connection conn) throws SQLException;

	public void usuariosPorCompaniaTelefonica(Connection conn) throws SQLException;

	public void usuariosPorNivel(Connection conn) throws SQLException;

	public void listarLoginUsuariosNivel2(Connection conn) throws SQLException;

	public void emailUsuariosConGmail(Connection conn) throws SQLException;

	public void listarNombreYTelefonoConLgSamsungOMotorola(Connection conn) throws SQLException;

	// Ejercicio02
	public void listarNombreYTelefonoMarcaNoLgSamsung(Connection conn) throws SQLException;

	public void listarLoginYTelefonoCompaniaIusacell(Connection conn) throws SQLException;

	public void listarLoginYTelefonoCompaniaNoTelcel(Connection conn) throws SQLException;

	public void saldoPromedioUsuariosMarcaNokia(Connection conn) throws SQLException;

	public void listarLoginYTelefonoCompaniaIusacellOAxel(Connection conn) throws SQLException;

	public void mostrarEmailNoYahoo(Connection conn) throws SQLException;

	public void listarLoginYTelefonoCompaniaNoTelcelOIusacell(Connection conn) throws SQLException;

	public void listarLoginYTelefonoCompaniaUnefon(Connection conn) throws SQLException;

	public void listarMarcasOrdenAlfabeticoDescendente(Connection conn) throws SQLException;

	public void listarCompaniasOrdenAlfabeticoAleatorio(Connection conn) throws SQLException;

	public void listarLoginNivel0O2(Connection conn) throws SQLException;

	public void saldoPromedioMarcaLg(Connection conn) throws SQLException;
}
