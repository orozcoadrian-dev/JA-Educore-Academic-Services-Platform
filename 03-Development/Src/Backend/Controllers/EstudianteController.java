package Controllers;

import Models.Student;
import Services.EstudianteService;

public class EstudianteController
{
    private EstudianteService estudianteService;

    public EstudianteController()
    {
        estudianteService = new EstudianteService();
    }

    public boolean registrarEstudiante(Student student)
    {
        return estudianteService.validarEstudiante(student);
    }

    public boolean actualizarEstudiante(Student student)
    {
        return estudianteService.validarEstudiante(student);
    }
}
