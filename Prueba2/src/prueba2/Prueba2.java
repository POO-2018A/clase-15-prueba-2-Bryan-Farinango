
package prueba2;

import java.util.Scanner;


public class Prueba2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("####INFORMACION DE ESTUDIANTES####" + "\n");
        Estudiantes[] estudiantes = new Estudiantes[2]; //creo un arreglo de un objeto
        
        System.out.println("Ingresar informacion de los estudiantes: " + "\n");
        //scan.nextLine();
        
        for(int i = 0; i < estudiantes.length; i++){
            
            estudiantes[i] = new Estudiantes();
            
            System.out.println("\n");
            System.out.print("Ingrese el nombre de estudiante " + (i+1) + ": " );
            String nombreEstudiante = scan.nextLine();
            estudiantes[i].setNombre(nombreEstudiante);
            
            
            System.out.print("Ingrese la edad del estudiante " + (i+1) + ": ");
            int age = scan.nextInt();
            estudiantes[i].setEdad(age);
            
            //arreglo de materias
            Materias[] materias = new Materias[2];
            
            
            for(int j = 0; j< materias.length; j++ ){
                materias[j] = new Materias();
                scan.nextLine();
                
                System.out.println("Ingrese 2 materias para el estudiante "+ (i+1) + ": ");
                System.out.println("Materia "+ (j+1) + ": ");
                String nombreMaterias = scan.nextLine();
                materias[j].setNombre(nombreMaterias);
                
                
                System.out.println("Ingrese el nivel de la materia "+ (j+1) + ": ");
                int nivelMateria = scan.nextInt();
                
                materias[j].setNivel(nivelMateria);
                
               estudiantes[i].setMaterias(materias);
            }
            
           scan.nextLine();
        } //--> termina el bucle for
        
        
        System.out.println("####Informacion de los estudiantes####");
        for(int i = 0; i < estudiantes.length; i++){
            System.out.println(estudiantes[i]);
        }
        
        
        System.out.println("\n");
        
        for(int i = 0;i < estudiantes.length; i++){
            for(int j = 0; j<estudiantes.length; j++){
                if(estudiantes[i].equals(estudiantes[j])){
                    
                    System.out.println("El estudiante en la posicion: " + (i) + " es igual con el estudiante en la posicion:" + (j));
                    
                }else{
                    
                    System.out.println("Datos ingresados correctamentente no son iguales");
                    
                    
                    
                }
                
            }
            
        }
        
        
        
        
    }


    
}
