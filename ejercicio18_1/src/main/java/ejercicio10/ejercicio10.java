
package ejercicio10;

public class ejercicio10 {
    public static void main(String[] args) {
        interfaz4 miinterfaz= new interfaz4();
        miinterfaz.setVisible(true);
    
}
    public String resultado(String ni, String n, double p, int es){
        double pm = 50000.0;
        double vm = 0;
        if ((p>2000000)&(es>3)) {
            vm=pm+(0.03*p);
            return "El estudiante con numero de inscripcion "+ni+"\n y nombre "+n+ "\n debe pagar "+"$"+vm;
        }else {
            return "El estudiante con numero de inscripcion "+ni+"\n y nombre "+n+ "\n debe pagar "+"$"+pm;
        }
    }

}