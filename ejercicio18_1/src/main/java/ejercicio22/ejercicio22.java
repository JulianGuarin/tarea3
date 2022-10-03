
package ejercicio22;

public class ejercicio22 {
    public static void main(String[] args) {
        interfaz5 miinterfaz = new interfaz5();
        miinterfaz.setVisible(true);
}
    public String resultado( String nombre_empleado ,  int salario_hora, int numero_horas){
        double salario_mensual= salario_hora * numero_horas;
        if ((salario_hora * numero_horas )> 450000) {
            return "nombre: "+nombre_empleado+"\n salario mensual: "+salario_mensual;
        }else{
            return "nombre: "+ nombre_empleado;
        }
		
		
	}
}
