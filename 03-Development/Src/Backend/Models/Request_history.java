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

	//Constructor con PK
	public Request_history(int idHistory, int idRequest, String lastStatus, String currentStatus, LocalDate changeDate, Integer idUser, String observation) 
	{
		setIdHistory(idHistory);
		setIdRequest(idRequest);
		setLastStatus(lastStatus);
		setCurrentStatus(currentStatus);
		setChangeDate(changeDate);
		setIdUser(idUser);
		setObservation(observation);
	}

	//Constructor sin PK
	public Request_history(int idRequest, String lastStatus, String currentStatus, LocalDate changeDate, Integer idUser, String observation) 
	{
		setIdRequest(idRequest);
		setLastStatus(lastStatus);
		setCurrentStatus(currentStatus);
		setChangeDate(changeDate);
		setIdUser(idUser);
		setObservation(observation);
	}

	// Getters y setters
	public void setIdHistory(int idHistory) 
	{
		if(idHistory <= 0) 
		{
			throw new IllegalArgumentException("The history ID must be a positive number.");
		}
		this.idHistory = idHistory;
	}

	public int getIdHistory() 
	{
		return idHistory;
	}

	public int getIdRequest() 
	{
		return idRequest;
	}

	public void setIdRequest(int idRequest) 
	{
		if(idRequest <= 0)
		{
			throw new IllegalArgumentException("The request ID must be a positive number.");
		}
		this.idRequest = idRequest;
	}

	public String getLastStatus() 
	{
		return lastStatus;
	}

	public void setLastStatus(String lastStatus) 
	{
		if(lastStatus == null || lastStatus.isEmpty())
		{
			throw new IllegalArgumentException("The last status cannot be empty or null.");
		} else if(lastStatus.length() > 20)
		{
			throw new IllegalArgumentException("The last status is longer than 20 characters.");
		}
		this.lastStatus = lastStatus;
	}

	public String getCurrentStatus() 
	{
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) 
	{
		if(currentStatus == null || currentStatus.isEmpty())
		{
			throw new IllegalArgumentException("The current status cannot be empty or null.");
		} else if(currentStatus.length() > 20)
		{
			throw new IllegalArgumentException("The current status is longer than 20 characters.");
		}
		this.currentStatus = currentStatus;
	}

	public LocalDate getChangeDate() 
	{
		return changeDate;
	}

	public void setChangeDate(LocalDate changeDate) 
	{
		this.changeDate = changeDate;
	}

	public Integer getIdUser() 
	{
		return idUser;
	}

	public void setIdUser(Integer idUser) 
	{
		if(idUser != null && idUser <= 0)
		{
			throw new IllegalArgumentException("The user ID must be a positive number.");
		}
		this.idUser = idUser;
	}

	public String getObservation() 
	{
		return observation;
	}

	public void setObservation(String observation) 
	{
		if(observation != null && observation.length() > 200)
		{
			throw new IllegalArgumentException("The observation is longer than 200 characters.");
		}
		this.observation = observation;
	}
}
