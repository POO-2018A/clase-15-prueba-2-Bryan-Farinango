/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

/**
 *
 * @author ESFOT
 */
public class Materias {
    String nombre;
    int nivel;

   

    
    Materias(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
       
        return "Materias{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }
    
    
    
}
