/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloBean.PaqueteBean;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ralex
 */
public class PaqueteDao {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    PaqueteBean p=new PaqueteBean();
    
    
    public List listar() {
        ArrayList<PaqueteBean>list=new ArrayList<>();
        String sql="SELECT * FROM VW_FACTURAS";
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                PaqueteBean per=new PaqueteBean();
                per.setCodfac(rs.getString(1));
                per.setCodagente(rs.getString(2));
                per.setCodcliente(rs.getString(3));
                per.setCodruta(rs.getString(4));
                per.setCodpaquete(rs.getString(5));
                per.setDepar(rs.getString(6));
                per.setProv(rs.getString(7));
                per.setDistri(rs.getString(8));
                per.setFechfac(rs.getString(9));
                per.setTelf(rs.getInt(9));          
                list.add(per);
            }
        } catch (Exception e) {e.printStackTrace();}
        return list;
    }
}
