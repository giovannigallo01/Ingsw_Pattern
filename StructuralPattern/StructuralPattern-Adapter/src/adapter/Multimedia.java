package adapter;

public class Multimedia {

	private String nome;
	private String formato;
	public Multimedia(String nome, String formato) {
		this.nome = nome;
		this.formato = formato;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getFormato() {
		return formato;
	}
}
