import java.util.Scanner;
public class Ejemplo10{
 public static Scanner tecla = new Scanner(System.in);

 public static void main(String args[]){
 System.out.println();
//Declaracion de variables
int Venta1=0 , Venta2=0, Venta3=0 ,Venta=0;
int NumVentas , VentaGlobal;
//Datos de entrada
System.out.println("ingrese el numero de ventas que realizo");
NumVentas = tecla.nextInt();
//Variable que dara paso a un comienzo
int i = 1;

while( i <= NumVentas){

System.out.println("Ingrese la ganancia de la venta numero "+i);
Venta = tecla.nextInt();

if(Venta <= 10000){

Venta1 = Venta1 + Venta;
}else if (Venta >10000 && Venta <= 20000){

Venta2 = Venta2 + Venta;
}else{
Venta3=Venta3 + Venta;
}
i++;
}
//Proceso Final
  VentaGlobal = Venta1 + Venta2 + Venta3;
//Datos de salida
 System.out.println("El monto total por las ventas menores e iguales a 10000 es de:S/."+Venta1+"Soles");
 System.out.println("El monto total por las ventas mayores a 10000 pero menores a 20000 es de:S/."+Venta2+"Soles");
 System.out.println("El monto total por las ventas mayores a 20000 es de:S/."+Venta3+"Soles");

System.out.println("El ingreso total por cada una de las ventas es de:S/."+VentaGlobal+"Soles");
}
}
