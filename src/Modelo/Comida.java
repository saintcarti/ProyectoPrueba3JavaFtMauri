package Modelo;
public class Comida extends Producto{
    int valor;
    String tipoComida;

    public Comida(int valor, String tipoComida, int canditad, String codigo, String nombre) {
        super(canditad, codigo, nombre);
        this.valor = valor;
        this.tipoComida = tipoComida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    
    
}
