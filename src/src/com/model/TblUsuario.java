package src.com.model;

public class TblUsuario {

	private int idx;
	private String usuario;
	private String nombre;
	private String sexo;
	private int nivel;
	private String email;
	private String telefono;
	private String marca;
	private String compania;
	private Double saldo;
	private int activo;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public TblUsuario(int idx, String usuario, String nombre, String sexo, int nivel, String email, String telefono,
			String marca, String compania, Double saldo, int activo) {
		super();
		this.idx = idx;
		this.usuario = usuario;
		this.nombre = nombre;
		this.sexo = sexo;
		this.nivel = nivel;
		this.email = email;
		this.telefono = telefono;
		this.marca = marca;
		this.compania = compania;
		this.saldo = saldo;
		this.activo = activo;
	}

	public TblUsuario() {
		super();
	}

	@Override
	public String toString() {
		return "TblUsuario [idx=" + idx + ", usuario=" + usuario + ", nombre=" + nombre + ", sexo=" + sexo + ", nivel="
				+ nivel + ", email=" + email + ", telefono=" + telefono + ", marca=" + marca + ", compania=" + compania
				+ ", saldo=" + saldo + ", activo=" + activo + "]";
	}

}
