package slaque_Project;

import java.util.HashSet;
import java.util.ArrayList;

public class Canal {
	private String nome;
	private HashSet<Usuario> usuarios = new HashSet<>();
	private ArrayList<Mensagem> mensagens = new ArrayList<>();
	
	public Canal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public HashSet<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	public ArrayList<Mensagem> getMensagens() {
		return this.mensagens;
	}
	
	public void adicionaUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public void cadastraMensagem(Usuario usr, String txt) {
		Mensagem m = new Mensagem(usr,txt);
		mensagens.add(m);
	}
	
	public boolean removerUsuario(Usuario usr) {
		if (usuarios.contains(usr)) {
			usuarios.remove(usr);
			return true;
		}
		return false;
	}
}
