package util;

public class PedidoEncomienda extends Pedido implements Interfaz{

    private final int peso;
    private final String embalaje;
    private int tiempoEntrega;

    public PedidoEncomienda(int idpedido, String direccionEntrega, String tipoDePedido, double distanciaKm, int peso, String embalaje) {
        super(idpedido, direccionEntrega, tipoDePedido, distanciaKm);
        this.peso = peso;
        this.embalaje = embalaje;
    }

    @Override
    public void AsignarRepartidor(){
        System.out.println("---------- Envio de encomienda -------------");
        System.out.println("Asignando repartidor para envio de encomienda....");
        System.out.println("Peso del pedido: " + peso);
        System.out.println("Embalaje del pedido: " + embalaje);
    }


    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("---------- Envio de encomienda -------------");
        System.out.println("Peso del pedido: " + peso);
        System.out.println("Embalaje del pedido: " + embalaje);
        System.out.println("Asignando repartidor: " + nombreRepartidor);
    }


    @Override
    public void calcularTiempoDeEntrega() {
        tiempoEntrega = (int) (20 + getDistanciaKm()*1.5);
    }

    @Override
    public void despachar() {
        System.out.println("ID Encomienda: "+getIdpedido());
        System.out.println("Dirección de entrega: "+getDireccionEntrega());
        System.out.println("Tiempo de entrega estimado: "+tiempoEntrega+" minutos");
        System.out.println("------------- Encomienda Enviada ----------------\n");
    }

    @Override
    public void cancelar() {
        System.out.println("""
                ---------------------------------------------
                ------------- Cancelando pedido -------------
                ---------------------------------------------
                """);
        System.out.println("| ID pedido de encomienda cancelado: "+getIdpedido()+"         |"+
                "\n"+"---------------------------------------------"+"\n");
    }

    @Override
    public void verHistorial() {
        System.out.println("ID: "+getIdpedido() + " - " + getDireccionEntrega() + " - " + getTipoDePedido());
    }

    @Override
    public void MostrarResumen() {
        AsignarRepartidor();
        calcularTiempoDeEntrega();
        despachar();
    }
}
