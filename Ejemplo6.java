import java.util.Scanner;

public class Ejemplo6{
 public static Scanner tecla = new Scanner(System.in);
 
 public static void main(String args[]){
//Declaramos las variables
 int NumArt;
 double PagoTotal = 0, CostoArt,Descuento = 0;
 double CostoArt1=0,CostoArt2=0,CostoArt3=0;
//Datos de Entrada
 System.out.println("Ingrese el numero de articulos que desee costear");
  NumArt = tecla.nextInt();
//Valor que dara paso a una iteracion
 int i= 1;
//Proceso y datos de entrada
 while(i <= NumArt){
 System.out.println("Ingrese el costo del articulo numero"+i);
 CostoArt = tecla.nextDouble();
//Proceso de costeo de cada articulo
if(CostoArt >= 200){
 Descuento = CostoArt*0.15;
 CostoArt1 = CostoArt - Descuento;
}else if (CostoArt > 100 && CostoArt< 200){
Descuento = CostoArt*0.12;
CostoArt2 = CostoArt - Descuento;
}else{
Descuento = CostoArt *0.10;
CostoArt3=CostoArt - Descuento;
}

 System.out.println("El costo del articulo numero"+i+"es de:S/."+PagoTotal+"Soles");
 i++;
}
//Datos de Salida
PagoTotal= CostoArt1 + CostoArt2 + CostoArt3;
System.out.println("El pago total por compra de los "+NumArt+" es de:S/."+PagoTotal+"Soles");
}
}
