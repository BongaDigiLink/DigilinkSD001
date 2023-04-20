package model.veggies;

public class Veggie {
	private int mass;
	private String productDescription;
	private String name;
	
	public Veggie(int mass, String altname)
	{
		this.mass = mass;
		this.name = altname;
	}
	
	public Veggie()
	{
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getProductDescription()
	{
		return this.productDescription;
	}
	
	public void setProductDescription(String newDescription)
	{
		this.productDescription = newDescription;
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
