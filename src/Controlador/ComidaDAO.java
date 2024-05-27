package Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Comida;

public class ComidaDAO {
    public boolean ingresarComida(Comida co){
        boolean resultado = false;
        try{
            Connection con = controlador.Conexion.getConexion();
            String query="insert into tbcomida (codigo,nombre,cantidad,valor,tipoDeComida) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1, co.getCodigo());
            ps.setString(2, co.getNombre());
            ps.setInt(3, co.getCanditad());
            ps.setInt(4,co.getValor());
            ps.setString(5, co.getTipoComida());
            
            resultado = ps.executeUpdate()==1;
            ps.close();
            
        }catch(SQLException|ClassNotFoundException ex){
            Logger.getLogger(ComidaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return resultado;
    }
    public boolean modificarComida(Comida co){
        boolean resultado = false;
        try{
            Connection con = controlador.Conexion.getConexion();
            String query="update tbcomida set codigo=?,nombre=?,cantidad=?,valor=?,tipoDeComida=?";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1, co.getCodigo());
            ps.setString(2 ,co.getNombre());
            ps.setInt(3,co.getCanditad());
            ps.setInt(4, co.getValor());
            ps.setString(5, co.getTipoComida());
            
            resultado = ps.executeUpdate()==1;
            ps.close();
        }catch(SQLException ex){
            Logger.getLogger(ComidaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(ComidaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return resultado;
    }
    public boolean eliminarComida(String codigo){
        boolean resultado = false;
        try{
            Connection con = controlador.Conexion.getConexion();
            String query = "delete from tbcomida where codigo ='?'";
            PreparedStatement ps = con.prepareStatement(query);
            resultado = ps.executeUpdate()==1;
            ps.close();
        }catch(SQLException ex){
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ArrayList<Comida> obtenerTodos() {
    ArrayList<Comida> com = new ArrayList<>();
    try {
        Connection con = controlador.Conexion.getConexion();
        String query = "SELECT * FROM tbcomida";
        try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Comida co = new Comida(0, query, 0, query, query);
                com.add(co);
            }
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(ComidaDAO.class.getName()).log(Level.SEVERE,null,ex);
        ex.printStackTrace(); // Imprime el rastreo de la excepción a la consola
    }
    return com;
  }
   public Comida buscarComida(String codigo) {
    Comida co = null;
    try {
        Connection con = controlador.Conexion.getConexion();
        String query = "SELECT * FROM tbcomida WHERE codigo = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("Valor del campo 3: " + rs.getString(3));
            System.out.println("Valor del campo 4: " + rs.getString(4));
            int campo3 = rs.getInt(3);
            int campo4 = rs.getInt(4);
            if(!rs.wasNull()){
                co = new Comida(rs.getArray().getInt(1),rs.getArray(2),campo3,campo4,rs.getArray(5));
            }
        }
        ps.close();
        con.close();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(ComidaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return co;
}

}
