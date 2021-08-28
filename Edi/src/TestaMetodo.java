
public class TestaMetodo {

	
	public static void main(String[] args) {
		
		DocumentoEdi documento = new DocumentoEdi("orders", "mercantil", "outbound");
		System.out.println("=====  Documento EDI  ====");
		System.out.println(documento.getNomeDocumentoEdi());
		System.out.println(documento.getTipoDocumentoEdi());
		System.out.println(documento.getFluxoDocumentoEdi());
		
		CanalDeTransmissao canal = new CanalDeTransmissao(1, "Opentext");
		System.out.println("=====  Canal de Transmissão  ====");
		System.out.println(canal.getCodigoCanal());
		System.out.println(canal.getNomeCanal());
		System.out.println(canal.getCanalOn());
		
		Empresa fornecedor = new Empresa(13, "Canuto Nunes Serv Med Ltda", "17394201000101", "1111111111111");
		System.out.println("=====  Fornecedor  ====");
		System.out.println(fornecedor.getCodigoEmpresa());
		System.out.println(fornecedor.getNomeEmpresa());
		System.out.println(fornecedor.getCodigoCnpj());
		System.out.println(fornecedor.getCodigoGln());
		System.out.println(fornecedor.getSituacaoEmpresa());
		
		Filial filialEmpresa = new Filial(13, "Canuto Nunes Serv Med Ltda", "17394201000202", "2222222222222", fornecedor);
		System.out.println("=====  Filial Fornecedor  ====");
		System.out.println(filialEmpresa.getCodigoEmpresa());
		System.out.println(filialEmpresa.getNomeEmpresa());
		System.out.println(filialEmpresa.getCodigoCnpj());
		System.out.println(filialEmpresa.getCodigoGln());
		System.out.println(filialEmpresa.getSituacaoEmpresa());
		System.out.println(filialEmpresa.getEmpresaMatriz().getCodigoCnpj());
		System.out.println(filialEmpresa.getEmpresaMatriz().getCodigoGln());

		
		ParceriaEdi parceria = new ParceriaEdi(fornecedor, documento, canal);
		System.out.println("=====  Parceria EDI  ====");
		System.out.println("GLN: " + parceria.getParceiro().getCodigoGln());
		System.out.println("Documento: " + parceria.getDocumento().getNomeDocumentoEdi());
		System.out.println("Canal: " + parceria.getCanal().getNomeCanal());
		System.out.println(parceria.getStatusParceria());
		
		
		
	}

}
