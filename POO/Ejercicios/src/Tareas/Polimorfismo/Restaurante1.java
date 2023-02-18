package Tareas.Polimorfismo;

import java.util.Scanner;

public class Restaurante1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int slct,pswd;

        System.out.println("******* BIENVENIDO *******");
        System.out.println("* Restaurant a la Burger *");
        System.out.println(" Elige una opción: ");
        System.out.println("__________________________");
        System.out.println("-   1. Administrador     -");
        System.out.println("-   2. Cliente           -");
        System.out.println("__________________________");
        slct = sc.nextInt();

        if (slct ==1)
        {

            Menu menu= new Administrador();
            menu.contraseña();
            menu.datos();
            menu.cartaAdministrador();

        }
        else if (slct ==2)
        {
            Menu menu= new Cliente1();
            menu.datoCliente();
            menu.mensajeCliente();
            menu.cartaAdministrador();
            menu.datos();
            menu.notaOrden();

        }
        else
        {
            System.out.println(" Seleciona un valor valido. X");
        }

    }
}
