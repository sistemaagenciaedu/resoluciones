package resoluciones.example.demo.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class ResolucionFilterDTO {


    private String tipoDeAgrupamiento;
    private String tipodeGestion;
    private String nomina;
    private String tipoDeCertificacion;
    private String denomiCertificacion;
    private String marcoDeReferencia;
    private String instituciones;


    private String order;

    public ResolucionFilterDTO() {
    }

    public ResolucionFilterDTO(String tipoDeAgrupamiento, String tipodeGestion, String nomina, String tipoDeCertificacion, String denomiCertificacion, String marcoDeReferencia, String instituciones, String order) {
        this.tipoDeAgrupamiento = tipoDeAgrupamiento;
        this.tipodeGestion = tipodeGestion;
        this.nomina = nomina;
        this.tipoDeCertificacion = tipoDeCertificacion;
        this.denomiCertificacion = denomiCertificacion;
        this.marcoDeReferencia = marcoDeReferencia;
        this.instituciones = instituciones;
        this.order = order;
    }

    public String getTipoDeAgrupamiento() {
        return tipoDeAgrupamiento;
    }

    public void setTipoDeAgrupamiento(String tipoDeAgrupamiento) {
        this.tipoDeAgrupamiento = tipoDeAgrupamiento;
    }

    public String getTipodeGestion() {
        return tipodeGestion;
    }

    public void setTipodeGestion(String tipodeGestion) {
        this.tipodeGestion = tipodeGestion;
    }

    public String getNomina() {
        return nomina;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    public String getTipoDeCertificacion() {
        return tipoDeCertificacion;
    }

    public void setTipoDeCertificacion(String tipoDeCertificacion) {
        this.tipoDeCertificacion = tipoDeCertificacion;
    }

    public String getDenomiCertificacion() {
        return denomiCertificacion;
    }

    public void setDenomiCertificacion(String denomiCertificacion) {
        this.denomiCertificacion = denomiCertificacion;
    }

    public String getMarcoDeReferencia() {
        return marcoDeReferencia;
    }

    public void setMarcoDeReferencia(String marcoDeReferencia) {
        this.marcoDeReferencia = marcoDeReferencia;
    }

    public String getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(String instituciones) {
        this.instituciones = instituciones;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isASC(){
        return this.order.compareToIgnoreCase("ASC")==0;
    }
    public boolean isDESC(){
        return this.order.compareToIgnoreCase("DESC")==0;
    }
}
