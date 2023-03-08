/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Bicicleta;

/**
 *
 * @author portatil
 */
public class ControladorBicicleta implements CRUD{
    
    public static ArrayList<Bicicleta> arreglobicicletas = new ArrayList<Bicicleta>();

    @Override
    public boolean insertar(Object obj) {
        boolean inserto=false;
        Bicicleta bici=new Bicicleta();
        bici=(Bicicleta)obj;
        if(arreglobicicletas.isEmpty())
        {
            arreglobicicletas.add(bici);
            return inserto=true;
        }
        else
        {
            for(Bicicleta bike: arreglobicicletas)
            {
                if(bike.equals(bici))
                {
                    inserto=false;
                    return inserto;
                }
            }
            
        }
        if(inserto)
        {
            arreglobicicletas.add(bici);
            inserto=true;
                    
        }
        return inserto;
    }

    @Override
    public Object modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object consultar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultar() {
        for(Bicicleta bike: arreglobicicletas)
        {
            System.out.println(bike.toString());
        }
    }

    @Override
    public boolean borrar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void ordenar(int ini, int fin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

                
               
    
    

   
}
