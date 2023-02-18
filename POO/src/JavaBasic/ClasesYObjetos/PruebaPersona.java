package JavaBasic.ClasesYObjetos;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona objetoPersona = new Persona();

        objetoPersona.nombre = "Juan Pablo";
        objetoPersona.apellido = "Chiu";
        objetoPersona.edad = 35;
        objetoPersona.nacionalidad = "Mexicano";
        objetoPersona.genero = "Hombre";

        objetoPersona.MostrarInformacion();
    }
}
