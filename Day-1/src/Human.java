
public class Human {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name==null || name.trim().equals(""))
		{
			
			throw new IllegalArgumentException("Name is Mandatory");
			
		}
		this.name = name;
	}
}
