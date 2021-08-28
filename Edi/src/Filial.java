
public class Filial extends Empresa{

	//private String codigoCnpjMatriz;
	private Empresa empresaMatriz;
	
	public Filial(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln, Empresa empresaMatriz) {
		super(codigoEmpresa, nomeEmpresa, codigoCnpj, codigoGln);
		setEmpresaMatriz(empresaMatriz);
	}

	public Empresa getEmpresaMatriz() {
		return this.empresaMatriz;
	}

	protected void setEmpresaMatriz(Empresa empresaMatriz) {
		this.empresaMatriz = empresaMatriz;
	}

	
}

