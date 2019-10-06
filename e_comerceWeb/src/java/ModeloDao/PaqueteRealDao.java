/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloBean.PaqueteBean;
import ModeloBean.PaqueteReal;
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
public class PaqueteRealDao {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    PaqueteReal p=new PaqueteReal();
    
    
    public List listar() {
        ArrayList<PaqueteReal>list=new ArrayList<>();
        String sql="SELECT * FROM PAQUETE";
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                PaqueteReal per=new PaqueteReal();
                per.setCodpaq(rs.getString(1));
                per.setCodgui(rs.getString(2));
                per.setTipopaq(rs.getString(3));
                per.setEstapaq(rs.getString(4));
                per.setDescpaq(rs.getString(5));                         
                list.add(per);
            }
        } catch (Exception e) {e.printStackTrace();}
        return list;
    }
}
