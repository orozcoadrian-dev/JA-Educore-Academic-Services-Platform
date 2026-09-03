package Backend.Models;

import java.time.LocalDate;

public class Request 
{
	private int idRequest;
	private String requestIdNumber;
	private LocalDate creationDate;
	private String requestDescription;
	private int idStudent;
	private Integer idOfficial;
	private int typeIdRequest;
	private String requestStatus;
	private LocalDate lastUpdateDate;
}
