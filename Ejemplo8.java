import java.util.Scanner;

public class Ejemplo8{
 public static Scanner tecla = new Scanner(System.in);

 public static void main(String args[]){
 System.out.println();

int Salones,Alumnos,TotalEdadAlumnos=0;
int EdadPromSalon,EdadPromEscuela=0,EdadAlumno=0;
//Datos de entrada
System.out.println("Ingrese la cantidad de salones de la escuela");
 Salones =tecla.nextInt();
System.out.println("Ingrese la cantidad de alumnos por cada salon");
 Alumnos =tecla.nextInt();
//Variable que dara paso a la iteracion
int i = 1;
//Proceso y dato de entrada
 while(i <= Salones && i <= Alumnos){

 System.out.println("Ingrese la edad del alumno"+i);
 EdadAlumno= tecla.nextInt();
 
 TotalEdadAlumnos = TotalEdadAlumnos + EdadAlumno;
 i++;


}
//Proceso final  
EdadPromSalon = TotalEdadAlumnos /Alumnos;
EdadPromEscuela = TotalEdadAlumnos /Salones;
//Dato de salida
System.out.println();
System.out.println("La edad promedio de los "+Salones+"salones es de:"+EdadPromSalon+" y la edad promedio de toda la escuela es de:"+EdadPromEscuela);
 }
}