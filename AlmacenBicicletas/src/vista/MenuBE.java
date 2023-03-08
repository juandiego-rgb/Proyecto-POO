/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorBicicletaElectrica;
import java.util.Scanner;
import modelo.BicicletaElectrica;

/**
 *
 * @author portatil
 */
public class MenuBE {
    ControladorBicicletaElectrica controBE;
    Scanner leerDatos;
    public MenuBE(){
        controBE = new ControladorBicicletaElectrica();
        leerDatos = new Scanner(System.in);
        datosIniciales();
        
    }
    private void datosIniciales()
    {
     BicicletaElectrica bE = new BicicletaElectrica("Duracell", 120, "GWE", 987654, "GW", "GWF", "rojo", 1500000, "XL");
     controBE.insertar(bE);
     
    bE = new BicicletaElectrica("Panasonic", 64, "Biyof", 332244, "Trek", "TrekI", "Morado", 2000000, "S");
    controBE.insertar(bE);
    bE = new BicicletaElectrica("Varta", 100, "Stiff", 1054, "Argon", "Alchemy", "Azul", 5000000, "XS");
    controBE.insertar(bE);
   
    }
    public void consultarUnDato()
    {
        System.out.println("Digite el ID que desea consultar");
        BicicletaElectrica elec = new BicicletaElectrica();
        elec.setSerialId(leerDatos.nextInt());
        elec = (BicicletaElectrica)controBE.consultar(elec);
        if(elec==null)
            System.out.println("No existe el dato");
        else
            System.out.println(elec.toString());
        
    }
    
    public void MenuBE()
    {
        System.out.println("Menu BE");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar una BE");
        System.out.println("3. Consultar Todos");
        System.out.println("4. Ordenar Bicicletas Electricas");
        System.out.println("5. Ordenar bicicletas Electricas por Nombre");
        System.out.println("Digite su opcion");
        int opc = leerDatos.nextInt();
        switch (opc) {
            case 1:
                
                break;
            case 2:
                consultarUnDato();
             case 3:
                controBE.consultar();
                
            case 4:
                controBE.ordenar();
                
            case 5:
                controBE.ordenar(0, controBE.arregloBicicletasElec.size()-1);    
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
          
        
        
    }
}
