import java.text.SimpleDateFormat;

class Filho{
	private String nome;
	private String dataNasc;
	private String sexo;
	
	public Filho(String nome, String dataNasc, String sexo) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String imprimeFilho() {
		String mensagem = getNome() + getDataNasc() + getSexo() + "\n"; 
		
		return mensagem;
	}
}
