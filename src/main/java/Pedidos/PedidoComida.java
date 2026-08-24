package Pedidos;



public class PedidoComida extends Pedido implements Interfaz{
    private final String mochilaTermica;


    public PedidoComida(int idpedido, String direccionEntrega, String tipoDePedido, double distanciaKm, String mochilaTermica) {
        super(idpedido, direccionEntrega, tipoDePedido, distanciaKm);
        this.mochilaTermica = mochilaTermica;

    }



    @Override
    public void AsignarRepartidor(){
        System.out.println("Asignando repartidor para Pedido de comida");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Verificando mochila termica");
        if(mochilaTermica.equals("no")){
            System.out.println("Rpartidor no cumple con la mochila termica");
            System.out.println("----Favor asignar otro repartidor----");
        }
        else{
            System.out.println("Asignando repartidor: " + nombreRepartidor);
        }

    }

    @Override
    public void calcularTiempoDeEntrega() {

        System.out.println("Dirección de entrega: "+getDireccionEntrega());
        System.out.println("Tiempo de entrega estimado: "+(int) (15+2*getDistanciaKm()) + " minutos");
        System.out.println("------Pedido enviado------");

    }



}
