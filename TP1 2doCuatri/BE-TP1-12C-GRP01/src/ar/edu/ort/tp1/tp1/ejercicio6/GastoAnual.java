package ar.edu.ort.tp1.tp1.ejercicio6;
import java.util.ArrayList;
public class GastoAnual {
	static int CANT_MESES=12;
	private ArrayList<Rubro> rubros;
	
	public GastoAnual(){
		rubros = new ArrayList<Rubro>();
	}
	
	public void agregarGastos(Mes mes, String nombre, double gasto){
		if(gasto>0){
			Rubro rubro = obtenerRubro(nombre);
			rubro.agregarGasto(mes, gasto);
		}
	}
	
	public ArrayList<Rubro> getRubros(){
		return rubros;
	}
		
	
	private Rubro obtenerRubro(String nombre){
		Rubro rubroADevolver;
		rubroADevolver = buscarRubro(nombre);
		if (rubroADevolver==null){
			Rubro nuevo = new Rubro(nombre);			
			rubros.add(nuevo);
			return nuevo;
		}else{
			return rubroADevolver;
		}	
	}
	
	private Rubro buscarRubro(String nombre){
		int index=0;
		Rubro aux=null;
		while(aux==null && index<rubros.size()){
			if(rubros.get(index).getNombre().equalsIgnoreCase(nombre)){
				aux = rubros.get(index);
			}
			index++;
		}
		return aux;
	}
	
	private double[][] consolidarGastos() {
		double[][] arreglo = new double[CANT_MESES][rubros.size()];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				arreglo[i][j] = rubros.get(j).getTotalGastos(Mes.values()[i]);

			}
		}
		return arreglo;
	}
	
	public double gastoAcumulado(Mes mes){
		double acumulado=0;
		double[][] arreglo = consolidarGastos();
		for(int j=0;j<rubros.size();j++){
			acumulado += arreglo[mes.ordinal()][j];
		}
		return acumulado;
	}
	
	public double gastoAcumulado(String nombreRubro){
		double acumulado=0;
		Rubro auxRubro = buscarRubro(nombreRubro);
		if(buscarRubro(nombreRubro) == null){
			acumulado=-1;
		}else{
			for(int i=0; i<CANT_MESES;i++){
				acumulado+=auxRubro.getTotalGastos(Mes.values()[i]);
			}
		}
		return acumulado;
	}
	
	public void informarConsumosPorMes(){
		for(Rubro rubro: rubros){
			System.out.println("Rubro: "+rubro.getNombre());
			for(int i=0;i<CANT_MESES;i++){
				System.out.println("Gasto total mes "+Mes.values()[i].name()+": "+rubro.getTotalGastos(Mes.values()[i]));
			}
		}
	}

	public void informarPromedioMensualPorRubro(){
		double acum=0;
		for(Rubro rubro: rubros){
			acum = this.gastoAcumulado(rubro.getNombre());
			System.out.println("El promedio mensual rubro: "+rubro.getNombre() +" es: "+acum/Mes.values().length);
		}
		
	}

	public void informarMesMayorConsumo(){		
		double mayorMonto=0;
		ArrayList<Mes> mesesMayores = new ArrayList<Mes>();
		for(int i =0; i< CANT_MESES;i++){
			if(mayorMonto<=this.gastoAcumulado(Mes.values()[i])){
				mayorMonto = this.gastoAcumulado(Mes.values()[i]);
			}
		}
		for(int i =0; i< CANT_MESES;i++){
			if(mayorMonto==this.gastoAcumulado(Mes.values()[i])){
				mesesMayores.add(Mes.values()[i]);
			}
		}
		
		System.out.println("El mayor monto es: "+mayorMonto);
		for (int i=0; i<mesesMayores.size();i++){
			System.out.println("Los meses fueron: "+mesesMayores.get(i));
		}
	}
}
