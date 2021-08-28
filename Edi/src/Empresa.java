
public class Empresa {

	private int codigoEmpresa;
	private String nomeEmpresa;
	private String codigoCnpj;
	private String codigoGln;
	private String situacaoEmpresa;
	
	public Empresa(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		setCodigoEmpresa(codigoEmpresa);
		setNomeEmpresa(nomeEmpresa);
		setCodigoCnpj(codigoCnpj);
		setCodigoGln(codigoGln);
		setSituacaoEmpresa("ativo");
		
	}
	
	public void altera(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		this.nomeEmpresa = nomeEmpresa;
		this.codigoCnpj = codigoCnpj;
		this.codigoGln = codigoGln;
		
	}

	public void desativa(int codigoEmpresa) {
		this.situacaoEmpresa = "inativo";		
	}

	public int getCodigoEmpresa() {
		return this.codigoEmpresa;
	}

	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}
	
	public String getCodigoCnpj() {
		return this.codigoCnpj;
	}

	public String getCodigoGln() {
		return this.codigoGln;
	}

	public String getSituacaoEmpresa() {
		return this.situacaoEmpresa;
	}

	protected void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	protected void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	protected void setCodigoCnpj(String codigoCnpj) {
		this.codigoCnpj = codigoCnpj;
	}

	protected void setCodigoGln(String codigoGln) {
		this.codigoGln = codigoGln;
	}

	protected void setSituacaoEmpresa(String situacaoEmpresa) {
		this.situacaoEmpresa = situacaoEmpresa;
	}

	
}

