/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.pkgcase.ej;



/**
 *
 * @author Erick
 */
import java.util.Scanner;
public class SwitchCaseEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.- Menu de acciones(comida)
      
        System.out.println("1.- Menu de acciones(comida) ");
        int men=3;
Scanner entrada = new Scanner(System.in);
System.out.println("Ingrese un numero: ");
 men = entrada.nextInt();

String menDigito = "";

switch (men){
case 1:
menDigito = "Plato 1.- Aguachil de marisco";
break;
case 2:
menDigito = "Plato 2.-Camarones empanizados";
break;
case 3:
menDigito = "Plato 3.- Mole Poblano";
break;
case 4:
menDigito = "Plato 4.- LAGSAÑA";
break;
case 5:
menDigito = "Plato 5.- Huevos rancheros";
break;
default:
menDigito = "No contamos con el platillo. Lo sentimos:(";

}
  System.out.println("menDigito: " + menDigito); 
  
  //2.-Menu de acciones
  System.out.println("2.- Menu de acciones");
 int num=3;
System.out.println("Ingrese un numero: ");
 num = entrada.nextInt();

String numDigito = "";

switch (num){
case 1:
numDigito = "1.-Estudiar";
break;
case 2:
numDigito = "2.-Comer";
break;
case 3:
numDigito = "3.-Dormir";
break;
case 4:
numDigito = "4.-Correr";
break;
case 5:
numDigito = "5.-Saltar";
break;
default:
numDigito = "El numero no corresponde a ninguna accion";

}
  System.out.println("numDigito: " + numDigito); 
  
  //3.- Horarios de mi dia 
  System.out.println("3.-Horarios de mi dia" );
  int hora = 0;
  System.out.println("ingrese un valor del 1 al 24");
  hora=entrada.nextInt();
 
  switch (hora){
            case 7:
                System.out.println("Clase de Administración General");
                break;
            case 8:
                System.out.println("Desayuno");
                break;              
            case 9,10:
                System.out.println("Clase de Álgebra Lineal");
                 break;
            case 11,12:
                System.out.println("Clase de Organizacion Computacional");   
                break;
            case 13,14:
               System.out.println("Clase de Fisica"); 
                break;
            case 15,16:
               System.out.println("Almuerzo mas una ducha"); 
               break;
            case 17,18:
             System.out.println("Hacer las tareas");   
             break;
             case 19:
             System.out.println("Entenar");   
             break;
            case 20,21:
             System.out.println("Bañarse y cenar");
             break;
            case 22,23,24,1,2,3,4,5:
                 System.out.println("Descanso(Dorminr)");   
                break;
  }
  //4.-Semana laboral y semana inglesa
  
  System.out.println("4.-Semana laboral y semana inglesa");

System.out.println("Ingrese un numero del 1 al 7, donde seran los dias de la semana ");
 num = entrada.nextInt();

String numDia1 = "";
String numDia2= "";
String numDia="";

switch (num){
case 1:
numDia1 = "1.-DOMINGO,INICIO SEMANA INGLESA";
break;
case 2:
numDia2 = "2.-LUNES, INICIO DE SEMANA LABORAL";
break;
case 3:
numDia = "3.-MARTES";
break;
case 4:
numDia = "4.-MIERCOLES";
break;
case 5:
numDia = "5.-JUEVES";
break;
case 6:
numDia = "5.-VIERNES";
break;
case 7:
numDia = "5.-SABADO";
break;
default:
numDia = "EL NUMERO NO CORRESPONDE A NINGUN DIA DE LA SEMANA";

    }
System.out.println("numDia1: " + numDia1);
//System.out.println("numDia2: " + numDia2);
//System.out.println("numDia: " + numDia);
    }
}
