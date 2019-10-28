package ar.edu.ort.tp1.tp3.ejercicio2;

public class Vendedor extends SubContratado{
	private float porcentajeComision;
	private float importeVenta;
	public Vendedor(String nombre, int edad, float precioHora, int horas, float porcentajeComision){
		super(nombre, edad, precioHora, horas);
		this.porcentajeComision = porcentajeComision;
		this.importeVenta = 0;
	}
		
	public float getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(float porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public float getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(float importeVenta) {
		this.importeVenta = importeVenta;
	}

	@Override
	public float calcularPago(){
		return super.calcularPago() + (this.importeVenta*(this.porcentajeComision/100));
	}
}
