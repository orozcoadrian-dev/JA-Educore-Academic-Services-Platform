package Services;

import Models.Official;
import Models.User;

public class FuncionarioService
{
    public boolean validarFuncionario(User user, Official official)
    {
        if (user == null || official == null)
        {
            return false;
        }

        if (user.getUserRole() == null || user.getUserRole().trim().isEmpty())
        {
            return false;
        }

        if (official.getPost() == null || official.getPost().trim().isEmpty())
        {
            return false;
        }

        if (official.getArea() == null || official.getArea().trim().isEmpty())
        {
            return false;
        }

        return official.getLinkageDate() != null;
    }
}
