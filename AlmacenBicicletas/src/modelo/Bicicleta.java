/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Comparator;
/**
 *
 * @author portatil
 */
public class Bicicleta implements Comparable<BicicletaElectrica>{
    private int serialId;
    private String marca;
    private String fabricante;
    private String color;
    float valor;
    String tamaño; //(XS, S, M, L, XL, XXL)

    public Bicicleta(int serialId, String marca, String fabricante, String color, float valor, String tamaño) {
        this.serialId = serialId;
        this.marca = marca;
        this.fabricante = fabricante;
        this.color = color;
        this.valor = valor;
        this.tamaño = tamaño;
    }

    public Bicicleta() {
   
    }



    public int getSerialId() {
        return serialId;
    }

    public void setSerialId(int serialId) {
        this.serialId = serialId;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Bicicleta{" + "serialId=" + serialId + ", marca=" + marca + ", fabricante=" + fabricante + ", color=" + color + ", valor=" + valor + ", tamaño" + tamaño + '}';
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bicicleta other = (Bicicleta) obj;
        return this.serialId == other.serialId;
    }

    @Override
    public int compareTo(BicicletaElectrica o) {
        if(o.getSerialId()==this.serialId)
            return 0;
        else if(o.getSerialId()<this.serialId)
            return 1;
        else
            return -1;
    }


    

    

   

    
    
}
