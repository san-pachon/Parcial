public class ServicioVuelo{
    public void consultarVuelos(){
        System.out.println("Consultando vuelos disponibles...");
        System.out.println("- Vuelo 1: Bogota a Miami, 10:00 AM");
        System.out.println("- Vuelo 2: Miami a Madrid, 3:00 PM");
    }
    public void reservarVuelo(){
        System.out.println("Reserva de vuelo realizada");
    }
    public void comprarBillete(String tarjetaCredito){
        System.out.println("Comprar hecha con tarjeta: " + tarjetaCredito);
        System.out.println("Billete generado");
    }
}