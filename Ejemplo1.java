import java.util.Scanner;

 public class Ejemplo1{
 public static Scanner tecla = new Scanner(System.in);
 public static void main(String args[]){
 
 System.out.println();
//Declara variables

 int Tiempo,Salario;
 double Incremento=0,SalarioAnual=0,SalarioTotal=0; 
//Datos de entrada

 System.out.println("ingrese el tiempo en anhos de servicio");
 Tiempo = tecla.nextInt();
 System.out.println("ingrese el salario del Docente");
 Salario = tecla.nextInt();
//variable que dara paso a un iteracion
 int i = 1;
//Proceso
 while(i <= Tiempo){

 Incremento = Salario*0.10;
 SalarioAnual = Salario+Incremento;

System.out.println("el salario anual de anho"+i+"es de:S/"+SalarioAnual+"Soles");
i++;
 }
//datos de salida
SalarioTotal = SalarioAnual*Tiempo;
System.out.println("el salario total del docente es:S/."+SalarioTotal+"Soles");

 }
}