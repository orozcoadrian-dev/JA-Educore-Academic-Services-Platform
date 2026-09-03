package Backend.Models;
import java.time.LocalDate;

public class Student 
{
	private int idStudent;
	private String studentIdNumber;
	private int semester;
	private String academicProgram;
	private String academicStatus;
	private LocalDate dateOfEntry;

	//Constructor con PK
	public Student(int idStudent, String studentIdNumber, int semester, String academicProgram, String academicStatus, LocalDate dateOfEntry) 
	{
		setIdStudent(idStudent);
		setStudentIdNumber(studentIdNumber);
		setSemester(semester);
		setAcademicProgram(academicProgram);
		setAcademicStatus(academicStatus);
		setDateOfEntry(dateOfEntry);
	}

	//Constructor sin PK
	public Student(String studentIdNumber, int semester, String academicProgram, String academicStatus, LocalDate dateOfEntry) 
	{
		setStudentIdNumber(studentIdNumber);
		setSemester(semester);
		setAcademicProgram(academicProgram);
		setAcademicStatus(academicStatus);
		setDateOfEntry(dateOfEntry);
	}

	// Getters y setters
	public void setIdStudent(int idStudent) 
	{
		if(idStudent <= 0) 
		{
			throw new IllegalArgumentException("The student ID must be a positive number.");
		}
		this.idStudent = idStudent;
	}

	public int getIdStudent() 
	{
		return idStudent;
	}

	public String getStudentIdNumber() 
	{
		return studentIdNumber;
	}

	public void setStudentIdNumber(String studentIdNumber) 
	{
		if(studentIdNumber == null || studentIdNumber.isEmpty())
		{
			throw new IllegalArgumentException("The student ID number cannot be empty or null.");
		} else if(studentIdNumber.length() > 20)
		{
			throw new IllegalArgumentException("The student ID number is longer than 20 characters.");
		}
		this.studentIdNumber = studentIdNumber;
	}

	public int getSemester() 
	{
		return semester;
	}

	public void setSemester(int semester) 
	{
		if(semester <= 0)
		{
			throw new IllegalArgumentException("The semester must be a positive number.");
		}
		this.semester = semester;
	}

	public String getAcademicProgram() 
	{
		return academicProgram;
	}

	public void setAcademicProgram(String academicProgram) 
	{
		if(academicProgram == null || academicProgram.isEmpty())
		{
			throw new IllegalArgumentException("The academic program cannot be empty or null.");
		} else if(academicProgram.length() > 100)
		{
			throw new IllegalArgumentException("The academic program is longer than 100 characters.");
		}
		this.academicProgram = academicProgram;
	}

	public String getAcademicStatus() 
	{
		return academicStatus;
	}

	public void setAcademicStatus(String academicStatus) 
	{
		if(academicStatus == null || academicStatus.isEmpty())
		{
			throw new IllegalArgumentException("The academic status cannot be empty or null.");
		} else if(academicStatus.length() > 20)
		{
			throw new IllegalArgumentException("The academic status is longer than 20 characters.");
		}
		this.academicStatus = academicStatus;
	}

	public LocalDate getDateOfEntry() 
	{
		return dateOfEntry;
	}

	public void setDateOfEntry(LocalDate dateOfEntry) 
	{
		this.dateOfEntry = dateOfEntry;
	}
}
