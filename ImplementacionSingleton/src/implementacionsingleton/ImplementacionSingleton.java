package implementacionsingleton;

public class ImplementacionSingleton {

    public static void main(String[] args) {
        Singleton estudiante = Singleton.getSingleton("Juan Camilo Martinez Lopez", "20171020074");
        System.out.println("el estudiante se llama " + estudiante.getNombre() + " y tiene el codigo " + estudiante.getCodigo());
        Singleton estudiante2 = Singleton.getSingleton("jose antonio", "20171020001");
    }

}
