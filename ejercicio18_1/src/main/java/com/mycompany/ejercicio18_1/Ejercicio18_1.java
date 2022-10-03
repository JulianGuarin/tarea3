

package com.mycompany.ejercicio18_1;

public class Ejercicio18_1 {

    public static void main(String[] args) {
        Interfaz miinterfaz = new Interfaz();
        miinterfaz.setVisible(true);
    }
    public String resultado(int codigo, String nombres, int nhoras, double vhoras, double retencion){
        double salariobruto = nhoras*vhoras;
        double salarioneto = salariobruto - (salariobruto*(retencion/100));
        return " codigo: "+codigo+"\n nombres: "+ nombres+"\n salario bruto: "+salariobruto+"\n salario neto: "+salarioneto;
    }}

