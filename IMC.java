/**
 * Document   : IMC
   Created on : 21/05/2016, 10:42:57 PM
 * @author Mateo
 */
package IndiceMasaCorporal;

public class IMC {
    private String nombre;
    private double peso;
    private double estatura;
    
   /** Metodo constructor */
    public IMC(String nombre, double peso, double estatura) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
    }

    public double getIMC() 
    {
        return peso / (estatura * estatura);
    }

    public String getCategoria() {
        double imc = getIMC();
        if (imc < 18.5) {
            return "Delgado";
        } else if (imc <= 22.9) {
            return "Normal";
        } else if (imc <= 24.9) {
            return "En riesgo";
        } else if (imc <= 29.9) {
            return "Obeso Moderado";
        } else {
            return "Obeso severo";
        }
    }
    @Override
    public String toString(){
        return nombre + " " + "Peso: " + peso + " " + "Estatura: " + estatura + " " + "IMC: " + getIMC() + " " + "Categoria: " + getCategoria();
    }
    
}
