package Services;

import Models.Student;

public class EstudianteService
{
    public boolean validarEstudiante(Student student)
    {
        if (student == null)
        {
            return false;
        }

        if (student.getStudentIdNumber() == null || student.getStudentIdNumber().trim().isEmpty())
        {
            return false;
        }

        if (student.getSemester() <= 0)
        {
            return false;
        }

        if (student.getAcademicProgram() == null || student.getAcademicProgram().trim().isEmpty())
        {
            return false;
        }

        if (student.getAcademicStatus() == null || student.getAcademicStatus().trim().isEmpty())
        {
            return false;
        }

        return student.getDateOfEntry() != null;
    }
}
