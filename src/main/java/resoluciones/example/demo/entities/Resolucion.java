package resoluciones.example.demo.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "resoluciones")
public class Resolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoDeAgrupamiento;
    private String tipodeGestion;

    private String nomina;
    private String tipoDeCertificacion;
    private String denomiCertificacion;
    private String marcoDeReferencia;
    private String uRLresolucionAprobatoriaDC;
    private String resolucionValidezNacional;

    private String instituciones;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimientoUPlazoDeVigenciaCABA;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimientoUPlazoDeVigenciaNAC;
    private String cargaHoraria;



    public Resolucion() {
    }

    public Resolucion(Long id, String tipoDeAgrupamiento, String tipodeGestion, String nomina, String tipoDeCertificacion, String denomiCertificacion, String marcoDeReferencia, String uRLresolucionAprobatoriaDC, String resolucionValidezNacional, String instituciones, Date fechaVencimientoUPlazoDeVigenciaCABA, Date fechaVencimientoUPlazoDeVigenciaNAC, String cargaHoraria) {
        this.id = id;
        this.tipoDeAgrupamiento = tipoDeAgrupamiento;
        this.tipodeGestion = tipodeGestion;
        this.nomina = nomina;
        this.tipoDeCertificacion = tipoDeCertificacion;
        this.denomiCertificacion = denomiCertificacion;
        this.marcoDeReferencia = marcoDeReferencia;
        this.uRLresolucionAprobatoriaDC = uRLresolucionAprobatoriaDC;
        this.resolucionValidezNacional = resolucionValidezNacional;
        this.instituciones = instituciones;
        this.fechaVencimientoUPlazoDeVigenciaCABA = fechaVencimientoUPlazoDeVigenciaCABA;
        this.fechaVencimientoUPlazoDeVigenciaNAC = fechaVencimientoUPlazoDeVigenciaNAC;
        this.cargaHoraria = cargaHoraria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getuRLresolucionAprobatoriaDC() {
        return uRLresolucionAprobatoriaDC;
    }

    public void setuRLresolucionAprobatoriaDC(String uRLresolucionAprobatoriaDC) {
        this.uRLresolucionAprobatoriaDC = uRLresolucionAprobatoriaDC;
    }

    public String getResolucionValidezNacional() {
        return resolucionValidezNacional;
    }

    public void setResolucionValidezNacional(String resolucionValidezNacional) {
        this.resolucionValidezNacional = resolucionValidezNacional;
    }

    public String getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(String instituciones) {
        this.instituciones = instituciones;
    }

    public Date getFechaVencimientoUPlazoDeVigenciaCABA() {
        return fechaVencimientoUPlazoDeVigenciaCABA;
    }

    public void setFechaVencimientoUPlazoDeVigenciaCABA(Date fechaVencimientoUPlazoDeVigenciaCABA) {
        this.fechaVencimientoUPlazoDeVigenciaCABA = fechaVencimientoUPlazoDeVigenciaCABA;
    }

    public Date getFechaVencimientoUPlazoDeVigenciaNAC() {
        return fechaVencimientoUPlazoDeVigenciaNAC;
    }

    public void setFechaVencimientoUPlazoDeVigenciaNAC(Date fechaVencimientoUPlazoDeVigenciaNAC) {
        this.fechaVencimientoUPlazoDeVigenciaNAC = fechaVencimientoUPlazoDeVigenciaNAC;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
