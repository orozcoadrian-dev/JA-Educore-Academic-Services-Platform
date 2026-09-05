package Controllers;

import java.time.LocalDate;

import Services.ReporteService;

public class ReporteController
{
    private ReporteService reporteService;

    public ReporteController()
    {
        reporteService = new ReporteService();
    }

    public boolean consultarReporte(LocalDate fechaInicial, LocalDate fechaFinal)
    {
        return reporteService.validarFechas(fechaInicial, fechaFinal);
    }

    public boolean consultarReportePorEstado(String status)
    {
        return reporteService.validarEstado(status);
    }
}
