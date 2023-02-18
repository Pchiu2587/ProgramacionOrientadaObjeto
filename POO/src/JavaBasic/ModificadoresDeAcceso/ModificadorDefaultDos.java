package JavaBasic.ModificadoresDeAcceso;

public class ModificadorDefaultDos
{
    public static void main(String[] args)
    {
        ModificadorDefault objetoModificadorDefault = new ModificadorDefault();
        ModificadorPublico objetoModificadorPublico = new ModificadorPublico();

        // Creando un objeto y hacer uso de sus metodos y atributos por medio de la palabra "new"

        objetoModificadorDefault.ejemplo();
        objetoModificadorDefault.ejemploDos();
        objetoModificadorPublico.ejemploTres();

    }

}
