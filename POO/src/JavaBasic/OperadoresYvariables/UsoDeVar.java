package JavaBasic.OperadoresYvariables;

public class UsoDeVar
{
    public static void main(String[] args){
        var intEntero = 10;
        System.out.println(intEntero);
        var miNombre= "Pablo Chiu";
        var ocupacion= "Tester";

        var perfil= ocupacion + " " + miNombre;
        System.out.println(perfil);

        var i= 3;
        var j= 4;
        System.out.println(i + j);
        System.out.println(i + j + " " + perfil);
    }
}
