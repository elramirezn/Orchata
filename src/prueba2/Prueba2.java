/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author relki
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        ArrayList prodComprados= new ArrayList();
        Cliente c1 = null;
        Lapiz lapiz=new Lapiz(800);
        Cuaderno cuaderno=new Cuaderno(1200);
        Borrador borrador=new Borrador(600);
        Bloc bloc=new Bloc(2500);
        Lapicero lapicero=new Lapicero(900);
        String tecla;
        int l;
        int menu = 0;
        int dec;
        int dec2;
        int totalcompra;
        // TODO code application logic here
         Scanner dato=new Scanner(System.in);
        
        System.out.println("Bienvenido a la miscelanea MJ");
        System.out.println("Quiere ingresar como cliente?");
        System.out.println("Digite '1' para sí y '0' para no");
        l=dato.nextInt();
        if(l==1){
            System.out.println("Ingrese su nombre:");
            String nombre;
            nombre=dato.next();
            System.out.println("Ingrese edad:");
            int edadC;
            edadC=dato.nextInt();
            c1=new Cliente(nombre,edadC);
        }else{
            System.out.println("Bienvenido Anonimo");
            
        }
        if(c1.getNombre()!=null){
            System.out.println("Bienvenid@ "+c1.getNombre());
        }else{
            System.out.println("Bienvenid@ anonim@");
        }
        do{
            System.out.println("..Bienvenido a miscelanea MJ...");
            System.out.println("Le ofrecemos estos productos: ");
            System.out.println("\t1. Lapiz.");
            System.out.println("\t2. Cuaderno.");
            System.out.println("\t3. Borrador.");
            System.out.println("\t4. Bloc.");
            System.out.println("\t5. Lapicero.");
            System.out.println("\t Ingresar numero producto.");
            menu=dato.nextInt();
        }while(menu<0 || menu>5);
        switch(menu){
            case 1:
                System.out.println("Precio del lapiz: "+lapiz.getPrecioLapiz());
                System.out.println("Desea comprarlo? [1 para si y 0 para no]");
                dec=dato.nextInt();
                if(dec==1){
                    prodComprados.add(lapiz.getPrecioLapiz());
                    System.out.println("producto agregado a la compra.");
                    
                }else{
                    System.out.println("nothing");
                }
                System.out.println("precione cualquier tecla para ir al menu...");
                tecla=dato.nextLine();
                break;
            case 2:
                System.out.println("comprar cuaderno");
                break;
            case 3:
                System.out.println("comprar borrador");
                break;
            case 4:
                System.out.println("comprar bloc");
                break;
            case 5:
                System.out.println("comprar lapicero");
                break;
        }        
    }
        
}

