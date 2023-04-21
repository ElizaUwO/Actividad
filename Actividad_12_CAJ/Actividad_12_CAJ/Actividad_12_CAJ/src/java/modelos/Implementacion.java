/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class Implementacion implements CRUD{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Triangulo tri = new Triangulo();

    @Override
    public List listar() {
        ArrayList<Triangulo> list = new ArrayList<>();
        String sql = "select * from tabla";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Triangulo figura = new Triangulo();
                figura.setId(rs.getInt("id"));
                figura.setareasResult(Integer.parseInt(rs.getString("Area")));
                figura.setperiResult(Integer.parseInt(rs.getString("Perimetro")));
                list.add(figura);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Triangulo list(int id) {
        String sql = "select * from tabla where id=" + id;
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Triangulo figura = new Triangulo();
                figura.setId(rs.getInt("id"));
                figura.setareasResult(rs.getInt("Area"));
                figura.setperiResult(rs.getInt("Perimetro"));
            }
        } catch (Exception e) {
        }
        return tri;
    }

    @Override
    public boolean add(Triangulo figura) {
        String sql="insert into tabla(Area, Perimetro)values('"+ figura.getareasResult()+"','"+ figura.getperiResult()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){  
        }
        return false;
    }

    @Override
    public boolean edit(Triangulo figura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Triangulo figura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
