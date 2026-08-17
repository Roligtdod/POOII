package Pedidos;

public class Pedido implements Interfaz {

    private int idpedido;
    private String direccionEntrega;
    private String tipoDePedido;

    public Pedido(int idpedido, String direccionEntrega, String tipoDePedido) {
        this.idpedido = idpedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoDePedido = tipoDePedido;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoDePedido() {
        return tipoDePedido;
    }

    @Override
    public void AsignarRepartidor() {
        System.out.println("Asignando repartidor");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Asignando repartidor " + nombreRepartidor);
    }
}
