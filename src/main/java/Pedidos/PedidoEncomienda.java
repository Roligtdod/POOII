package Pedidos;

public class PedidoEncomienda extends Pedido implements Interfaz{

    int peso;
    String embalaje;

    public PedidoEncomienda(int idpedido, String direccionEntrega, String tipoDePedido, double distanciaKm, int peso, String embalaje) {
        super(idpedido, direccionEntrega, tipoDePedido, distanciaKm);
        this.peso = peso;
        this.embalaje = embalaje;

    }

    @Override
    public void AsignarRepartidor(){
        System.out.println("Asignando repartidor para Pedido de encomienda");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("-----------------------------");
        System.out.println("Peso del pedido: " + peso);
        System.out.println("Embalaje del pedido: " + embalaje);
        System.out.println("Asignando repartidor: " + nombreRepartidor);
    }


    @Override
    public void calcularTiempoDeEntrega() {
        int tiempoEntrega = (int) (20 + getDistanciaKm()*1.5);

        System.out.println("Dirección de entrega: "+getDireccionEntrega());
        System.out.println("Tiempo de entrega estimado: "+tiempoEntrega+" minutos");
        System.out.println("-----------------------------");

    }
}
