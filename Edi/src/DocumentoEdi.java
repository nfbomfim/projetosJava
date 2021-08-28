
public class DocumentoEdi {

	private String nomeDocumentoEdi;
	private String tipoDocumentoEdi;
	private String situacaoDocumentoEdi;
	private String fluxoDocumentoEdi;
	
	public DocumentoEdi(String nomeDocumento, String tipoDocumento, String fluxoDocumento) {
		setNomeDocumentoEdi(nomeDocumento);
		setTipoDocumentoEdi(tipoDocumento);
		setFluxoDocumentoEdi(fluxoDocumento);
		this.situacaoDocumentoEdi = "ativo";
	}
	

	public void altera(String nomeDocumento, String tipoDocumento, String fluxoDocumento) {
		setTipoDocumentoEdi(tipoDocumento);
		setFluxoDocumentoEdi(fluxoDocumento);
	}
		
	public void desativa(String nomeDocumento) {
			this.situacaoDocumentoEdi = "inativo";
	}
	
	public String getNomeDocumentoEdi() {
		return this.nomeDocumentoEdi;
	}

	protected void setNomeDocumentoEdi(String nomeDocumento) {
		if(nomeDocumento != "orders" && nomeDocumento != "invoic"
				&& nomeDocumento != "ordrsp") {
			System.out.println("Documento EDI invalido!");
			return;
		}
		this.nomeDocumentoEdi = nomeDocumento;
	}

	public String getTipoDocumentoEdi() {
		return this.tipoDocumentoEdi;
	}

	protected void setTipoDocumentoEdi(String tipoDocumentoEdi) {
		if(tipoDocumentoEdi != "mercantil" && tipoDocumentoEdi != "financeiro"
				&& tipoDocumentoEdi != "logistico") {
			System.out.println("Tipo de documento EDI invalido!");
			return;
		}
		this.tipoDocumentoEdi = tipoDocumentoEdi;
	}

	public String getSituacaoDocumentoEdi() {
		return this.situacaoDocumentoEdi;
	}

	public String getFluxoDocumentoEdi() {
		return this.fluxoDocumentoEdi;
	}

	protected void setFluxoDocumentoEdi(String fluxoDocumentoEdi) {
		if(fluxoDocumentoEdi != "inboud" && fluxoDocumentoEdi != "outbound") {
			System.out.println("Fluxo do documento EDI invalido!");
			return;
		}
		this.fluxoDocumentoEdi = fluxoDocumentoEdi;
	}
	
}
