package Modelo;

public class Bebida extends Producto{
    String sabor;
    int litros;

    public Bebida(String sabor, int litros, int canditad, String codigo, String nombre) {
        super(canditad, codigo, nombre);
        this.sabor = sabor;
        this.litros = litros;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
    
    
    
}
