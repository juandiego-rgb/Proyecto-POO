/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Usuario;

/**
 *
 * @author portatil
 */
public class ControladorUsuarios implements CRUD{
     public static ArrayList<Usuario> arreglousuarios = new ArrayList<Usuario>();
             
             
    @Override
    public boolean insertar(Object obj) {
        boolean inserto=true;
        Usuario usu = (Usuario)obj;
        if(arreglousuarios.isEmpty())
        {
            return arreglousuarios.add(usu);
        }
        else
        {
            for(Usuario usutemp : arreglousuarios)
            {
                if(usutemp.equals(usu))
                {
                    return inserto = false;
                }
            }
        }
        if(inserto)
        {
            arreglousuarios.add(usu);
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
        for(Usuario usu:arreglousuarios)
            System.out.println("");
    }

    @Override
    public boolean borrar(Object obj) {
        ordenar();
        Usuario temp=(Usuario)obj;
        int pos=Collections.binarySearch(arreglousuarios, temp);
        temp =arreglousuarios.get(pos);
        System.out.println("Usuario a borrar");
        System.out.println(temp.toString());
        return arreglousuarios.remove(temp);
        
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
