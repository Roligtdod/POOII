package Pedidos;



public class PedidoComida extends Pedido implements Interfaz{
    private final String mochilaTermica;


    public PedidoComida(int idpedido, String direccionEntrega, String tipoDePedido, String mochilaTermica) {
        super(idpedido, direccionEntrega, tipoDePedido);
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
        }
        else{
            System.out.println("Asignando repartidor :" + nombreRepartidor);
            System.out.println("------Pedido enviado------");
        }

    }

}
