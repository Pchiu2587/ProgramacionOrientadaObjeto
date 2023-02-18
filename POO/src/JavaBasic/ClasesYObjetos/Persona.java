package JavaBasic.ClasesYObjetos;

public class Persona
{
   //Atributos
    String nombre;
    String apellido;
    int edad;
    String nacionalidad;
    String genero;

    public void MostrarInformacion()
    {
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellido :" + apellido);
        System.out.println("Edad :" + edad);
        System.out.println("Nacionalidad :" + nacionalidad);
        System.out.println("Género :" + genero);

        System.out.println("___________________________________");
        System.out.println("Información de Usuario :" + nombre + "," + edad + " " + apellido + nacionalidad + genero);
        System.out.println("___________________________________");
    }
}
