package com.conductor;

public class Propietario extends Conductor{
    public Propietario(String nombre, String dni, String direccion) {
        super(nombre, dni, direccion, PROPIETARIO);
    }
}
