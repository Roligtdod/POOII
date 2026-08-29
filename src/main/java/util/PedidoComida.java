package util;

public class PedidoComida extends Pedido implements Interfaz{
    private final String mochilaTermica;
    private int tiempoEntrega;


    public PedidoComida(int idpedido, String direccionEntrega, String tipoDePedido, double distanciaKm, String mochilaTermica) {
        super(idpedido, direccionEntrega, tipoDePedido, distanciaKm);
        this.mochilaTermica = mochilaTermica;
    }

    @Override
    public void AsignarRepartidor(){
        System.out.println("----- Envio comida -----");
        System.out.println("Asignando repartidor para envio de comida....");
        System.out.println("Verificando mochila termica....");
        if(mochilaTermica.equals("no")){
            System.out.println("Repartidor no cumple con la mochila termica");
            System.out.println("----Favor asignar otro repartidor----");
            return;
        }

    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Verificando mochila termica");
        if(mochilaTermica.equals("no")){
            System.out.println("Repartidor no cumple con la mochila termica");
            System.out.println("----Favor asignar otro repartidor----");
        }
        else{
            System.out.println("Asignando repartidor: " + nombreRepartidor);
        }

    }

    @Override
    public void calcularTiempoDeEntrega() {
        tiempoEntrega = (int) (15+2*getDistanciaKm());

    }

    @Override
    public void despachar() {
        System.out.println("ID Pedido Comida: "+getIdpedido());
        System.out.println("Dirección de entrega: "+getDireccionEntrega());
        System.out.println("Tiempo de entrega estimado: "+ tiempoEntrega + " minutos");
        System.out.println("------ Pedido enviado ------\n");

    }

    @Override
    public void cancelar() {
        System.out.println("""
                ---------------------------------------------
                ------------- Cancelando pedido -------------
                ---------------------------------------------
                """);
        System.out.println("| ID pedido de comida cancelado: "+getIdpedido()+"         |"+
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
