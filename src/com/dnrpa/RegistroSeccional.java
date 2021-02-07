package com.dnrpa;

import com.automotor.Automotor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static com.conductor.Conductor.PROPIETARIO;
import static com.tipoAutomotor.TipoDeAutomotor.CAMION;

public class RegistroSeccional {

    //Atributos
    private Integer codRegistro; // Variable de Instancia
    List<Automotor> listaAutomotores = new ArrayList<>();

    //Constructor
    public RegistroSeccional(Integer codRegistro) {
        this.codRegistro = codRegistro;
    }

    //Getters and Setters
    public Integer getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(Integer codRegistro) {
        this.codRegistro = codRegistro;
    }

    public List<Automotor> getAutomotor() {
        return listaAutomotores;
    }

    public void setAutomotor(List<Automotor> automotor) {
        this.listaAutomotores = automotor;
    }

    //Metodo: Agregar automotores a la lista de registros seccionales
    public void agregarAutomotor(Automotor automotor) {
        listaAutomotores.add(automotor);
    }
    //Metodo: Mostrar automotores
    public void mostrarAutomotores() {
        for (int i = 0; i < listaAutomotores.size(); i++) {
            System.out.println("Automotor: " + listaAutomotores.get(i).getPatente());
        }

    }
    //Metodo: Mostrar automotores de propietarios
    public void mostrarAutomotoresPropietario(String tipoAutomotor) {
        for (int i = 0; i < listaAutomotores.size(); i++) {
            Automotor automotor = listaAutomotores.get(i);
            if (automotor.getPropietario().getTipoDeConductor().equals(PROPIETARIO) && automotor.getTipoDeAutomotor().equals(tipoAutomotor)) {
                System.out.println("Propietario : " + automotor.getPropietario().getNombre() + ", Automotor: " + automotor.getPatente() + ", Tipo de automotor: " + automotor.getTipoDeAutomotor());
            }

        }
    }

    public List<Automotor> obtenerAutomotoresPropietario(String tipoAutomotor) {
        List<Automotor> automotoresPropietariosCamion = new ArrayList<>();
        for (int i = 0; i < listaAutomotores.size(); i++) {
            Automotor automotor = listaAutomotores.get(i);
            if (automotor.getPropietario().getTipoDeConductor().equals(PROPIETARIO) && automotor.getTipoDeAutomotor().equals(tipoAutomotor)) {
                automotoresPropietariosCamion.add(automotor);
            }
        }
        return automotoresPropietariosCamion;
    }
}