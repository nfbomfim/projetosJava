
public class ParceriaEdi {

	private Empresa parceiro;
	private DocumentoEdi documento;
	private CanalDeTransmissao canal;
	private String statusParceria;
	
	public ParceriaEdi(Empresa parceiro, DocumentoEdi documento, CanalDeTransmissao canal) {
		setParceiro(parceiro);
		setDocumento(documento);
		setCanal(canal);
		setStatusParceria("ativo");
		
	}
	
	public void mimigraCanalParceria(Empresa parceiro, DocumentoEdi documento, CanalDeTransmissao canal, CanalDeTransmissao canalDestino) {
		setCanal(canalDestino);
		
	}
	
	public void desativaParceria(Empresa parceiro, DocumentoEdi documento, CanalDeTransmissao canal) {
		this.statusParceria = "inativo";
		
	}

	public Empresa getParceiro() {
		return this.parceiro;
	}

	public DocumentoEdi getDocumento() {
		return this.documento;
	}

	public CanalDeTransmissao getCanal() {
		return this.canal;
	}

	public String getStatusParceria() {
		return this.statusParceria;
	}

	protected void setParceiro(Empresa parceiro) {
		this.parceiro = parceiro;
	}

	protected void setDocumento(DocumentoEdi documento) {
		this.documento = documento;
	}

	protected void setCanal(CanalDeTransmissao canal) {
		this.canal = canal;
	}

	protected void setStatusParceria(String statusParceria) {
		this.statusParceria = statusParceria;
	}

	
}
