
package ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args) {
        interfaz2 miinterfaz= new interfaz2();
        miinterfaz.setVisible(true);
       
}
    public String resultado(double lado1){
        double perimetro = lado1*3;
        double altura = ((Math.sqrt(3))*lado1)/2;
        double area = (lado1*altura)/2;
        return " perimetro: "+perimetro+"\n altura: "+altura+"\n area: "+area;
        
    
    
}}