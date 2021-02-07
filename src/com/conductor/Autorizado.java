package com.conductor;

public class Autorizado extends Conductor{
    public Autorizado(String nombre, String dni, String direccion) {
        super(nombre, dni, direccion, AUTORIZADO);
    }
}
