package Tareas.Polimorfismo;

import java.util.Scanner;

public class Cliente1 extends Menu
{
@Override
    public void datos()
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Tomamos tu orden: ");
    System.out.println("Cuantas Hamburguesas: ");
    hamburguesa = sc.nextInt();
    System.out.println("Cuántos Hotdogs : ");
    hotdog = sc.nextInt();
    System.out.println("Cuántas papas: ");
    papas = sc.nextInt();
    System.out.println("Cuántos Refrescos: ");
    refresco = sc.nextInt();

    valorTotal =((hamburguesa * valorhamburguesa) + (hotdog * valorhotdog) + (papas * valorpapas) + (refresco * valorrefresco));

    }


}
