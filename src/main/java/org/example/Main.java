package org.example;

import Pedidos.PedidoComida;
import Pedidos.PedidoEncomienda;
import Pedidos.PedidoExpress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        PedidoComida pedido = new PedidoComida(1,"Las mercedes 55","Comida", "si");
        PedidoEncomienda pedido2 = new PedidoEncomienda(2,"La moneda 10","Encomienda", 10, "paquete");
        PedidoExpress pedido3 = new PedidoExpress(3,"Calle falsa 123","Express");

        pedido.AsignarRepartidor("Manuel");
        pedido2.AsignarRepartidor("Juan");
        pedido3.AsignarRepartidor("Pedro");


    }
}
