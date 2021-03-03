
package arreglo_dinamico;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Arreglo_Dinamico {

    
    public static void main(String[] args) {
       //ordenamientoVectores();
        ordenamientoVectores_dos();
    }
    
    private static void  ordenamientoVectores(){
        int numeros= Integer.parseInt(JOptionPane.showInputDialog("Cuantos posiciones quiere ingresar"));
        String lista[]=new String[numeros];
        
        for(int i=0; i<lista.length; i++){
            lista[i]=new String();
            lista[i]=JOptionPane.showInputDialog("Ingresa el numero: " + (i+1));
        }
        
        System.out.println("Resultado de la lista: ");
        
         for(int i=0; i<lista.length; i++){
              System.out.println(lista[i]);
         }
    }
    
    private static void ordenamientoVectores_dos(){
        Scanner lector = new Scanner (System.in);
        
        int arreglo[]= new int[100];
        
        int limite,i,j,aux;
        
        System.out.println("Ingrese el numero de posiciones del arreglo ");
        limite =lector.nextInt();
        
        for (i=0; i<limite; i++) {
            System.out.print("X["+(i+1)+"]= ");
            arreglo[i]=lector.nextInt();
        }
        
        for (i=0; i<limite; i++) {
            for (j=i+1; j<limite; j++) {
                if(arreglo[i]<arreglo[j]){
                    aux= arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
        
        System.out.print("Arreglo: {");
        for (i=0; i<limite; i++) {
            System.out.print(arreglo[i]+",");
        }
        
        System.out.print("}");
    }
  
}
