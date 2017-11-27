package atendente.banco.loja;

public class atendenteTO {

	private String nome;
	private String email;
	private int cpf;
	private String produtos;
	private String mes;
	private int notaFiscal;

	public atendenteTO(String nome, String email, int cpf, String produtos, String mes, int notaFiscal) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.produtos = produtos;
		this.mes = mes;
		this.notaFiscal = notaFiscal;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	@Override
	public String toString() {
		return "atendenteTO [ nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", produtos=" + produtos + ", mes="
				+ mes + "," + "Nota Fiscal= " + notaFiscal + "]";
	}

}
