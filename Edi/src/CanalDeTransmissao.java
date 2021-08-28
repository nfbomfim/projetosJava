
public class CanalDeTransmissao {

	private int codigoCanal;
	private String nomeCanal;
	private Boolean canalOn;
	
	public CanalDeTransmissao(int codigoCanal, String nomeCanal) {
		this.codigoCanal = codigoCanal;
		this.nomeCanal = nomeCanal;
		this.canalOn = true;
	}
	
	public void altera(int codigoCanal, String nomeCanal) {
		this.nomeCanal = nomeCanal;
	}
	
	public void desativa(int codigoCanal) {
		this.canalOn = false;
		
	}
	
	public int getCodigoCanal() {
		return this.codigoCanal;
	}

	public String getNomeCanal() {
		return this.nomeCanal;
	}

	public Boolean getCanalOn() {
		return this.canalOn;
	}


	
	
}
