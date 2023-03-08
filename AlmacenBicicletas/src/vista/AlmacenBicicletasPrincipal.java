/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import java.awt.Menu;
import java.util.Scanner;
/**
 *
 * @author portatil
 */
public class AlmacenBicicletasPrincipal {

    /**
     * @param args the command line arguments
     * 
     * 
     */
        private static MenuBE menuBE = new MenuBE();
        private static MenuUsuarios menuUsu = new MenuUsuarios();
        private static VistaBicicletas menuBici = new VistaBicicletas();
        
        
        
    
    private static void menuPP()
    {
        

        
        Scanner leerdatos= new Scanner(System.in);
       
        
        
        System.out.println("Tienda Bicicletas");
        System.out.println("1. Bicicletas Electricas");
        System.out.println("2. Usuarios");
        System.out.println("3. Bicicletas");
        System.out.println("Seleccione una opcion");
        int opc=leerdatos.nextInt();
        switch  (opc){
            case 1:
                menuBE.MenuBE();
                break;
            case 2:
                menuUsu.menuUsuario();
                break;
            case 3:
                menuBici.menuBici();
            default:
                break;
        }  
    }
    
    
    
    
    
    public static void main(String[] args) {
        
   
 
      
        
        while(true)
        {
            menuPP();
            menuBE.MenuBE();
           /// pp.menuBici();
        }
    
        
    }
}
