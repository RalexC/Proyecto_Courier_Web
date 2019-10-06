/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBean;

/**
 *
 * @author Ralex
 */
public class PaqueteBean {
    
    String codfac;       
    String codcliente;
    String codagente;
    String codruta;
    String codpaquete;
    String depar;
    String prov;
    String distri;
    String fechfac;
    int telf;

    public String getCodfac() {
        return codfac;
    }

    public void setCodfac(String codfac) {
        this.codfac = codfac;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getCodagente() {
        return codagente;
    }

    public void setCodagente(String codagente) {
        this.codagente = codagente;
    }

    public String getCodruta() {
        return codruta;
    }

    public void setCodruta(String codruta) {
        this.codruta = codruta;
    }

    public String getCodpaquete() {
        return codpaquete;
    }

    public void setCodpaquete(String codpaquete) {
        this.codpaquete = codpaquete;
    }

    public String getDepar() {
        return depar;
    }

    public void setDepar(String depar) {
        this.depar = depar;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDistri() {
        return distri;
    }

    public void setDistri(String distri) {
        this.distri = distri;
    }

    public String getFechfac() {
        return fechfac;
    }

    public void setFechfac(String fechfac) {
        this.fechfac = fechfac;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }
    
    public static String LISTAR = "Select * from Factura";
}
