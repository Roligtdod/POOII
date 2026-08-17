package Pedidos;

public class PedidoEncomienda extends Pedido implements Interfaz{

    int peso;
    String embalaje;

    public PedidoEncomienda(int idpedido, String direccionEntrega, String tipoDePedido, int peso, String embalaje) {
        super(idpedido, direccionEntrega, tipoDePedido);
        this.peso = peso;
        this.embalaje = embalaje;

    }

    @Override
    public void AsignarRepartidor(){
        System.out.println("Asignando repartidor para Pedido de encomienda");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Peso del pedido :" + peso);
        System.out.println("Embalaje del pedido :" + embalaje);
        System.out.println("Asignando repartidor :" + nombreRepartidor);
        System.out.println("------Encomienda enviada------");
    }



}
