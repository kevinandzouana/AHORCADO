package ui;

import common.Comprobaciones;
import common.Constantes;
import common.ExcepcionCaracterEspecial;
import domain.Elemento;
import service.GestionElementos;
import service.GestionElementosImplementacion;

import java.util.List;
import java.util.Scanner;

public class EntradaSalida {
    private GestionElementos servicio;

    public EntradaSalida(GestionElementos ge) {
        this.servicio = ge;
    }

    public EntradaSalida() {
        servicio= new GestionElementosImplementacion();
    }

    public void mostrarListaElementos(){
        List<Elemento> lista = servicio.getListaElementos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento "+ i+ ":"+ lista.get(i));
        }
    }
    public static void mostrarListaElementos(GestionElementos ge){
        List<Elemento> lista = ge.getListaElementos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("Elemento "+ i+ ":"+ lista.get(i));
        }
    }
    public static Elemento insertarElemento(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.INSERTAR);
        String id = lector.nextLine();
        String palabra = lector.nextLine();
        try {
            Comprobaciones.comprobarPalabra(palabra);
        } catch (ExcepcionCaracterEspecial e) {
            System.out.println(e.getMessage());
        }
        String categoria = lector.nextLine();
        return new Elemento(id,palabra,categoria);
    }

}
