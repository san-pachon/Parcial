public class Usuario{
    private String email;
    private String contraseña;
    private boolean registrado;
    public void registrar(String email, String contraseña){
        this.email = email;
        this.contraseña = contraseña;
        this.registrado = true;
    }
    public boolean validarLogin(String email, String contraseña){
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }
    public boolean isRegistrado(){
        return registrado;
    }
}