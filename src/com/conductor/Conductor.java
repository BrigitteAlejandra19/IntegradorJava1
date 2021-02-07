package com.conductor;

public class Conductor {
    //Atributos
    public static final String PROPIETARIO = "propietario";
    public static final String AUTORIZADO = "autorizado";

    private String nombre;
    private String dni;
    private String direccion;
    private String tipoDeConductor;

    //Constructor
    public Conductor(String nombre, String dni, String direccion, String tipoDeConductor) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.tipoDeConductor = tipoDeConductor;
    }
    //Getters
    public String getTipoDeConductor() {
        return tipoDeConductor;
    }

    public String getNombre() {
        return nombre;
    }
}
