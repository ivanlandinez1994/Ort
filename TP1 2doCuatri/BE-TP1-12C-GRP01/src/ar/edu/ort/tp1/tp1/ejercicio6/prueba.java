package ar.edu.ort.tp1.tp1.ejercicio6;
public class prueba {

	public static void main(String[] args) {
		//------------Implementacion metodo Rubros------------///
			//-------Constructor* punto 1 *-------//
		Rubro tecnologico = new Rubro("tecnologico");
		Rubro medico = new Rubro("medico");
		Rubro otro = new Rubro("asdasda");
		//---------------------------------* punto 3 *------------------------------//
		tecnologico.agregarGasto(Mes.ENERO, 2100);
		tecnologico.agregarGasto(Mes.ENERO, 3100);
		tecnologico.agregarGasto(Mes.FEBRERO, 1100);
		tecnologico.agregarGasto(Mes.FEBRERO, 4100);
		tecnologico.agregarGasto(Mes.MARZO, 3100);
		tecnologico.agregarGasto(Mes.ABRIL, 4100);
		tecnologico.agregarGasto(Mes.MAYO, 5100);
		tecnologico.agregarGasto(Mes.JUNIO, 6100);
		tecnologico.agregarGasto(Mes.JULIO, 7100);
		tecnologico.agregarGasto(Mes.AGOSTO, 2100);
		tecnologico.agregarGasto(Mes.SEPTIEMBRE, 25100);
		tecnologico.agregarGasto(Mes.OCTUBRE, 700);
		tecnologico.agregarGasto(Mes.NOVIEMBRE, 9100);
		tecnologico.agregarGasto(Mes.DICIEMBRE, 100);
		
		medico.agregarGasto(Mes.ENERO, 2400);
		medico.agregarGasto(Mes.FEBRERO, 2100);
		medico.agregarGasto(Mes.MARZO, 3140);
		medico.agregarGasto(Mes.ABRIL, 4160);
		medico.agregarGasto(Mes.MAYO, 5160);
		medico.agregarGasto(Mes.JUNIO, 6800);
		medico.agregarGasto(Mes.JULIO, 7000);
		medico.agregarGasto(Mes.AGOSTO, 2100);
		medico.agregarGasto(Mes.SEPTIEMBRE, 100);
		medico.agregarGasto(Mes.OCTUBRE, 7210);
		medico.agregarGasto(Mes.NOVIEMBRE, 800);
		medico.agregarGasto(Mes.DICIEMBRE, 1120);

		otro.agregarGasto(Mes.ENERO, 2100);
		otro.agregarGasto(Mes.FEBRERO, 1100);
		otro.agregarGasto(Mes.MARZO, 3100);
		otro.agregarGasto(Mes.ABRIL, 4100);
		otro.agregarGasto(Mes.MAYO, 5100);
		otro.agregarGasto(Mes.JUNIO, 6100);
		otro.agregarGasto(Mes.JULIO, 7100);
		otro.agregarGasto(Mes.AGOSTO, 2100);
		otro.agregarGasto(Mes.SEPTIEMBRE, 25100);
		otro.agregarGasto(Mes.OCTUBRE, 700);
		otro.agregarGasto(Mes.NOVIEMBRE, 9100);
		otro.agregarGasto(Mes.DICIEMBRE, 100);
		//---------------------------------* punto 4 *------------------------------//
		System.out.println(otro.getNombre());
		//---------------------------------* punto 5 *------------------------------//
		System.out.println(otro.getTotalGastos(Mes.ENERO));
		System.out.println(tecnologico.getTotalGastos(Mes.ENERO));
		//------------Gasto Anual------------///
		//---------------------------------* punto 1 *------------------------------//
		GastoAnual gastoAnual = new GastoAnual();
		gastoAnual.getRubros().add(tecnologico);
		gastoAnual.getRubros().add(medico);
		gastoAnual.getRubros().add(otro);
		//---------------------------------* punto 2 *------------------------------//
		gastoAnual.agregarGastos(Mes.ENERO, "medico", 9000);
		System.out.println("Gasto anual rubro medico Mes Enero: ");
		System.out.println(gastoAnual.getRubros().get(1).getTotalGastos(Mes.ENERO));
		//---------------------------------* punto 6 *------------------------------//
		System.out.println("Gastos por mes: ");
		for(int i=0; i<Mes.values().length;i++) {
			System.out.println(Mes.values()[i].name()+": " + gastoAnual.gastoAcumulado(Mes.values()[i]));
		}
		//---------------------------------* punto 7 *------------------------------//
		System.out.println("Gasto en el rubro otro: "+gastoAnual.gastoAcumulado("asdasda"));
		//---------------------------------* punto 8 *------------------------------//		
		gastoAnual.informarConsumosPorMes();
		//---------------------------------* punto 9 *------------------------------//
		gastoAnual.informarPromedioMensualPorRubro();
		//---------------------------------* punto 10 *------------------------------//
		gastoAnual.informarMesMayorConsumo();
	}

}
