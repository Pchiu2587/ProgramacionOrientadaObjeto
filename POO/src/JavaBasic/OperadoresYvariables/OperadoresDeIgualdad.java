package JavaBasic.OperadoresYvariables;

public class OperadoresDeIgualdad
{
    public static void main(String[] args)
    {
        var a =5;
        var b =4;

        var c =(a==b);
        System.out.println("c = " + c);

        var cadena = "hola";
        var cadenaDos = "hola";
        var validacion = cadena == cadenaDos;
        System.out.println("El Resultado es:" + validacion);

        var validacionDos = cadena.equals(cadenaDos);// otro tipo de validacion
        System.out.println("El Resultado es :" + validacionDos);
    }
}
