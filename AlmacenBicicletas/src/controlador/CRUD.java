/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

/**
 *
 * @author portatil
 */
public interface CRUD {
    
    public boolean insertar(Object obj);
    public Object modificar(Object obj);
    public Object consultar(Object obj);
    public void consultar();
    public boolean borrar(Object obj);
    public void ordenar();
    public void ordenar(int ini, int fin);
    
    
}
