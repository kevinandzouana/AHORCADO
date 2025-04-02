package ui;

import common.Constantes;
import service.GestionElementos;
import service.GestionElementosImplementacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        System.out.println(ge.getListaElementos());
        EntradaSalida.mostrarListaElementos(ge);
        ge.insertarElemento(EntradaSalida.insertarElemento());

    }
}