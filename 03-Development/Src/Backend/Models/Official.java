package Models;

import java.time.LocalDate;

public class Official 
{
	private int idOfficial;
	private String post;
	private String area;
	private LocalDate linkageDate;

	//Constructor con PK
	public Official(int idOfficial, String post, String area, LocalDate linkageDate) 
	{
		setIdOfficial(idOfficial);
		setPost(post);
		setArea(area);
		setLinkageDate(linkageDate);
	}

	//Constructor sin PK
	public Official(String post, String area, LocalDate linkageDate) 
	{
		setPost(post);
		setArea(area);
		setLinkageDate(linkageDate);
	}

	// Getters y setters
	public void setIdOfficial(int idOfficial) 
	{
		if(idOfficial <= 0) 
		{
			throw new IllegalArgumentException("The official ID must be a positive number.");
		}
		this.idOfficial = idOfficial;
	}

	public int getIdOfficial() 
	{
		return idOfficial;
	}

	public String getPost() 
	{
		return post;
	}

	public void setPost(String post) 
	{
		if(post == null || post.isEmpty())
		{
			throw new IllegalArgumentException("The post cannot be empty or null.");
		} else if(post.length() > 20)
		{
			throw new IllegalArgumentException("The post is longer than 20 characters.");
		}
		this.post = post;
	}

	public String getArea() 
	{
		return area;
	}

	public void setArea(String area) 
	{
		if(area == null || area.isEmpty())
		{
			throw new IllegalArgumentException("The area cannot be empty or null.");
		} else if(area.length() > 100)
		{
			throw new IllegalArgumentException("The area is longer than 100 characters.");
		}
		this.area = area;
	}

	public LocalDate getLinkageDate() 
	{
		return linkageDate;
	}

	public void setLinkageDate(LocalDate linkageDate) 
	{
		this.linkageDate = linkageDate;
	}
}
