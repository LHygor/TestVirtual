package br.com.virtualtest.model;

public class Usuario implements Login{
	
	private String userName;
	private String pass;
	private char typeUser;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSenha() {
		return pass;
	}
	public void setSenha(String pass) {
		this.pass = pass;
	}
	public char getTipoDeUsuario() {
		return typeUser;
	}
	public void setTipoDeUsuario(char type) {
		this.typeUser = type;
	}
	
	@Override
	public boolean singIn(String userName, String pass) {
		//Criar metodo no UsuarioDAO;
		return false;
	}
	
	public void singOut() {
		System.out.println("Volte sempre há escola!");
	}
}
