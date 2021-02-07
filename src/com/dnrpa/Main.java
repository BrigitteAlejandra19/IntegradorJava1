package com.dnrpa;

import com.automotor.Automotor;
import com.conductor.Propietario;
import com.tipoAutomotor.TipoDeAutomotor;
import java.time.LocalDate;
import java.util.List;
import static com.automotor.Automotor.USO_PARTICULAR;
import static com.automotor.Automotor.USO_PROFESIONAL;
import static com.conductor.Conductor.AUTORIZADO;
import static com.conductor.Conductor.PROPIETARIO;
import static com.tipoAutomotor.TipoDeAutomotor.*;

public class Main {
    public static void main(String[] args) {

        DNRPA dnrpa = new DNRPA();

        //Crear Registros Seccionales
        RegistroSeccional registroSeccional1 = new RegistroSeccional(1);
        RegistroSeccional registroSeccional2 = new RegistroSeccional(2);
        RegistroSeccional registroSeccional3 = new RegistroSeccional(3);
        RegistroSeccional registroSeccional4 = new RegistroSeccional(4);
        RegistroSeccional registroSeccional5 = new RegistroSeccional(5);
        RegistroSeccional registroSeccional6 = new RegistroSeccional(6);

        //Cargar Registros Seccionales al DNRPA
        dnrpa.agregarRegistroSeccional(registroSeccional1);
        dnrpa.agregarRegistroSeccional(registroSeccional2);
        dnrpa.agregarRegistroSeccional(registroSeccional3);
        dnrpa.agregarRegistroSeccional(registroSeccional4);
        dnrpa.agregarRegistroSeccional(registroSeccional5);
        dnrpa.agregarRegistroSeccional(registroSeccional6);

        //Crear Conductores propietarios
        Propietario propietario1 = new Propietario("Luis", "10101929", "los flores");
        Propietario propietario2 = new Propietario("Ramon", "14072010", "Catia");
        Propietario propietario3 = new Propietario("Melquiades", "10091968", "los magallanes");
        Propietario propietario4 = new Propietario("Segundo", "01122016", "Catia");
        Propietario propietario5 = new Propietario("Lucrecia", "24091965", "san martin");
        Propietario propietario6 = new Propietario("Sandra", "10091965", "Avellaneda");
        Propietario propietario7 = new Propietario("Jose", "28061960", "Microcentro");
        Propietario propietario8 = new Propietario("Kel", "23101984", "Vicente Lopez");
        Propietario propietario9 = new Propietario("Bri", "19061992", "Vicente Lopez");
        Propietario propietario10 = new Propietario("Victoria", "28081934", "Barlovento");

        //Crear Automotores
        Automotor automotor1 = new Automotor( "fgd", USO_PARTICULAR, propietario1, CAMION, LocalDate.now() );
        Automotor automotor2 = new Automotor( "sfg", USO_PROFESIONAL,propietario1, MOTO, LocalDate.now() );
        Automotor automotor3 = new Automotor( "dtg", USO_PARTICULAR,propietario3, MOTO, LocalDate.now() );
        Automotor automotor4 = new Automotor( "ttj", USO_PROFESIONAL,propietario4, AUTO_ELECTRICO, LocalDate.now() );
        Automotor automotor5 = new Automotor( "jugjm", USO_PROFESIONAL,propietario5, COLECTIVO, LocalDate.now() );
        Automotor automotor6 = new Automotor( "yujg", USO_PARTICULAR,propietario6, CAMION, LocalDate.now() );
        Automotor automotor7 = new Automotor( "kyu", USO_PROFESIONAL,propietario7, AUTO, LocalDate.now() );
        Automotor automotor8 = new Automotor( "dghy", USO_PROFESIONAL,propietario8, CAMION, LocalDate.now() );
        Automotor automotor9 = new Automotor( "ght", USO_PROFESIONAL,propietario9, CAMION, LocalDate.now() );
        Automotor automotor10 = new Automotor( "jrsu", USO_PROFESIONAL,propietario10, CAMION, LocalDate.now() );
        Automotor automotor11 = new Automotor( "rsyj", USO_PROFESIONAL,propietario10, CAMION, LocalDate.now() );

        //Registrar automotores en Registros seccionales
        registroSeccional1.agregarAutomotor(automotor1);
        registroSeccional1.agregarAutomotor(automotor6);
        registroSeccional2.agregarAutomotor(automotor2);
        registroSeccional3.agregarAutomotor(automotor3);
        registroSeccional4.agregarAutomotor(automotor4);
        registroSeccional5.agregarAutomotor(automotor5);
        registroSeccional6.agregarAutomotor(automotor7);
        registroSeccional2.agregarAutomotor(automotor8);
        registroSeccional3.agregarAutomotor(automotor9);
        registroSeccional4.agregarAutomotor(automotor10);
        registroSeccional5.agregarAutomotor(automotor11);

        //"Se desea poder listar todos los autos registrados en todas las seccionales"
        System.out.println("Existen los siguientes autos registrados en los Registros Seccionales: ");
        dnrpa.mostrarAutomotoresEnRegistros();

        //System.out.println("Existes los siguientes propietarios de Camiones por Registro Seccional");
        //dnrpa.mostrarAutomotoresEnRegistrosPropietario(CAMION);

        List<Automotor> automotoresPropietariosCamion = dnrpa.obtenerAutomotoresEnRegistrosPropietario(CAMION);

        //System.out.println("El total de propietarios de camiones es: " +automotoresPropietariosCamion.size());

        //"Se desea poder listar a todos los propietarios (en orden alfabético) de camiones"
        System.out.println("Nombres de los propietarios de camiones");
        dnrpa.mostrarAutomotoresPropietariosCamionEnOrdenAlfabetico(automotoresPropietariosCamion);
    }
}
