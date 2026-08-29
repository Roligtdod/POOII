package util;

public class PedidoExpress extends Pedido implements Interfaz{
    private int tiempoEntrega;
    public PedidoExpress(int idpedido, String direccionEntrega, String tipoDePedido,double distanciaKm) {
        super(idpedido, direccionEntrega, tipoDePedido, distanciaKm);
    }
    @Override
    public void AsignarRepartidor(){
        System.out.println("------ Pedido Express ------");
        System.out.println("Asignando repartidor para Pedido Express, se buscara al repartidor mas cercano");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor cercano encontrado");
        System.out.println("Asignando repartidor: " + nombreRepartidor);

    }

    @Override
    public void calcularTiempoDeEntrega() {
        if (getDistanciaKm() > 5){
            tiempoEntrega = ((int) (15+(2 * getDistanciaKm())));
        }
        else{
            tiempoEntrega = ((int) (10+(2 * getDistanciaKm())));
        }
    }

    @Override
    public void despachar() {
        System.out.println("ID Pedido Express: "+getIdpedido());
        System.out.println("Despachando pedido Express a la direccion: "+getDireccionEntrega());
        System.out.println("Tiempo estimado de entrega: "+tiempoEntrega+" minutos");
        System.out.println("---------- Pedido Express enviado -----------\n");
    }

    @Override
    public void cancelar() {
        System.out.println("""
                ---------------------------------------------
                ------------- Cancelando pedido -------------
                ---------------------------------------------""");
        System.out.println("| ID pedido de express cancelado: "+getIdpedido()+"         |"+
                "\n"+"---------------------------------------------"+"\n");
    }

    @Override
    public void verHistorial() {
        System.out.println("ID: "+getIdpedido() + " - " + getDireccionEntrega() + " - " + getTipoDePedido());
    }
    public void MostrarResumen(){
        AsignarRepartidor();
        calcularTiempoDeEntrega();
        despachar();
    }
}
