package Pedidos;

public class PedidoExpress extends Pedido implements Interfaz{
    public PedidoExpress(int idpedido, String direccionEntrega, String tipoDePedido) {
        super(idpedido, direccionEntrega, tipoDePedido);

    }


    @Override
    public void AsignarRepartidor(){
        System.out.println("Asignando repartidor para Pedido Express, se buscara al repartidor mas cercano");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor cercano encontrado");
        System.out.println("Asignando repartidor :" + nombreRepartidor);
        System.out.println("------Pedido Express enviado------");
    }

}
