package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        try {
            ArrayList<Requerimiento_1> R1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 persona : R1) {
                System.out.printf("%s %s %d\n", persona.getLider(), persona.getCargo(), persona.getProyectos());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2> R2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 persona : R2) {
                System.out.printf("%d %s %d %d %d\n", persona.getIdMaterial(), persona.getNombreMaterial(),
                        persona.getCantidad(), persona.getPrecioUnidad(), persona.getPrecioTotal());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento_3> R3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 persona : R3) {
                System.out.printf("%d %s %s %d\n", persona.getIdProyecto(), persona.getCiudad(),
                        persona.getClasificacion(), persona.getCostoProyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
