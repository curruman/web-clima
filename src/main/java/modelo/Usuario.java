package modelo;

public class Usuario {
	
	private String user;
	private String pwd;
	private double temp;
	private String pais;
	private String ciudad;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Usuario [user=" + user + ", pwd=" + pwd + ", temp=" + temp + ", pais=" + pais + ", ciudad=" + ciudad
				+ "]";
	}
	

}
