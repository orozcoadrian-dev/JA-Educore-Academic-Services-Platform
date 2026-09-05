package Controllers;

import Models.User;
import Services.AutenticacionService;

public class AutenticacionController
{
    private AutenticacionService autenticacionService;

    public AutenticacionController()
    {
        autenticacionService = new AutenticacionService();
    }

    public boolean iniciarSesion(String username, String password)
    {
        return autenticacionService.validarCredenciales(username, password);
    }

    public boolean registrarUsuario(User user)
    {
        return autenticacionService.validarUsuario(user);
    }
}
