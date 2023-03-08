/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorBicicleta;
import java.util.Scanner;
import modelo.Bicicleta;

/**
 *
 * @author portatil
 */
public class VistaBicicletas {
    
    ControladorBicicleta contbici;
    Scanner leerDatos;

    public VistaBicicletas() {
        contbici = new ControladorBicicleta();
        leerDatos = new Scanner(System.in);
        
                
    }
    
    
    
    public void insertarBici()
    {
        Bicicleta objtemp = new Bicicleta();
        System.out.println("Digite el ID");
        objtemp.setSerialId(leerDatos.nextInt());
       // System.out.println("Digite el nombre");
       //objtemp.setNombre(leerDatos.nextLine());
        System.out.println("Digite la marca");
        objtemp.setMarca(leerDatos.nextLine());
        
        System.out.println("Digite el color");
        objtemp.setColor(leerDatos.nextLine());
        
        System.out.println("Digite el fabricante");
        objtemp.setFabricante(leerDatos.nextLine());
        
         if(contbici.insertar(objtemp))
        {
            System.out.println("Bicicleta insertada");   
        }
        else
        {
            System.out.println("Problemas al insertar");
        }
        
    }
    public void menuBici()
    {
        System.out.println("Sistema de Información bicicletas");
        System.out.println("1. Insertar");
        System.out.println("2. Modificar");
        System.out.println("3. Consultar un Dato");
        System.out.println("4. Consultar Todos los Datos");
        System.out.println("5. Borrar un Dato");
        System.out.println("6. Ordenar un dato");
        System.out.println("Digite su opcion");
        
        int opc = leerDatos.nextInt();
        switch (opc) {
            case 1:
                insertarBici();
                
                break;
            case 4:
                contbici.consultar();
                break;
            default:
                break;
        }
    }

    
}
