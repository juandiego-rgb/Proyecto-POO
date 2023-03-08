/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.BicicletaElectrica;

/**
 *
 * @author portatil
 */
public class ControladorBicicletaElectrica implements CRUD{
    
    public static ArrayList<BicicletaElectrica> arregloBicicletasElec = new ArrayList<BicicletaElectrica>();
            
            
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto=true;
        BicicletaElectrica temp = new  BicicletaElectrica();
        temp = (BicicletaElectrica)obj;
        if(arregloBicicletasElec.isEmpty())
        {
            arregloBicicletasElec.add(temp);
            return inserto;
        }
        else
            for(BicicletaElectrica bE:arregloBicicletasElec)
            {
                if(bE.equals(temp))
                {
                    return inserto=false;
                    
                }
            }
        if(inserto)
            {
                arregloBicicletasElec.add(temp);
                return inserto;
            }
        return false;
            
        
    }

    @Override
    public Object modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object consultar(Object obj) {
        //Algoritmo busqueda binaria
        //Precondicion que el arreglo este ordenado 
        Collections.sort(arregloBicicletasElec);
        BicicletaElectrica temp = new BicicletaElectrica();
        temp = (BicicletaElectrica)obj;
        int pos=Collections.binarySearch(arregloBicicletasElec, temp);
        if(pos<0)
            temp=null;
        else
            temp=arregloBicicletasElec.get(pos);
        ///return arregloBicicletasElec.get(pos);
        return temp;
    }

    @Override
    public void consultar() {
               for(BicicletaElectrica be:arregloBicicletasElec)
           System.out.println(be.toString());
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar() {
        
        Collections.sort(arregloBicicletasElec);
    }

    @Override
    public void ordenar(int izq, int der) {

            BicicletaElectrica pivote=arregloBicicletasElec.get(izq); // tomamos primer elemento como pivote
            int i=izq;         // i realiza la búsqueda de izquierda a derecha
            int j=der;         // j realiza la búsqueda de derecha a izquierda
            BicicletaElectrica aux;
 
            
            
            while(i < j){                          // mientras no se crucen las búsquedas                                   
            while(arregloBicicletasElec.get(i).getMarca().compareToIgnoreCase(pivote.getMarca()) <= 1 && i < j) i++; // busca elemento mayor que pivote
            while(arregloBicicletasElec.get(j).getMarca().compareToIgnoreCase(pivote.getMarca())> 1) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado                      
                aux= arregloBicicletasElec.get(i);                      // los intercambia
                arregloBicicletasElec.set(i,arregloBicicletasElec.get(j));
                arregloBicicletasElec.set(j,aux);
     }
   }
   
   arregloBicicletasElec.set(izq,arregloBicicletasElec.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arregloBicicletasElec.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      ordenar(izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      ordenar(j+1,der);          // ordenamos subarray derecho
   
        }
}
    
