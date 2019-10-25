package ar.edu.ort.tp1.tp2.ejercicio3;
/*
TP2, Ejercicio 1
Grupo 1
Timoty wider, Jessica Rodriguez, Ivan Dario Landinez

 */
public class NumeroTelefonico {
	private static TipoDeLinea TIPO_LINEA_POR_DEFAULT=TipoDeLinea.CELULAR;
	private static int MIN_NUMERO_ABONADO=11111111;
	private static int MAX_NUMERO_ABONADO=99999999;
	private static int MIN_CARACTERISTICA=0;
	private static int MAX_CARACTERISTICA=9999;
	private static int MIN_CODIGO_PAIS=0;
	private static int MAX_CODIGO_PAIS=9999;
	private int caracteristica;
	private int numeroAbonado;
	private int codigoPais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(){
		this.caracteristica=0;
		this.numeroAbonado=0;
		this.codigoPais=0;
		this.setTipoDeLineaDefault();
	}
	
	public NumeroTelefonico(int caracteristica, int numeroAbonado, int codigoPais){
		this.setCaracteristica(caracteristica);
		this.setNumeroAbonado(numeroAbonado);
		this.setCodigoPais(codigoPais);
		this.setTipoDeLineaDefault();
	}

	private void setTipoDeLineaDefault(){
		this.setTipoDeLinea(TIPO_LINEA_POR_DEFAULT);
	}
	
	public int getCaracteristica() {
		return caracteristica;
	}

	public boolean setCaracteristica(int caracteristica) {
		if(caracteristica>=MIN_CARACTERISTICA && caracteristica<=MAX_CARACTERISTICA){
			this.caracteristica = caracteristica;
			return true;
		}
		return false;
	}

	public int getNumeroAbonado() {
		return numeroAbonado;
	}

	public boolean setNumeroAbonado(int numeroAbonado) {
		if(numeroAbonado>=MIN_NUMERO_ABONADO && numeroAbonado<=MAX_NUMERO_ABONADO){
			this.numeroAbonado = numeroAbonado;
			return true;
		}
		return false;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public boolean setCodigoPais(int codigoPais) {
		if(codigoPais>=MIN_CODIGO_PAIS && codigoPais<=MAX_CODIGO_PAIS){
			this.codigoPais = codigoPais;
			return true;
		}
		return false;		
	}

	public TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}

	public void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}

	public String getValor(){
		return "+"+this.codigoPais+" "+this.caracteristica+"-"+this.numeroAbonado;
	}
	
	
}
