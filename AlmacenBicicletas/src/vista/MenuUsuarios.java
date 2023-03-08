/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorUsuarios;
import java.util.Scanner;
import modelo.Usuario;

/**
 *
 * @author portatil
 */
public class MenuUsuarios {
    private ControladorUsuarios contusu;
    private Scanner leerdatos;

    public MenuUsuarios() {
        contusu = new ControladorUsuarios();
        insertarDatosPorDefecto();
        leerdatos = new Scanner(System.in);
    }


    
    public void insertarDatosPorDefecto()
    {
        Usuario usutemp = new Usuario(1234, "Juan", "Molina", "30/10/2004", "molinavueno@gmail.com", "Cll83C", 312436);
        contusu.insertar(usutemp);
        usutemp = new Usuario(98457, "Pepito", "Perez", "10/08/1994", "pepito@gmail.com", "Cll15B", 123456);
        contusu.insertar(usutemp);
        
    }
    
    private void borrarDatos(){
        Usuario usu = new Usuario();
        contusu.consultar();
        System.out.println("Digite la cedula del usuario que quiere borrar");
        usu.setCedula(leerdatos.nextDouble());
        if(contusu.borrar(usu))
        {
            System.out.println("Usuario borrado");
            
        }
        else
        {
            System.out.println("Problemas al borrar el usuario");
        }
    }
    
    
    public void menuUsuario()
    {
        System.out.println("Menu Usuarios");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar Todos");
        System.out.println("3. Borrar");
        System.out.println("Seleccione su Opcion");
        int opc=leerdatos.nextInt();
        switch (opc){
            case 1:
                System.out.println("No implementada");
            case 2:
                contusu.consultar();
                break;
            case 3:
        }
        }
    }
    


