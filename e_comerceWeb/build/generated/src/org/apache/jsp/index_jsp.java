package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilosnuevo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <header id=\"header\">        \n");
      out.write("\n");
      out.write("            <nav class=\"menu\">                           \n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Controlador?accion=listar\" class=\"current\">\n");
      out.write("                            Inicio\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"ControladorFactura?accion=listar\">\n");
      out.write("                            Conocenos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#services\">\n");
      out.write("                            Ubiquenos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#footer\">\n");
      out.write("                            Contactanos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- BANNER -->\n");
      out.write("\n");
      out.write("        <section id=\"banner\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header>\n");
      out.write("                    <h2>Tracking</h2>\n");
      out.write("                </header>\n");
      out.write("                <hr>\n");
      out.write("                <p>Realiza el <strong>seguimiento</strong>\n");
      out.write("                    de tu producto</p>      \n");
      out.write("                <hr>\n");
      out.write("                <footer>\n");
      out.write("                    <ul class=\"buttons stacked\">\n");
      out.write("                        <label>Remito : </label>\n");
      out.write("                        <input class=\"txtfield\" type=\"text\" name=\"\" id=\"\">\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"#main\">Realizar Seguimiento</a>\n");
      out.write("                </footer>                  \n");
      out.write("            </div>                \n");
      out.write("        </section>            \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- SECCION AND ARTICLE -->\n");
      out.write("        <!-- ICONS -->\n");
      out.write("        <main id=\"main\">\n");
      out.write("            <section class=\"articulo1\" id=\"skills\">\n");
      out.write("                <div class=\"contenedor-section\">\n");
      out.write("                    \n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <img src=\"img/ico1.jpg\">\n");
      out.write("                            <h3>Web Design</h3>      \n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident praesentium voluptas, hic quia veritatis eaque ipsam. Pariatur itaque repellat dolor tempore aut recusandae, consectetur ad.</p>\n");
      out.write("                        </div>\n");
      out.write("                </div>        \n");
      out.write("\n");
      out.write("                 <div class=\"contenedor-section\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <img src=\"img/ico2.jpg\">\n");
      out.write("                            <h3>Graphic Design</h3>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident praesentium voluptas, hic quia veritatis eaque ipsam. Pariatur itaque repellat dolor tempore aut recusandae, consectetur ad.</p>\n");
      out.write("                        </div>\n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("                <div class=\"contenedor-section\">\n");
      out.write("                        <div class=\"icon\">\n");
      out.write("                            <img src=\"img/ico3.jpg\">\n");
      out.write("                            <h3>Development</h3>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident praesentium voluptas, hic quia veritatis eaque ipsam. Pariatur itaque repellat dolor tempore aut recusandae, consectetur ad.</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </section>            \n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <!-- UBICACION -->\n");
      out.write("            \n");
      out.write("            <section id=\"ubigeo\">\n");
      out.write("                <div class=\"articulo2\" id=\"services\">\n");
      out.write("                    <div class=\"contenido-ubigeo\">\n");
      out.write("                        <h3>Av. Aviacion Nro. 5092 Int. 428 (4to Piso - C.C.Santa Rosa de Higuereta)</h3>\n");
      out.write("                        <p>La empresa se encuentra ubicada en asdasdasdasdasdasdasdasdasdasdasdasdasdasdasd\n");
      out.write("                        asdsadadssssssssssssssssssssssssssssssssssss\n");
      out.write("                        asddddddddddddddddddddddddddddddddddddddd</p>\n");
      out.write("                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3900.7808976061906!2d-77.0014746!3d-12.1271384!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105c7f8484e33a9%3A0xb303eedd4ff62ad9!2sCentro+Comercial+Santa+Rosa%2C+Av.+Aviaci%C3%B3n+5092%2C+Santiago+de+Surco+15038!5e0!3m2!1ses!2spe!4v1557813943083!5m2!1ses!2spe\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("        <section id=\"Contactos\">\n");
      out.write("            <h3>Contactenos</h3>\n");
      out.write("            <div class=\"contenedor-formulario\">\n");
      out.write("                <form class=\"formulario\">                \n");
      out.write("                    <label class=\"lbl\">Tipo de Persona: </label><br>\n");
      out.write("                <select id=\"\" name=\"\">\n");
      out.write("                    <option value=\"x\">Persona Juridica</option>\n");
      out.write("                    <option value=\"y\">Persona Natural</option>                    \n");
      out.write("                </select><br>\n");
      out.write("                <label class=\"lbl\">Tipo de Documento: </label><br>\n");
      out.write("                <select>\n");
      out.write("                    <option value=\"s\">Dni</option>\n");
      out.write("                    <option value=\"d\">Carnet Extranjeria</option>\n");
      out.write("                    <option value=\"f\">Pasaporte</option>\n");
      out.write("                    <option value=\"g\">Ruc</option>                    \n");
      out.write("                </select><br>\n");
      out.write("                <label class=\"lbl\">Nª de Documento: </label>    <br>           \n");
      out.write("                <input class=\"txt\" type=\"text\" name=\"\"><br>\n");
      out.write("                <label class=\"lbl\">Telefono: </label><br>\n");
      out.write("                <input class=\"txt\" type=\"text\" name=\"\"><br>\n");
      out.write("                <label class=\"lbl\">Email: </label><br>\n");
      out.write("                <input class=\"txt\" type=\"text\" name=\"\"><br><br>\n");
      out.write("                \n");
      out.write("                <a href=\"\">Enviar</a>\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("                \n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <div class=\"contenedor-all-footer\" id=\"footer\">\n");
      out.write("                <div class=\"footer-text\">\n");
      out.write("                    <div class=\"contenedor-text\">                    \n");
      out.write("\n");
      out.write("                        <a href=\"index.jsp\">Home</a>                        \n");
      out.write("                        <a href=\"#inicio\">Skills</a>                        \n");
      out.write("                        <a href=\"#skills\">Catalogo</a>                       \n");
      out.write("                        <a href=\"#servicios\">Publicidad</a>                        \n");
      out.write("                        <a href=\"#footer\">Contact</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-icons\">\n");
      out.write("                    <div class=\"contenedor-iconos\">\n");
      out.write("\n");
      out.write("                        <a href=\"https://www.instagram.com/\"><img src=\"img/instragram.png\"></a>\n");
      out.write("                        <a href=\"https://www.facebook.com/\"><img src=\"img/faceboock.png\"></a>\n");
      out.write("                        <a href=\"https://twitter.com/\"><img src=\"img/twit.png\"></a>\n");
      out.write("                        <a href=\"https://web.whatsapp.com/\"><img src=\"img/wasap.png\"></a>                       \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copy\">\n");
      out.write("                    <p>\n");
      out.write("                        &copy; <a href=\"#\">MiPaginaWeb.com</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
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
