package Controllers;

import Models.Official;
import Models.User;
import Services.FuncionarioService;

public class FuncionarioController
{
    private FuncionarioService funcionarioService;

    public FuncionarioController()
    {
        funcionarioService = new FuncionarioService();
    }

    public boolean registrarFuncionario(User user, Official official)
    {
        return funcionarioService.validarFuncionario(user, official);
    }

    public boolean actualizarFuncionario(User user, Official official)
    {
        return funcionarioService.validarFuncionario(user, official);
    }
}
