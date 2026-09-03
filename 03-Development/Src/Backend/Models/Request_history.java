package Backend.Models;
import java.time.LocalDate;

public class Request_history 
{
	private int idHistory;
	private int idRequest;
	private String lastStatus;
	private String currentStatus;
	private LocalDate changeDate;
	private Integer idUser;
	private String observation;
}
