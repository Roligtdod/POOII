package main;

import util.Pedido;
import util.PedidoComida;
import util.PedidoEncomienda;
import util.PedidoExpress;
import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        PedidoComida pedido = new PedidoComida(1,"Las mercedes 55","Comida", 10, "si");
        PedidoEncomienda pedido2 = new PedidoEncomienda(2,"La moneda 10","Encomienda", 30.0, 10, "Fragil");
        PedidoExpress pedido3 = new PedidoExpress(3,"Calle falsa 123","Express", 6.0);

        pedidos.add(pedido);
        pedidos.add(pedido2);
        pedido3.cancelar();

        for (Pedido pedidototales : pedidos) {
            pedidototales.MostrarResumen();
        }

        System.out.println("Historial de pedidos:");
        for (Pedido pedidototales : pedidos) {
            pedidototales.verHistorial();
        }


    }
}
