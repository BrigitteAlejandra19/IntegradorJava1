package com.automotor;

import com.conductor.Autorizado;
import com.conductor.Propietario;

import java.time.LocalDate;
import java.util.List;

public class Automotor {

    public static final String USO_PARTICULAR = "particular";
    public static final String USO_PROFESIONAL = "profesional";



    //ATRIBUTOS
    private String  patente;
    private String usoAutomotor;
    private String tipoDeAutomotor;
    private LocalDate fechaRegistro;
    private Propietario propietario;
    private List<Autorizado> autorizados;


    //Constructor
    public Automotor(String patente, String usoAutomotor, Propietario propietario, String tipoDeAutomotor, LocalDate fechaRegistro) {
        this.patente = patente;
        this.usoAutomotor = usoAutomotor;
        this.propietario = propietario;
        this.tipoDeAutomotor = tipoDeAutomotor;
        this.fechaRegistro = fechaRegistro;
    }
    //Getters and Setters
    public String getPatente() {
        return patente;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getTipoDeAutomotor() {
        return tipoDeAutomotor;
    }

    public void setAutorizados(List<Autorizado> autorizados) {
        this.autorizados = autorizados;
    }

    public List<Autorizado> getAutorizados() {
        return autorizados;
    }


}
