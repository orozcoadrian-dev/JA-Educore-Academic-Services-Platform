package Services;

import java.time.LocalDate;

public class ReporteService
{
    public boolean validarFechas(LocalDate fechaInicial, LocalDate fechaFinal)
    {
        if (fechaInicial == null || fechaFinal == null)
        {
            return false;
        }

        return !fechaInicial.isAfter(fechaFinal);
    }

    public boolean validarEstado(String status)
    {
        return status != null && !status.trim().isEmpty();
    }
}
