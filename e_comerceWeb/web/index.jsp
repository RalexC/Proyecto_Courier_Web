<%-- 
    Document   : index
    Created on : 29-mar-2019, 19:02:41
    Author     : Ralex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilosnuevo.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body> 
        <header id="header">        

            <nav class="menu">                           
                <ul>
                    <li>
                        <a href="Controlador?accion=listar" class="current">
                            Inicio
                        </a>
                    </li>
                    <li>
                        <a href="ControladorFactura?accion=listar">
                            Conocenos
                        </a>
                    </li>

                    <li>
                        <a href="#services">
                            Ubiquenos
                        </a>
                    </li>
                    <li>
                        <a href="#footer">
                            Contactanos
                        </a>
                    </li>
                </ul>

            </nav>
        </header>
        <!-- BANNER -->

        <section id="banner">
            <div class="inner">
                <header>
                    <h2>Tracking</h2>
                </header>
                <hr>
                <p>Realiza el <strong>seguimiento</strong>
                    de tu producto</p>      
                <hr>
                <footer>
                    <ul class="buttons stacked">
                        <label>Remito : </label>
                        <input class="txtfield" type="text" name="" id="">
                        
                    </ul>
                    <a href="#main">Realizar Seguimiento</a>
                </footer>                  
            </div>                
        </section>            


        <!-- SECCION AND ARTICLE -->
        <!-- ICONS -->
        <main id="main">
            <section class="articulo1" id="skills">
                <div class="contenedor-section">
                    
                        <div class="icon">
                            <img src="img/ico1.jpg">
                            <h3>Web Design</h3>      
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident praesentium voluptas, hic quia veritatis eaque ipsam. Pariatur itaque repellat dolor tempore aut recusandae, consectetur ad.</p>
                        </div>
                </div>        

                 <div class="contenedor-section">
                        <div class="icon">
                            <img src="img/ico2.jpg">
                            <h3>Graphic Design</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident praesentium voluptas, hic quia veritatis eaque ipsam. Pariatur itaque repellat dolor tempore aut recusandae, consectetur ad.</p>
                        </div>
                 </div>

                <div class="contenedor-section">
                        <div class="icon">
                            <img src="img/ico3.jpg">
                            <h3>Development</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident praesentium voluptas, hic quia veritatis eaque ipsam. Pariatur itaque repellat dolor tempore aut recusandae, consectetur ad.</p>

                        </div>
                    
                </div>
            </section>            
        </main>
        
        <!-- UBICACION -->
            
            <section id="ubigeo">
                <div class="articulo2" id="services">
                    <div class="contenido-ubigeo">
                        <h3>Av. Aviacion Nro. 5092 Int. 428 (4to Piso - C.C.Santa Rosa de Higuereta)</h3>
                        <p>La empresa se encuentra ubicada en asdasdasdasdasdasdasdasdasdasdasdasdasdasdasd
                        asdsadadssssssssssssssssssssssssssssssssssss
                        asddddddddddddddddddddddddddddddddddddddd</p>
                        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3900.7808976061906!2d-77.0014746!3d-12.1271384!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105c7f8484e33a9%3A0xb303eedd4ff62ad9!2sCentro+Comercial+Santa+Rosa%2C+Av.+Aviaci%C3%B3n+5092%2C+Santiago+de+Surco+15038!5e0!3m2!1ses!2spe!4v1557813943083!5m2!1ses!2spe" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>

                    </div>
                </div>

            </section>
        
        <section id="Contactos">
            <h3>Contactenos</h3>
            <div class="contenedor-formulario">
                <form class="formulario">                
                    <label class="lbl">Tipo de Persona: </label><br>
                <select id="" name="">
                    <option value="x">Persona Juridica</option>
                    <option value="y">Persona Natural</option>                    
                </select><br>
                <label class="lbl">Tipo de Documento: </label><br>
                <select>
                    <option value="s">Dni</option>
                    <option value="d">Carnet Extranjeria</option>
                    <option value="f">Pasaporte</option>
                    <option value="g">Ruc</option>                    
                </select><br>
                <label class="lbl">Nª de Documento: </label>    <br>           
                <input class="txt" type="text" name=""><br>
                <label class="lbl">Telefono: </label><br>
                <input class="txt" type="text" name=""><br>
                <label class="lbl">Email: </label><br>
                <input class="txt" type="text" name=""><br><br>
                
                <a href="">Enviar</a>
            </form>
                
            </div>
            
        </section>
                
        <!-- FOOTER -->
        <footer id="footer">
            <div class="contenedor-all-footer" id="footer">
                <div class="footer-text">
                    <div class="contenedor-text">                    

                        <a href="index.jsp">Home</a>                        
                        <a href="#inicio">Skills</a>                        
                        <a href="#skills">Catalogo</a>                       
                        <a href="#servicios">Publicidad</a>                        
                        <a href="#footer">Contact</a>

                    </div>
                </div>
                <div class="footer-icons">
                    <div class="contenedor-iconos">

                        <a href="https://www.instagram.com/"><img src="img/instragram.png"></a>
                        <a href="https://www.facebook.com/"><img src="img/faceboock.png"></a>
                        <a href="https://twitter.com/"><img src="img/twit.png"></a>
                        <a href="https://web.whatsapp.com/"><img src="img/wasap.png"></a>                       

                    </div>
                </div>
                <div class="copy">
                    <p>
                        &copy; <a href="#">MiPaginaWeb.com</a>
                    </p>
                </div>

            </div>


        </footer>

    </body>
</html>
