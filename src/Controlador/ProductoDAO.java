package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Producto;

public class ProductoDAO
{
    public boolean ingresarProducto(Producto prod)
    {
        boolean resultado=false;
        try {
            Connection con=controlador.Conexion.getConexion();
            String query="insert into tbProductos (codigo,nombre,cantidad) values (?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setInt(3, prod.getCanditad());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }

    public boolean modificarProducto(Producto prod)
    {
        boolean resultado=false;
        try {
            Connection con=controlador.Conexion.getConexion();
            String query="update tbProductos set Nombre=?,Cantidad=? where Codigo=?";
            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setInt(3, prod.getCanditad());

            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }

    public boolean eliminarProducto(String codigo)
    {
        boolean resultado=false;
        try {
            Connection con=controlador.Conexion.getConexion();
            String query="delete from tbProductos where codigo='?'";
            PreparedStatement ps=con.prepareStatement(query);
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList <Producto> obtenerTodos()
    {
        ArrayList <Producto> pro=new ArrayList<>();
        try {
            Connection con=controlador.Conexion.getConexion();
            String query="Select * from tbProductos";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Producto pp;
            while(rs.next())
            {
                pp=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3));
                pro.add(pp);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }

    public Producto buscarProducto(String cod)
    {
        Producto pro=null;
        try {
            Connection con=controlador.Conexion.getConexion();
            String query="select * from tbProductos where codigo='"+cod+"'";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                pro=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }


}
