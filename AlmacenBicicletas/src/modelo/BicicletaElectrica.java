/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author portatil
 */
//Bicicleta super clase o la clase padre
//Bicicleta Electrica la clase hija o la subclase 
public class BicicletaElectrica extends Bicicleta{
    //Hereda los atributos y metodos publicos y protegidos se
    //heredan de de clases
    private String marcaBateria;
    private int potenciamotor;
    private String marcaMotor;

    public BicicletaElectrica(String marcaBateria, int potenciamotor, String marcaMotor, int serialId, String marca, String fabricante, String color, float valor, String tamaño) {
        super(serialId, marca, fabricante, color, valor, tamaño);
        this.marcaBateria = marcaBateria;
        this.potenciamotor = potenciamotor;
        this.marcaMotor = marcaMotor;
    }



    public BicicletaElectrica() {

    }

    public String getMarcaBateria() {
        return marcaBateria;
    }

    public void setMarcaBateria(String marcaBateria) {
        this.marcaBateria = marcaBateria;
    }

    public int getPotenciamotor() {
        return potenciamotor;
    }

    public void setPotenciamotor(int potenciamotor) {
        this.potenciamotor = potenciamotor;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "marcaBateria=" + marcaBateria + ", potenciamotor=" + potenciamotor + ", marcaMotor=" + marcaMotor + '}';
    }







  

    


    
    
}
