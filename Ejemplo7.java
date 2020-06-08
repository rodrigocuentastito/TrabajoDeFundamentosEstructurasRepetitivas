import java.util.Scanner;

public class Ejemplo7{
 public static Scanner tecla = new Scanner(System.in);


 public static void main(String args[]){
  System.out.println();
//Declaramos variables
 int DepositoMensual,DepositoAnual = 0, TiempoInversion;
 double InteresAnual =0, InversionFinalAnual =0,InversionFinalTotal =0;
//Datos de Entrada

System.out.println("Ingrese el tiempo en anhos que invertira en este banco");
TiempoInversion = tecla.nextInt();
System.out.println("Ingrese el monto mensual que depositara en el banco");
DepositoMensual = tecla.nextInt();
//Variable que dara paso a una iteracion

int i=1;
//proceso

while(i <= TiempoInversion){ 
 DepositoAnual=DepositoMensual*12;
 InteresAnual=DepositoAnual *0.10;
 InversionFinalAnual = InteresAnual + DepositoAnual;
//Dato de salida en la estructura ciclica
 System.out.println("");
 System.out.println("La inversion final anual de año"+i+" es de:S/."+InversionFinalAnual+"Soles" );
 System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
 i++;
}
//Proceso final

 InversionFinalTotal = InversionFinalAnual*TiempoInversion;
//Datos de Salida
 System.out.println("La inversion final de los "+TiempoInversion+" años mas de interes del 10% por cada año es de:S/."+InversionFinalTotal+"Soles");
}
}