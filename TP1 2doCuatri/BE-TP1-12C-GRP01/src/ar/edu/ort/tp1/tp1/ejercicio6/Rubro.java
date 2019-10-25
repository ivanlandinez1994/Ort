package ar.edu.ort.tp1.tp1.ejercicio6;

import java.util.Arrays;

public class Rubro {
	static int TOTAL_MESES = 12;
	private String nombre;
	private double[] gastosPorMes;
	
	public Rubro(String nombre){
		inicializarGastos();
		this.nombre = nombre;
	}
	
	private void inicializarGastos(){
		gastosPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double gasto){
		this.gastosPorMes[mes.ordinal()] += gasto; 
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getTotalGastos(Mes mes){
		return this.gastosPorMes[mes.ordinal()];
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Rubro [nombre:" + nombre + ", gastosPorMes:" + Arrays.toString(gastosPorMes) + "]";
	}
	
	
}
