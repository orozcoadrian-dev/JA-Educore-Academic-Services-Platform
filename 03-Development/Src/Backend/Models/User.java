package Models;
import java.time.LocalDate;

public class User 
{
	private int idUser;
	private String firstName;
	private String secondName;
	private String firstSurname;
	private String secondSurname;
	private String documentType;
	private String documentNumber;
	private String username;
	private String userPassword;
	private String phoneNumber;
	private String userRole;
	private String userStatus;
	private LocalDate registrationDate;

    //Constructor con PK
    public User(int idUser, String firstName, String secondName, String firstSurname, String secondSurname, String documentType, String documentNumber, String username, String userPassword, String phoneNumber, String userRole, String userStatus, LocalDate registrationDate) 
    {
        setIdUser(idUser);
        setFirstName(firstName);
        setSecondName(secondName);
        setFirstSurname(firstSurname);
        setSecondSurname(secondSurname);
        setDocumentType(documentType);
        setDocumentNumber(documentNumber);
        setUsername(username);
        setUserPassword(userPassword);
        setPhoneNumber(phoneNumber);
        setUserRole(userRole);
        setUserStatus(userStatus);
        setRegistrationDate(registrationDate);
    }

    //Constructor sin PK
    public User(String firstName, String secondName, String firstSurname, String secondSurname, String documentType, String documentNumber, String username, String userPassword, String phoneNumber, String userRole, String userStatus, LocalDate registrationDate) 
    {
        setFirstName(firstName);
        setSecondName(secondName);
        setFirstSurname(firstSurname);
        setSecondSurname(secondSurname);
        setDocumentType(documentType);
        setDocumentNumber(documentNumber);
        setUsername(username);
        setUserPassword(userPassword);
        setPhoneNumber(phoneNumber);
        setUserRole(userRole);
        setUserStatus(userStatus);
        setRegistrationDate(registrationDate);
    }

    // Getters y setters
    public void setIdUser(int idUser) 
    {
        if(idUser <= 0) 
        {
            throw new IllegalArgumentException("The user ID must be a positive number.");
        }
        this.idUser = idUser;
    }

    public int getIdUser() 
    {
        return idUser;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        if(firstName == null || firstName.isEmpty())
        {
            throw new IllegalArgumentException("The first name cannot be empty or null.");
        } else if(firstName.length() < 4)
        {
            throw new IllegalArgumentException("The first name is shorter than 4 characters.");
        } else if(firstName.length() > 45)
        {
            throw new IllegalArgumentException("The first name is longer than 45 characters.");
        }
        this.firstName = firstName;
    }

    public String getSecondName() 
    {
        return secondName;
    }

    public void setSecondName(String secondName) 
    {
        if(secondName.length() < 4)
        {
            throw new IllegalArgumentException("The second name is shorter than 4 characters.");
        } else if(secondName.length() > 45)
        {
            throw new IllegalArgumentException("The second name is longer than 45 characters.");
        }
        this.secondName = secondName;
    }

    public String getFirstSurname() 
    {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) 
    {
        if(firstSurname == null || firstSurname.isEmpty())
        {
            throw new IllegalArgumentException("The first surname cannot be empty or null.");
        } else if(firstSurname.length() < 4)
        {
            throw new IllegalArgumentException("The first surname is shorter than 4 characters.");
        } else if(firstSurname.length() > 45)
        {
            throw new IllegalArgumentException("The first surname is longer than 45 characters.");
        }
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() 
    {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) 
    {
        if(secondSurname.length() < 4)
        {
            throw new IllegalArgumentException("The second surname is shorter than 4 characters.");
        } else if(secondSurname.length() > 45)
        {
            throw new IllegalArgumentException("The second surname is longer than 45 characters.");
        }
        this.secondSurname = secondSurname;
    }

    public String getDocumentType() 
    {
        return documentType;
    }

    public void setDocumentType(String documentType) 
    {
        if(documentType == null || documentType.isEmpty())
        {
            throw new IllegalArgumentException("The document type cannot be empty or null.");
        } else if(documentType.length() < 3)
        {
            throw new IllegalArgumentException("The document type is shorter than 3 characters.");
        } else if(documentType.length() > 3)
        {
            throw new IllegalArgumentException("The document type is longer than 3 characters.");
        }
        this.documentType = documentType;
    }

    public String getDocumentNumber() 
    {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) 
    {
        if(documentNumber == null || documentNumber.isEmpty())
        {
            throw new IllegalArgumentException("The document number cannot be empty or null.");
        } else if(documentNumber.length() < 6)
        {
            throw new IllegalArgumentException("The document number is shorter than 6 characters.");
        } else if(documentNumber.length() > 12)
        {
            throw new IllegalArgumentException("The document number is longer than 12 characters.");
        }
        this.documentNumber = documentNumber;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        if(username == null || username.isEmpty())
        {
            throw new IllegalArgumentException("The username cannot be empty or null.");
        } else if(username.length() < 10)
        {
            throw new IllegalArgumentException("The username is shorter than 10 characters.");
        } else if(username.length() > 70)
        {
            throw new IllegalArgumentException("The username is longer than 70 characters.");
        }
        this.username = username;
    }

    public String getUserPassword() 
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword) 
    {
        if(userPassword == null || userPassword.isEmpty())
        {
            throw new IllegalArgumentException("The password cannot be empty or null.");
        } else if(userPassword.length() < 8)
        {
            throw new IllegalArgumentException("The password is shorter than 8 characters.");
        } else if(userPassword.length() > 128)
        {
            throw new IllegalArgumentException("The password is longer than 128 characters.");
        }
        this.userPassword = userPassword;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
         if(phoneNumber.length() < 10)
        {
            throw new IllegalArgumentException("The phone number is shorter than 10 characters.");
        } else if(phoneNumber.length() > 15)
        {
            throw new IllegalArgumentException("The phone number is longer than 15 characters.");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getUserRole() 
    {
        return userRole;
    }

    public void setUserRole(String userRole) 
    {
        if(userRole == null || userRole.isEmpty())
        {
            throw new IllegalArgumentException("The user role cannot be empty or null.");
        } else if(userRole.length() < 6)
        {
            throw new IllegalArgumentException("The user role is shorter than 6 characters.");
        } else if(userRole.length() > 20)
        {
            throw new IllegalArgumentException("The user role is longer than 20 characters.");
        }
        this.userRole = userRole;
    }

    public String getUserStatus() 
    {
        return userStatus;
    }

    public void setUserStatus(String userStatus) 
    {
        if(userStatus == null || userStatus.isEmpty())
        {
            throw new IllegalArgumentException("The user status cannot be empty or null.");
        } else if(userStatus.length() < 6)
        {
            throw new IllegalArgumentException("The user status is shorter than 6 characters.");
        } else if(userStatus.length() > 20)
        {
            throw new IllegalArgumentException("The user status is longer than 20 characters.");
        }
        this.userStatus = userStatus;
    }

    public LocalDate getRegistrationDate() 
    {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) 
    {
        this.registrationDate = registrationDate;
    }
}