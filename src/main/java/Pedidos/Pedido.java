package Pedidos;

public abstract class Pedido implements Interfaz {

    private int idpedido;
    private String direccionEntrega;
    private String tipoDePedido;
    private double distanciaKm;

    public Pedido(int idpedido, String direccionEntrega, String tipoDePedido, double distanciaKm) {
        this.idpedido = idpedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoDePedido = tipoDePedido;
        this.distanciaKm = distanciaKm;
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

    public double getDistanciaKm() {
        return distanciaKm;
    }

    @Override
    public void AsignarRepartidor() {
        System.out.println("Asignando repartidor");
    }

    public void  AsignarRepartidor(String nombreRepartidor){
        System.out.println("Asignando repartidor " + nombreRepartidor);
    }

    public abstract void calcularTiempoDeEntrega();

}
