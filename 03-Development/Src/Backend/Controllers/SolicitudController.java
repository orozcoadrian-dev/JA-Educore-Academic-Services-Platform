package Controllers;

import Models.Request;
import Models.Request_history;
import Models.Request_type;
import Services.SolicitudService;

public class SolicitudController
{
    private SolicitudService solicitudService;

    public SolicitudController()
    {
        solicitudService = new SolicitudService();
    }

    public boolean crearSolicitud(Request request)
    {
        return solicitudService.validarSolicitud(request);
    }

    public boolean actualizarSolicitud(Request request)
    {
        return solicitudService.validarSolicitud(request);
    }

    public boolean registrarTipoSolicitud(Request_type requestType)
    {
        return solicitudService.validarTipoSolicitud(requestType);
    }

    public boolean registrarHistorial(Request_history history)
    {
        return solicitudService.validarHistorial(history);
    }
}
