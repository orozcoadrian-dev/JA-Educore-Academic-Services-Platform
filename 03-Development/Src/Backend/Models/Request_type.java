package Models;

public class Request_type 
{
	private int idRequestType;
	private String requestTypeName;
	private String requestTypeDescription;
	private String documents;
	private String estimatedResponseTime;

	//Constructor con PK
	public Request_type(int idRequestType, String requestTypeName, String requestTypeDescription, String documents, String estimatedResponseTime) 
	{
		setIdRequestType(idRequestType);
		setRequestTypeName(requestTypeName);
		setRequestTypeDescription(requestTypeDescription);
		setDocuments(documents);
		setEstimatedResponseTime(estimatedResponseTime);
	}

	//Constructor sin PK
	public Request_type(String requestTypeName, String requestTypeDescription, String documents, String estimatedResponseTime) 
	{
		setRequestTypeName(requestTypeName);
		setRequestTypeDescription(requestTypeDescription);
		setDocuments(documents);
		setEstimatedResponseTime(estimatedResponseTime);
	}

	// Getters y setters
	public void setIdRequestType(int idRequestType) 
	{
		if(idRequestType <= 0) 
		{
			throw new IllegalArgumentException("The request type ID must be a positive number.");
		}
		this.idRequestType = idRequestType;
	}

	public int getIdRequestType() 
	{
		return idRequestType;
	}

	public String getRequestTypeName() 
	{
		return requestTypeName;
	}

	public void setRequestTypeName(String requestTypeName) 
	{
		if(requestTypeName == null || requestTypeName.isEmpty())
		{
			throw new IllegalArgumentException("The request type name cannot be empty or null.");
		} else if(requestTypeName.length() > 20)
		{
			throw new IllegalArgumentException("The request type name is longer than 20 characters.");
		}
		this.requestTypeName = requestTypeName;
	}

	public String getRequestTypeDescription() 
	{
		return requestTypeDescription;
	}

	public void setRequestTypeDescription(String requestTypeDescription) 
	{
		if(requestTypeDescription == null || requestTypeDescription.isEmpty())
		{
			throw new IllegalArgumentException("The request type description cannot be empty or null.");
		} else if(requestTypeDescription.length() > 280)
		{
			throw new IllegalArgumentException("The request type description is longer than 280 characters.");
		}
		this.requestTypeDescription = requestTypeDescription;
	}

	public String getDocuments() 
	{
		return documents;
	}

	public void setDocuments(String documents) 
	{
		if(documents == null || documents.isEmpty())
		{
			throw new IllegalArgumentException("The documents cannot be empty or null.");
		} else if(documents.length() > 280)
		{
			throw new IllegalArgumentException("The documents are longer than 280 characters.");
		}
		this.documents = documents;
	}

	public String getEstimatedResponseTime() 
	{
		return estimatedResponseTime;
	}

	public void setEstimatedResponseTime(String estimatedResponseTime) 
	{
		if(estimatedResponseTime != null && estimatedResponseTime.length() > 20)
		{
			throw new IllegalArgumentException("The estimated response time is longer than 20 characters.");
		}
		this.estimatedResponseTime = estimatedResponseTime;
	}
}
