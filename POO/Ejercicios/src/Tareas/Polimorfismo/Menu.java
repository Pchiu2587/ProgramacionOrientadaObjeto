package Tareas.Polimorfismo;

import java.util.Scanner;

public abstract class Menu // Clase abstracta.
{
 protected int hamburguesa, hotdog, papas, refresco, contraseña, pswd;//Variables del menu para el administrador y cliente
 protected double valorhamburguesa, valorhotdog, valorpapas, valorrefresco, valorTotal;//
 protected String cliente;
 Scanner sc= new Scanner(System.in);
        public void contraseña()
        {
            System.out.println("Hola escribe la contraseña: ");
            pswd = sc.nextInt();

        }
        public void mensajeCliente()
        {
            System.out.println("Bienvenido: " + cliente);
        }
        public void datoCliente()
        {
            System.out.println("Hola escribe tu nombre y pedir tu orden: ");
            cliente = sc.nextLine();
        }
       public void cartaAdministrador()
       {
           System.out.println("**********************************");
           System.out.println("*          CARTA                 *");
           System.out.println("* Hamburguesa ------------ $ " + valorhamburguesa + " *");
           System.out.println("* Hotdog------------------ $ " + valorhotdog + " *");
           System.out.println("* Papas------------------- $ " + valorpapas + " *");
           System.out.println("* Refresco---------------- $ " + valorrefresco + " *");
           System.out.println("**********************************");
       }
       public void notaOrden()
       {
           System.out.println("**********************************");
           System.out.println("*          Nota                  *");
           System.out.println(hamburguesa + " Hamburguesa ------------ $ " + valorhamburguesa);
           System.out.println(hotdog + " Hotdog------------------ $ " + valorhotdog);
           System.out.println(papas + " Papas------------------- $ " + valorpapas);
           System.out.println(refresco + " Refresco---------------- $ " + valorrefresco);
           System.out.println("Total a pagar ________________ $ " + valorTotal);
           System.out.println("**********************************");
       }
        public abstract void datos(); // Comportamiento
}
