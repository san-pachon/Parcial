import java.util.Scanner;
public class SistemaReservas{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Usuario usuario = new Usuario();
    private static final ServicioVuelo servicioVuelo = new ServicioVuelo();
    private static boolean sesionIniciada = false;
    public static void main(String[] args){
        int opcion;
        do{
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1: registrarUsuario();
                    break;
                case 2: sesionIniciada = iniciarSesion();
                    break;
                case 3: if (sesionIniciada) servicioVuelo.consultarVuelos();
                    else System.out.println("Debe iniciar sesión primero.");
                    break;