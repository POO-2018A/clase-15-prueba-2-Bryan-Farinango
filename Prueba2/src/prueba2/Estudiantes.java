/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ESFOT
 */
public class Estudiantes {
    private String nombre;
    private int edad;
    Materias[] materias;

   /* public Estudiantes(String nombre, int edad, Materias[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }
*/
    Estudiantes() {
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materias[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materias[] materias) {
        this.materias = materias;
    }

    
    //comparar
    @Override
    public boolean equals(Object obj) {
        final Estudiantes otroEstudiante = (Estudiantes)obj;
        
        
        if( this.nombre.equals(otroEstudiante.nombre)){
            if( this.edad == otroEstudiante.edad ){
                if( Arrays.equals(this.materias, otroEstudiante.materias)){
                    return true;
                }
            }
        }
       
            
        return false;
    }

    //toString
    @Override
    public String toString() {
        String estudiantes = null;
        for(int i = 0 ; i < materias.length; i++){
            System.out.println("\n");
            estudiantes += materias[i]+ "\n";
        }
        return "Estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", materias=" +
                Arrays.toString(materias) + '}';
    }

   
    
    
    
    
}
