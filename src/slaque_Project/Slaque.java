package slaque_Project;

import java.util.HashMap;

public class Slaque {
	private HashMap<String,Usuario> usuarios = new HashMap<>();
	private HashMap<String,Canal> canais = new HashMap<>();
	
	public Slaque() {
		
	}
	
	public void cadastraUsuario(String nome, String email) {
		Usuario usr = new Usuario(nome,email);
		this.usuarios.put(email, usr);
	}
	
	public void cadastraCanal(String nome) {
		Canal canal = new Canal(nome);
		this.canais.put(nome, canal);
	}
	
	public String imprimeUsuariosDoCanal(String nomeCanal) {
		String out = "";
		if (this.canais.containsKey(nomeCanal)) {
			for (Usuario usr: this.canais.get(nomeCanal).getUsuarios()) {
				out += usr.getNome() + " ;";
			}
		}
		out = out.substring(0,out.length()-1);
		return out;
	}
	
	public String imprimeHistoricoDeMensagensDoCanal(String nomeCanal) {
		String out = "";
		if (this.canais.containsKey(nomeCanal)) {
			for (Mensagem msg: this.canais.get(nomeCanal).getMensagens()) {
				out += msg.toString() + " ;";
			}
		}
		out = out.substring(0,out.length()-1);
		return out;
	}
	
	public boolean adicionaUsuarioNoCanal(String email, String nomeCanal) {
		if (this.canais.containsKey(nomeCanal) && this.usuarios.containsKey(email)) {
			this.canais.get(nomeCanal).adicionaUsuario(this.usuarios.get(email));
			return true;
		}
		return false;
	}
	public boolean removeUsuarioDoCanal(String email, String nomeCanal) {
		for (Usuario usr: this.canais.get(nomeCanal).getUsuarios()) {
			if (usr.getEmail().equals(email)) {
				this.canais.get(nomeCanal).removerUsuario(usr);
				return true;
			}
		}
		return false;
	}
	public boolean mandarMensagem(String email,String nomeCanal, String txt) {
		if (!this.canais.containsKey(nomeCanal)) {
			return false;
		}
		
		for (Usuario usr: canais.get(nomeCanal).getUsuarios()) {
			if(usr.getEmail().equals(email)) {
				this.canais.get(nomeCanal).cadastraMensagem(usr, txt);
				return true;
			}
		}
		return false;
	}
}
