package Services;

import Models.Request;
import Models.Request_history;
import Models.Request_type;

public class SolicitudService
{
    public boolean validarSolicitud(Request request)
    {
        if (request == null)
        {
            return false;
        }

        if (request.getRequestIdNumber() == null || request.getRequestIdNumber().trim().isEmpty())
        {
            return false;
        }

        if (request.getIdStudent() <= 0 || request.getTypeIdRequest() <= 0)
        {
            return false;
        }

        if (request.getRequestStatus() == null || request.getRequestStatus().trim().isEmpty())
        {
            return false;
        }

        return request.getCreationDate() != null;
    }

    public boolean validarTipoSolicitud(Request_type requestType)
    {
        if (requestType == null)
        {
            return false;
        }

        return requestType.getRequestTypeName() != null
            && !requestType.getRequestTypeName().trim().isEmpty()
            && requestType.getRequestTypeDescription() != null
            && !requestType.getRequestTypeDescription().trim().isEmpty();
    }

    public boolean validarHistorial(Request_history history)
    {
        if (history == null)
        {
            return false;
        }

        if (history.getIdRequest() <= 0)
        {
            return false;
        }

        return history.getLastStatus() != null
            && !history.getLastStatus().trim().isEmpty()
            && history.getCurrentStatus() != null
            && !history.getCurrentStatus().trim().isEmpty()
            && history.getChangeDate() != null;
    }
}
