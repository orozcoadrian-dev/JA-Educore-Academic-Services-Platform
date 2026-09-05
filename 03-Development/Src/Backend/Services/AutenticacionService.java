package Services;

import Models.User;

public class AutenticacionService
{
    public boolean validarCredenciales(String username, String password)
    {
        if (username == null || username.trim().isEmpty())
        {
            return false;
        }

        if (password == null || password.trim().isEmpty())
        {
            return false;
        }

        return true;
    }

    public boolean validarUsuario(User user)
    {
        if (user == null)
        {
            return false;
        }

        return validarCredenciales(user.getUsername(), user.getUserPassword());
    }
}
