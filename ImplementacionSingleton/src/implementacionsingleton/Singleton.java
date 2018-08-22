package implementacionsingleton;

public class Singleton {
    private String nombre;
    private String codigo;
    private static Singleton unico;

    private Singleton(String nombre,String codigo) {
        this.nombre=nombre;
        this.codigo=codigo;

    }
    
    public static Singleton getSingleton(String nombre,String codigo) {
        if (unico == null) {
            unico = new Singleton(nombre,codigo);
        }else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase Singleton");
        }
        return unico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    
    @Override
    
    public Singleton clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar");
        }
        return null;
    }

}
