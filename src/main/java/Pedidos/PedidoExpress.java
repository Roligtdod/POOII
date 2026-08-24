package Pedidos;

public class PedidoExpress extends Pedido implements Interfaz{
    public PedidoExpress(int idpedido, String direccionEntrega, String tipoDePedido,double distanciaKm) {
        super(idpedido, direccionEntrega, tipoDePedido, distanciaKm);

    }


    @Override
    public void AsignarRepartidor(){
        System.out.println("Asignando repartidor para Pedido Express, se buscara al repartidor mas cercano");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor cercano encontrado");
        System.out.println("Asignando repartidor: " + nombreRepartidor);

    }

    @Override
    public void calcularTiempoDeEntrega() {
        if (getDistanciaKm() > 5){
            System.out.println("Dirección de entrega: "+getDireccionEntrega());
            System.out.println("Tiempo de entrega estimado: "+(int) (15+(2 * getDistanciaKm()))+" minutos");
            System.out.println("------Pedido enviado------");
        }
        else{
            System.out.println("Dirección de entrega: "+getDireccionEntrega());
            System.out.println("Tiempo de entrega estimado: "+(int) (10+(2 * getDistanciaKm()))+ " minutos ");
            System.out.println("------Pedido enviado------");
        }

    }
}
