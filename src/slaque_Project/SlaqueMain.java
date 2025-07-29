package slaque_Project;

public class SlaqueMain {

	public static void main(String[] args) {
		Slaque sl = new Slaque();
		sl.cadastraUsuario("Hugo","Hugo@gmail.com");
		sl.cadastraUsuario("Diego", "Diego@gmail.com");
		sl.cadastraUsuario("Ana","Ana@gmail.com");
		sl.cadastraUsuario("Carlos", "Carlos@gmail.com");
		sl.cadastraUsuario("Luiza", "Luiza@gmail.com");
		sl.cadastraCanal("Homens");
		sl.adicionaUsuarioNoCanal("Hugo@gmail.com","Homens");
		sl.adicionaUsuarioNoCanal("Diego@gmail.com","Homens");
		sl.adicionaUsuarioNoCanal("Carlos@gmail.com", "Homens");
		sl.cadastraCanal("Mulheres");
		sl.adicionaUsuarioNoCanal("Ana@gmail.com", "Mulheres");
		sl.adicionaUsuarioNoCanal("Luiza@gmail.com", "Mulheres");
		sl.mandarMensagem("Hugo@gmail.com", "Homens", "oi");
		sl.mandarMensagem("Diego@gmail.com", "Homens", "Oi Hugo, tudo bem?");
		System.out.println(sl.imprimeUsuariosDoCanal("Homens"));
		System.out.println(sl.imprimeHistoricoDeMensagensDoCanal("Homens"));
		sl.removeUsuarioDoCanal("Diego@gmail.com", "Homens");
		System.out.println(sl.imprimeUsuariosDoCanal("Homens"));
	}

}
