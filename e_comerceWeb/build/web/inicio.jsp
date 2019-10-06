<%-- 
    Document   : inicio
    Created on : 13-may-2019, 23:49:39
    Author     : Ralex
--%>

<%@page import="ModeloBean.PaqueteReal"%>
<%@page import="ModeloDao.PaqueteRealDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="ModeloBean.PaqueteBean"%>
<%@page import="ModeloDao.PaqueteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="js/BuscadorTabla.js" type="text/javascript"></script>
        <title>VEL COURIER SA</title>
    </head>
    <body>
        <h1>Facturas</h1>  
        <label>Buscar: </label>
        <input id="searchTerm" type="text" onkeyup="doSearch()" /> 
        <br>
        <br>
        <div class="container" >


            <table class="table table-bordered" id="datos">
                <thead>
                    <tr>
                        <th class="text-center">CODIGO</th>
                        <th class="text-center">CODGUIA</th>
                        <th class="text-center">TIPO</th>
                        <th class="text-center">ESTADO</th>
                        <th class="text-center">DESCRIPCION</th>
                       
                    </tr>
                </thead>
                <%
                    PaqueteRealDao dao = new PaqueteRealDao();
                    List<PaqueteReal> list = dao.listar();
                    Iterator<PaqueteReal> iter = list.iterator();
                    PaqueteReal per = null;
                    while (iter.hasNext()) {
                        per = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getCodpaq()%></td>
                        <td class="text-center"><%= per.getCodgui()%></td>
                        <td class="text-center"><%= per.getTipopaq()%></td>
                        <td class="text-center"><%= per.getEstapaq()%></td>
                        <td class="text-center"><%= per.getDescpaq()%></td>                                            

                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= per.getCodpaq()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getCodpaq()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table></div>
    </body>
</html>
