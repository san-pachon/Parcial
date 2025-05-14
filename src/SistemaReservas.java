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
                case 4: if (sesionIniciada) servicioVuelo.reservarVuelo();
                    else System.out.println("Debe iniciar sesión primero.");
                    break;
                case 5: if (sesionIniciada) comprarBillete();
                    else System.out.println("Debe iniciar sesión primero.");
                    break;
                case 6: System.out.println("Saliendo del sistema...");
                    break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }
    private static void mostrarMenu(){
        System.out.println("\n- SISTEMA DE RESERVA DE VUELOS -");
        System.out.println("1.Registrarse");
        System.out.println("2.Iniciar sesión");
        System.out.println("3.Consultar vuelos");
        System.out.println("4.Reservar vuelo");
        System.out.println("5.Comprar billete");
        System.out.println("6.Salir");
        System.out.print("Seleccione una opción: ");
    }
    private static void registrarUsuario(){
        System.out.print("Ingrese su correo electrónico: ");
        String email = scanner.nextLine();
        System.out.print("Cree una contraseña: ");
        String contrasena = scanner.nextLine();
        usuario.registrar(email, contrasena);
        System.out.println("Usuario registrado correctamente.");
    }
    private static boolean iniciarSesion(){
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        if (usuario.validarLogin(email, contrasena)){
            System.out.println("Inicio de sesión exitoso.");
            return true;
        }
        else{
            System.out.println("Credenciales incorrectas.");
            return false;
        }
    }
    private static void comprarBillete(){
        System.out.print("Ingrese su número de tarjeta de crédito: ");
        String tarjeta = scanner.nextLine();
        servicioVuelo.comprarBillete(tarjeta);
    }
}