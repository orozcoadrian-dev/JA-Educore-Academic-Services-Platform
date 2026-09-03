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

	//Constructor con PK
	public Request(int idRequest, String requestIdNumber, LocalDate creationDate, String requestDescription, int idStudent, Integer idOfficial, int typeIdRequest, String requestStatus, LocalDate lastUpdateDate) 
	{
		setIdRequest(idRequest);
		setRequestIdNumber(requestIdNumber);
		setCreationDate(creationDate);
		setRequestDescription(requestDescription);
		setIdStudent(idStudent);
		setIdOfficial(idOfficial);
		setTypeIdRequest(typeIdRequest);
		setRequestStatus(requestStatus);
		setLastUpdateDate(lastUpdateDate);
	}

	//Constructor sin PK
	public Request(String requestIdNumber, LocalDate creationDate, String requestDescription, int idStudent, Integer idOfficial, int typeIdRequest, String requestStatus, LocalDate lastUpdateDate) 
	{
		setRequestIdNumber(requestIdNumber);
		setCreationDate(creationDate);
		setRequestDescription(requestDescription);
		setIdStudent(idStudent);
		setIdOfficial(idOfficial);
		setTypeIdRequest(typeIdRequest);
		setRequestStatus(requestStatus);
		setLastUpdateDate(lastUpdateDate);
	}

	// Getters y setters
	public void setIdRequest(int idRequest) 
	{
		if(idRequest <= 0) 
		{
			throw new IllegalArgumentException("The request ID must be a positive number.");
		}
		this.idRequest = idRequest;
	}

	public int getIdRequest() 
	{
		return idRequest;
	}

	public String getRequestIdNumber() 
	{
		return requestIdNumber;
	}

	public void setRequestIdNumber(String requestIdNumber) 
	{
		if(requestIdNumber == null || requestIdNumber.isEmpty())
		{
			throw new IllegalArgumentException("The request ID number cannot be empty or null.");
		} else if(requestIdNumber.length() > 20)
		{
			throw new IllegalArgumentException("The request ID number is longer than 20 characters.");
		}
		this.requestIdNumber = requestIdNumber;
	}

	public LocalDate getCreationDate() 
	{
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) 
	{
		this.creationDate = creationDate;
	}

	public String getRequestDescription() 
	{
		return requestDescription;
	}

	public void setRequestDescription(String requestDescription) 
	{
		if(requestDescription != null && requestDescription.length() > 280)
		{
			throw new IllegalArgumentException("The request description is longer than 280 characters.");
		}
		this.requestDescription = requestDescription;
	}

	public int getIdStudent() 
	{
		return idStudent;
	}

	public void setIdStudent(int idStudent) 
	{
		if(idStudent <= 0)
		{
			throw new IllegalArgumentException("The student ID must be a positive number.");
		}
		this.idStudent = idStudent;
	}

	public Integer getIdOfficial() 
	{
		return idOfficial;
	}

	public void setIdOfficial(Integer idOfficial) 
	{
		if(idOfficial != null && idOfficial <= 0)
		{
			throw new IllegalArgumentException("The official ID must be a positive number.");
		}
		this.idOfficial = idOfficial;
	}

	public int getTypeIdRequest() 
	{
		return typeIdRequest;
	}

	public void setTypeIdRequest(int typeIdRequest) 
	{
		if(typeIdRequest <= 0)
		{
			throw new IllegalArgumentException("The request type ID must be a positive number.");
		}
		this.typeIdRequest = typeIdRequest;
	}

	public String getRequestStatus() 
	{
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) 
	{
		if(requestStatus == null || requestStatus.isEmpty())
		{
			throw new IllegalArgumentException("The request status cannot be empty or null.");
		} else if(requestStatus.length() > 15)
		{
			throw new IllegalArgumentException("The request status is longer than 15 characters.");
		}
		this.requestStatus = requestStatus;
	}

	public LocalDate getLastUpdateDate() 
	{
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDate lastUpdateDate) 
	{
		this.lastUpdateDate = lastUpdateDate;
	}
}
