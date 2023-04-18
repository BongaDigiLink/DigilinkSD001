package model.veggies;

public class Carrot {
	private int mass;
	private String alternative_name;
	private String name;
	
	public Carrot(int mass, String altname)
	{
		this.mass = mass;
		this.alternative_name = altname;
	}
	
	public Carrot()
	{
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAltName()
	{
		return this.alternative_name;
	}
	
	public int getMass()
	{
		return this.mass;
	}
	
	public void addMass(int addWeight)
	{
		this.mass += addWeight;
	}
	
	public void changeName(String newName)
	{
		this.name = newName;
	}
	
}
