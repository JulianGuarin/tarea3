
package ejercicio23;

public class ejercicio23 {
    public static void main(String[] args) {
        interfaz6 miinterfaz = new interfaz6();
        miinterfaz.setVisible(true);
    }
    public String resultado(double a, double b, double c){
        double x1 = ((-b + Math.sqrt((b*b)-(4*a*c)))/(2*a));
        double x2 = ((-b - Math.sqrt((b*b)-(4*a*c)))/(2*a));
        double usol = (-b/c);
        if( a != 0 ) {
            if( ((b*b)-(4*a*c) >= 0 )){ 
                return " La solucion 1: " + x1 + " La solucion 2: " + x2;
            }else {
                return "Solo raices complejas";
            }
        }else{
            return "La unica solucion es : "+ usol ;
        }
        			 
    }
}