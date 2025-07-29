package slaque_Project;

public class Mensagem {
	private Usuario usuario;
	private String texto;
	
	public Mensagem(Usuario usr, String txt) {
		this.usuario = usr;
		this.texto = txt;
	}
	
	@Override
	public String toString() {
		return this.usuario.getNome() + "-" + this.texto;
	}
}
