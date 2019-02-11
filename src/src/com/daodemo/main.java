package src.com.daodemo;

import java.sql.Connection;
import java.sql.SQLException;

import src.com.dao.TblUsuarioDaoImpl;

public class main {

	public static void main(String[] args) throws SQLException {
		TblUsuarioDaoImpl tblUsuarioDao = new TblUsuarioDaoImpl();

		Connection conn = tblUsuarioDao.conectarBaseDatos();

		// ejercicio01(tblUsuarioDao, conn);
		ejercicio02(tblUsuarioDao, conn);

	}

	private static void ejercicio01(TblUsuarioDaoImpl tblUsuarioDao, Connection conn) throws SQLException {
		System.out.println("1. Listar los nombres de los usuarios\n");
		tblUsuarioDao.listarNombresUsuario(conn);
		System.out.println("2. Calcular el saldo máximo de los usuarios de sexo “Mujer”\n");
		tblUsuarioDao.saldoMaximoMujer(conn);
		System.out.println("3. Listar nombre y teléfono de los usuarios con teléfono NOKIA, BLACKBERRY o SONY\n");
		tblUsuarioDao.nombreYTelefonoUsuariosNokiaBlackberryOSony(conn);
		System.out.println("4. Contar los usuarios sin saldo o inactivos\n");
		tblUsuarioDao.usuarioSinSaldoOInactivos(conn);
		System.out.println("5. Listar el login de los usuarios con nivel 1, 2 o 3\n");
		tblUsuarioDao.listarLoginNivel123(conn);
		System.out.println("6. Listar los números de teléfono con saldo menor o igual a 300\n");
		tblUsuarioDao.listarNumerosSaldoMenorIgual300(conn);
		System.out.println("7. Calcular la suma de los saldos de los usuarios de la compañia telefónica NEXTEL\n");
		tblUsuarioDao.sumaSaldoCompaniaNextel(conn);
		System.out.println("8. Contar el número de usuarios por compañía telefónica\n");
		tblUsuarioDao.usuariosPorCompaniaTelefonica(conn);
		System.out.println("9. Contar el número de usuarios por nivel\n");
		tblUsuarioDao.usuariosPorNivel(conn);
		System.out.println("10. Listar el login de los usuarios con nivel 2\n");
		tblUsuarioDao.listarLoginUsuariosNivel2(conn);
		System.out.println("11. Mostrar el email de los usuarios que usan gmail\n");
		tblUsuarioDao.emailUsuariosConGmail(conn);
		System.out.println("12. Listar nombre y teléfono de los usuarios con teléfono LG, SAMSUNG o MOTOROLA\n");
		tblUsuarioDao.listarNombreYTelefonoConLgSamsungOMotorola(conn);
	}

	private static void ejercicio02(TblUsuarioDaoImpl tblUsuarioDao, Connection conn) throws SQLException {
		System.out.println(
				"1. Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca LG o SAMSUNG\n");
		tblUsuarioDao.listarNombreYTelefonoMarcaNoLgSamsung(conn);
		System.out.println("2. Listar el login y teléfono de los usuarios con compañia telefónica IUSACELL\n");
		tblUsuarioDao.listarLoginYTelefonoCompaniaIusacell(conn);
		System.out.println("3. Listar el login y teléfono de los usuarios con compañia telefónica que no sea TELCEL\n");
		tblUsuarioDao.listarLoginYTelefonoCompaniaNoTelcel(conn);
		System.out.println("4. Calcular el saldo promedio de los usuarios que tienen teléfono marca NOKIA\n");
		tblUsuarioDao.saldoPromedioUsuariosMarcaNokia(conn);
		System.out.println("5. Listar el login y teléfono de los usuarios con compañia telefónica IUSACELL o AXEL\n");
		tblUsuarioDao.listarLoginYTelefonoCompaniaIusacellOAxel(conn);
		System.out.println("6. Mostrar el email de los usuarios que no usan yahoo\n");
		tblUsuarioDao.mostrarEmailNoYahoo(conn);
		System.out.println(
				"7. Listar el login y teléfono de los usuarios con compañia telefónica que no sea TELCEL o IUSACELL\n");
		tblUsuarioDao.listarLoginYTelefonoCompaniaNoTelcelOIusacell(conn);
		System.out.println("8. Listar el login y teléfono de los usuarios con compañia telefónica UNEFON\n");
		tblUsuarioDao.listarLoginYTelefonoCompaniaUnefon(conn);
		System.out.println("9. Listar las diferentes marcas de celular en orden alfabético descendentemente\n");
		tblUsuarioDao.listarMarcasOrdenAlfabeticoDescendente(conn);
		System.out.println("10. Listar las diferentes compañias en orden alfabético aleatorio\n");
		tblUsuarioDao.listarCompaniasOrdenAlfabeticoAleatorio(conn);
		System.out.println("11. Listar el login de los usuarios con nivel 0 o 2\n");
		tblUsuarioDao.listarLoginNivel0O2(conn);
		System.out.println("12. Calcular el saldo promedio de los usuarios que tienen teléfono marca LG\n");
		tblUsuarioDao.saldoPromedioMarcaLg(conn);
	}
}
