package colasu3;

import java.util.Scanner;

public class ColasU3 {

    
     public static void main(String[] args) {
         // TODO code application logic here
         boolean continuar=true;
         int opcion;
         String palabra;
         
         ColaDinamica cola=new ColaDinamica();
         Scanner leer=new Scanner (System.in);
         while(continuar){
             System.out.println("");
             System.out.println("***************Menú***************");
             System.out.println("1.- Insertar");
             System.out.println("2.- Eliminar");
             System.out.println("3.- Mostrar");
             System.out.println("4.- Salir");
             System.out.print("Ingrese una opción:  ");
             opcion=leer.nextInt();
             switch(opcion){
                 case 1:
                     System.out.println("");
                     System.out.println("Palabra a insertar");
                     palabra=leer.next();
                     cola.Empujar(" "+palabra);
                     
                     break;
                 case 2:
                     cola.SacarCola();
                     System.out.println("");
                     break;
                 case 3:
                     cola.mostrarCola();
                     System.out.println("");
                     break;
                 case 4:
                     continuar=false;
                     break;
                     default:break;
             }
         }
     }
     
    
}
