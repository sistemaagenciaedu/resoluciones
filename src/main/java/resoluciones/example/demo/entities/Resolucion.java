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
    private String ambitoDeDaETP;
    private String familiaProfesional;
    private String tipoDeCertificacion;
    private String DenomiCertificación;
    private String marcoDeReferencia;
    private String resolucionAprobatoriaDC;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimiento;
    private String resoluciónValidezNacional;
    private String cargaHoracia;
    private String Instituciones;
    private String tipodeGestión;

    public Resolucion() {
    }

    public Resolucion(Long id, String ambitoDeDaETP, String familiaProfesional, String tipoDeCertificacion, String denomiCertificación, String marcoDeReferencia, String resolucionAprobatoriaDC, Date fechaVencimiento, String resoluciónValidezNacional, String cargaHoracia, String instituciones, String tipodeGestión) {
        this.id = id;
        this.ambitoDeDaETP = ambitoDeDaETP;
        this.familiaProfesional = familiaProfesional;
        this.tipoDeCertificacion = tipoDeCertificacion;
        DenomiCertificación = denomiCertificación;
        this.marcoDeReferencia = marcoDeReferencia;
        this.resolucionAprobatoriaDC = resolucionAprobatoriaDC;
        this.fechaVencimiento = fechaVencimiento;
        this.resoluciónValidezNacional = resoluciónValidezNacional;
        this.cargaHoracia = cargaHoracia;
        Instituciones = instituciones;
        this.tipodeGestión = tipodeGestión;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmbitoDeDaETP() {
        return ambitoDeDaETP;
    }

    public void setAmbitoDeDaETP(String ambitoDeDaETP) {
        this.ambitoDeDaETP = ambitoDeDaETP;
    }

    public String getFamiliaProfesional() {
        return familiaProfesional;
    }

    public void setFamiliaProfesional(String familiaProfesional) {
        this.familiaProfesional = familiaProfesional;
    }

    public String getTipoDeCertificacion() {
        return tipoDeCertificacion;
    }

    public void setTipoDeCertificacion(String tipoDeCertificacion) {
        this.tipoDeCertificacion = tipoDeCertificacion;
    }

    public String getDenomiCertificación() {
        return DenomiCertificación;
    }

    public void setDenomiCertificación(String denomiCertificación) {
        DenomiCertificación = denomiCertificación;
    }

    public String getMarcoDeReferencia() {
        return marcoDeReferencia;
    }

    public void setMarcoDeReferencia(String marcoDeReferencia) {
        this.marcoDeReferencia = marcoDeReferencia;
    }

    public String getResolucionAprobatoriaDC() {
        return resolucionAprobatoriaDC;
    }

    public void setResolucionAprobatoriaDC(String resolucionAprobatoriaDC) {
        this.resolucionAprobatoriaDC = resolucionAprobatoriaDC;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getResoluciónValidezNacional() {
        return resoluciónValidezNacional;
    }

    public void setResoluciónValidezNacional(String resoluciónValidezNacional) {
        this.resoluciónValidezNacional = resoluciónValidezNacional;
    }

    public String getCargaHoracia() {
        return cargaHoracia;
    }

    public void setCargaHoracia(String cargaHoracia) {
        this.cargaHoracia = cargaHoracia;
    }

    public String getInstituciones() {
        return Instituciones;
    }

    public void setInstituciones(String instituciones) {
        Instituciones = instituciones;
    }

    public String getTipodeGestión() {
        return tipodeGestión;
    }

    public void setTipodeGestión(String tipodeGestión) {
        this.tipodeGestión = tipodeGestión;
    }
}
