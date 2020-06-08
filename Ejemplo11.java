import java.util.Scanner;

public class Ejemplo11{
 public static Scanner tecla = new Scanner(System.in);

 public static void main(String args[]){
 System.out.println();
//Declaramos las variables
 int Nota,Alumnos,Alumno1=0,Alumno2=0;
 double Aprobado=0;
//Datos de entrada  
  System.out.println("ingrese el numero de alumnos");
  Alumnos = tecla.nextInt();
  System.out.println("Ingrese la nota minima aprobatoria");
  Aprobado = tecla.nextDouble();
//Variable que
 int i=1 ; 

 while(i <= Alumnos){
  System.out.println("Ingrese la nota del alumno numero "+i);
  Nota=tecla.nextInt();

if(Nota >= Aprobado){
 Alumno1 = Alumno1 +1 ;

}else{
  Alumno2 = Alumno2 +1;
}
 i++;
}
 System.out.println("-----------------------------------");
 System.out.println("Son"+Alumno1+"los alumnos APROBADOS");
 System.out.println("-----------------------------------");
 System.out.println("Son"+Alumno2+"los alumnos REPROBADOS");
 System.out.println("-----------------------------------");
}
}
