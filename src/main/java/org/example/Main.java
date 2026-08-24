package org.example;

import Pedidos.PedidoComida;
import Pedidos.PedidoEncomienda;
import Pedidos.PedidoExpress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        PedidoComida pedido = new PedidoComida(1,"Las mercedes 55","Comida", 10, "si");
        PedidoEncomienda pedido2 = new PedidoEncomienda(2,"La moneda 10","Encomienda", 30.0, 10, "Fragil");
        PedidoExpress pedido3 = new PedidoExpress(3,"Calle falsa 123","Express", 6.0);

        pedido.AsignarRepartidor("Manuel");
        pedido.calcularTiempoDeEntrega();
        pedido2.AsignarRepartidor("Juan");
        pedido2.calcularTiempoDeEntrega();
        pedido3.AsignarRepartidor("Pedro");
        pedido3.calcularTiempoDeEntrega();


    }
}
