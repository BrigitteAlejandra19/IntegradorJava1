package com.dnrpa;

import com.automotor.Automotor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DNRPA {

    //Atributos

    List<RegistroSeccional> registrosSeccionales = new ArrayList<>();


    //Metodo: Para agregar Registro Seccional a la lista de Registros Seccionales a la DNRPA
    public void agregarRegistroSeccional(RegistroSeccional registroSeccional) {
        registrosSeccionales.add(registroSeccional);
    }
    //Metodo: Para mostrar registros seccionales de la lista Registros seccionales
    public void mostrarRegistrosSeccionales() {
        for (int i = 0; i < registrosSeccionales.size(); i++) {
            System.out.println("Registro Seccional: " + registrosSeccionales.get(i).getCodRegistro());
        }
    }
    //Metodo: Para mostrar automotores registrados en los registros seccionales
    public void mostrarAutomotoresEnRegistros() {
        for (int i = 0; i < registrosSeccionales.size(); i++) {
            RegistroSeccional registroSeccional = registrosSeccionales.get(i);
            System.out.println("Registro Seccional: " + registroSeccional.getCodRegistro());
            registroSeccional.mostrarAutomotores();
        }
    }
    //Metodo: Para mostrar automotores de propietarios con tipo de automotor registrados en los registros seccionales
    public void mostrarAutomotoresEnRegistrosPropietario(String tipoAutomotor) {
        for (int i = 0; i < registrosSeccionales.size(); i++) {
            RegistroSeccional registroSeccional = registrosSeccionales.get(i);
            System.out.println("Registro Seccional: " + registroSeccional.getCodRegistro());
            registroSeccional.mostrarAutomotoresPropietario(tipoAutomotor);
        }

    }
    //Metodo: Para llenar la lista automotores de Propietarios con Camiones para poder ordenarlos por orden alfabetico
    public List<Automotor> obtenerAutomotoresEnRegistrosPropietario(String tipoAutomotor) {
        List<Automotor> automotoresPropietariosCamion = new ArrayList<>();
        for (int i = 0; i < registrosSeccionales.size(); i++) {
            RegistroSeccional registroSeccional = registrosSeccionales.get(i);
            List<Automotor> automotoresPropietariosCamionDEUnRegistroEnParticular = registroSeccional.obtenerAutomotoresPropietario(tipoAutomotor);
            automotoresPropietariosCamion.addAll(automotoresPropietariosCamionDEUnRegistroEnParticular);
        }

        return automotoresPropietariosCamion;
    }
    //Metodo: Para ordenar alfabeticamente los nombres de los Propietarios con Camiones
    public void mostrarAutomotoresPropietariosCamionEnOrdenAlfabetico(List<Automotor> automotoresPropietariosCamion) {
        List<String> nombresPropietarios = new ArrayList<>();

        for (int i = 0; i < automotoresPropietariosCamion.size(); i++) {
            nombresPropietarios.add(automotoresPropietariosCamion.get(i).getPropietario().getNombre());
        }
        Collections.sort(nombresPropietarios);
        System.out.println("Conductores desordenados:");
        for (int i = 0; i < automotoresPropietariosCamion.size(); i++) {

            System.out.println("Conductor : " + automotoresPropietariosCamion.get(i).getPropietario().getNombre());
        }
        System.out.println("Conductores ordenados:");
        for (int i = 0; i < nombresPropietarios.size(); i++) {

            System.out.println("Conductor : " + nombresPropietarios.get(i));
        }

    }

}