package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloBean.PaqueteReal;
import ModeloDao.PaqueteRealDao;
import java.util.Iterator;
import java.util.List;
import ModeloBean.PaqueteBean;
import ModeloDao.PaqueteDao;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>VEL COURIER SA</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Facturas</h1>  \n");
      out.write("        <label>Buscar: </label>\n");
      out.write("        <input id=\"searchTerm\" type=\"text\" onkeyup=\"doSearch()\" /> \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table table-bordered\" id=\"datos\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\">CODIGO</th>\n");
      out.write("                        <th class=\"text-center\">CODGUIA</th>\n");
      out.write("                        <th class=\"text-center\">TIPO</th>\n");
      out.write("                        <th class=\"text-center\">ESTADO</th>\n");
      out.write("                        <th class=\"text-center\">DESCRIPCION</th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    PaqueteRealDao dao = new PaqueteRealDao();
                    List<PaqueteReal> list = dao.listar();
                    Iterator<PaqueteReal> iter = list.iterator();
                    PaqueteReal per = null;
                    while (iter.hasNext()) {
                        per = iter.next();

                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getCodpaq());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getCodgui());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getTipopaq());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getEstapaq());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getDescpaq());
      out.write("</td>                                            \n");
      out.write("\n");
      out.write("                        <td class=\"text-center\">\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"Controlador?accion=editar&id=");
      out.print( per.getCodpaq());
      out.write("\">Editar</a>\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"Controlador?accion=eliminar&id=");
      out.print( per.getCodpaq());
      out.write("\">Remove</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
