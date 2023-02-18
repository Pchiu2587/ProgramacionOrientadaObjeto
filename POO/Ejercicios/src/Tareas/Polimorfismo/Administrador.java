package Tareas.Polimorfismo;

import java.util.Scanner;

public class Administrador extends Menu
{
 @Override
 public void datos()
 {
  //Scanner sc= new Scanner(System.in);
  if(pswd == 1234)
  {
   System.out.println("Valor para Hamburguesa: ");
   valorhamburguesa = sc.nextDouble();
   System.out.println("Valor para Hotdog: ");
   valorhotdog = sc.nextDouble();
   System.out.println("Valor para Papas: ");
   valorpapas = sc.nextDouble();
   System.out.println("Valor para Refresco: ");
   valorrefresco = sc.nextDouble();

  }
  else
  {
   System.out.println("Contraseña incorreta.");
  }
 }
}
