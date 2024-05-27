package Modelo;
public class Producto 
{
    private int canditad;
    private String codigo, nombre;

    public Producto(int canditad, String codigo, String nombre) {
        this.canditad = canditad;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCanditad() {
        return canditad;
    }

    public void setCanditad(int canditad) {
        this.canditad = canditad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
