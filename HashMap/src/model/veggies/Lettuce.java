package model.veggies;

public class Lettuce {
	private int mass;
	private String alternative_name;
	private String name;
	
	public Lettuce(int mass, String altname)
	{
		this.mass = mass;
		this.alternative_name = altname;
	}
	
	public Lettuce()
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
